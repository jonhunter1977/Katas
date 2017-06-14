/**
 * Created by jon on 14/06/17.
 */
public class GameGrid {

    private int xSize = 0;
    private int ySize = 0;
    private boolean[][] _grid;
    private boolean[][] _futureGrid;

    public GameGrid(int x, int y) {
        Create_Grid(x, y);
    }

    public GameGrid(int x, int y, int[][] seedArray) {
        Create_Grid(x, y);
        SeedGrid(seedArray);
    }

    private void Create_Grid(int x, int y) {
        xSize = x;
        ySize = y;
        _grid = new boolean[x][y];
        _futureGrid = new boolean[x][y];
    }

    private void SeedGrid(int[][] seedArray) {
        for (int i=0; i < seedArray.length;i++ ){ //for each coordinate in the seed array, set that element to true
           _grid[seedArray[i][0]][seedArray[i][1]] = true;
        }
    }

    public int getXSize() {
        return xSize;
    }

    public int getYSize() {
        return ySize;
    }

    public boolean[][] getFullArray() {
        return _grid;
    }

    public void increment() {
        gridCopyGridToFuture(); //copy grid into future grid avoiding copying just pointer
        int aliveNeighbours=0;
        for (int x = 0; x < _grid.length; x++) {
            for (int y = 0; y < _grid[0].length; y++) {
                if(_grid[x][y] == true) { //If cell is alive;
                    aliveNeighbours = numAliveNeighbours(x,y);
                    if(aliveNeighbours < 2 || aliveNeighbours > 3) _futureGrid[x][y] = false;
                }
                if (_grid[x][y] == false){
                    if (numAliveNeighbours(x,y) ==3){ _futureGrid[x][y] = true;
                    }
                }
            }
        }
        gridCopyFutureToGrid();
        //Never do this !! _grid = _futureGrid;
    }

    private void gridCopyFutureToGrid() {
        for (int x = 0; x < _futureGrid.length; x++) {
            for (int y = 0; y < _futureGrid[0].length; y++) {
                _grid[x][y] = _futureGrid[x][y];
            }
        }
    }

    private void gridCopyGridToFuture() {//copy grid into future grid avoiding copying just pointer
        for (int x = 0; x < _grid.length; x++) {
            for (int y = 0; y < _grid[0].length; y++) {
                _futureGrid[x][y] = _grid[x][y];
            }
        }
    }

    public int numAliveNeighbours(int x, int y) {
        int numAliveNeighbours=0;
        for (int i = x-1; i <= x+1; i++){
            for (int j = y-1; j <= y+1; j++){
                if (i==x && j==y) {
                    continue;
                }
                if (i > xSize-1 || j > ySize-1 || i < 0 || j < 0) {
                    continue;
                }
                if (_grid[i][j] == true) {
                    numAliveNeighbours++;
                }
            }
        }
        return numAliveNeighbours;
    }

    public void print() {
        for (int x = 0; x < _grid.length; x++) {
            for (int y = 0; y < _grid[0].length; y++) {
                if (_grid[x][y] == true) System.out.print("X");
                if (_grid[x][y] == false) System.out.print("0");
                if (y == _grid[0].length - 1) System.out.println();
            }
        }

    }
}
