import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jon on 14/06/17.
 */
public class GridTests {

    @Test
    public void Creates_A_Grid() {
        GameGrid grid = new GameGrid(5, 5);
        Assert.assertEquals(5, grid.getXSize());
        Assert.assertEquals(5, grid.getYSize());
    }

    @Test
    public void Return_Grid_Array() {
        GameGrid grid = new GameGrid(5, 5);
        boolean[][] testArray = new boolean[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                testArray[i][j] = false;
            }
        }
        Assert.assertEquals(testArray, grid.getFullArray());
        Assert.assertEquals(testArray[3][3], grid.getFullArray()[3][3]);
    }

    @Test
    public void Seed_Grid() {
        int[][] seedArray = new int[3][2];
        seedArray[0] = new int[]{2, 1};
        seedArray[1] = new int[]{3, 2};
        seedArray[2] = new int[]{4, 4};

        GameGrid grid = new GameGrid(5, 5, seedArray);

        Assert.assertEquals(true, grid.getFullArray()[2][1]);
        Assert.assertEquals(true, grid.getFullArray()[3][2]);
        Assert.assertEquals(true, grid.getFullArray()[4][4]);
        Assert.assertEquals(false, grid.getFullArray()[0][0]);

    }

    @Test
    public void Count_Number_Of_Alive_Neighbours() {
        int[][] seedArray = new int[3][2];
        seedArray[0] = new int[]{2, 1};
        seedArray[1] = new int[]{3, 2};
        seedArray[2] = new int[]{4, 4};

        GameGrid grid = new GameGrid(5, 5, seedArray);
        Assert.assertEquals(1, grid.numAliveNeighbours(2, 1));
        Assert.assertEquals(1, grid.numAliveNeighbours(3, 2));
        Assert.assertEquals(0, grid.numAliveNeighbours(4, 4));
    }

    @Test
    public void IncrementGrid_Scenario_1_1_Cell() {
        int[][] seedArray = new int[3][2];
        seedArray[0] = new int[]{2, 1};
        seedArray[1] = new int[]{3, 2};
        seedArray[2] = new int[]{4, 4};

        GameGrid grid = new GameGrid(5, 5, seedArray);

        grid.increment();
        Assert.assertEquals(false, grid.getFullArray()[4][4]);
    }

    @Test
    public void IncrementGrid_Scenario_1_Multiple_Cell() {
        int[][] seedArray = new int[3][2];
        seedArray[0] = new int[]{1, 1};
        seedArray[1] = new int[]{0, 3};
        seedArray[2] = new int[]{4, 4};

        GameGrid grid = new GameGrid(5, 5, seedArray);

        grid.increment();
        Assert.assertEquals(false, grid.getFullArray()[1][1]);
        Assert.assertEquals(false, grid.getFullArray()[0][3]);
        Assert.assertEquals(false, grid.getFullArray()[4][4]);
    }

    @Test
    public void IncrementGrid_Scenario_6_First_Increment() {
        int[][] seedArray = new int[3][2];
        seedArray[0] = new int[]{1, 2};
        seedArray[1] = new int[]{2, 2};
        seedArray[2] = new int[]{3, 2};

        GameGrid grid = new GameGrid(5, 5, seedArray);

        grid.increment();

        Assert.assertEquals(false, grid.getFullArray()[1][2]);
        Assert.assertEquals(true, grid.getFullArray()[2][2]);
        Assert.assertEquals(false, grid.getFullArray()[3][2]);
    }

    @Test
    public void IncrementGrid_Scenario_7_3_Alive_Neighbours() {
        int[][] seedArray = new int[5][2];
        seedArray[0] = new int[]{1, 2};
        seedArray[1] = new int[]{2, 2};
        seedArray[2] = new int[]{3, 2};
        seedArray[3] = new int[]{2, 3};
        seedArray[4] = new int[]{2, 1};

        GameGrid grid = new GameGrid(5, 5, seedArray);

        grid.increment();

        Assert.assertEquals(true, grid.getFullArray()[1][2]);
        Assert.assertEquals(false, grid.getFullArray()[2][2]);
        Assert.assertEquals(true, grid.getFullArray()[3][2]);
        Assert.assertEquals(true, grid.getFullArray()[2][3]);
        Assert.assertEquals(true, grid.getFullArray()[2][3]);
    }

    @Test
    public void If_Cell_Dead_And_Has_3_Alive_Neighbours_It_Becomes_Alive() {
        int[][] seedArray = new int[5][2];
        seedArray[0] = new int[]{1, 2};
        seedArray[1] = new int[]{2, 2};
        seedArray[2] = new int[]{3, 2};
        seedArray[3] = new int[]{2, 3};
        seedArray[4] = new int[]{2, 1};

        GameGrid grid = new GameGrid(5, 5, seedArray);

        grid.increment();

        Assert.assertEquals(true, grid.getFullArray()[1][1]);
        Assert.assertEquals(true, grid.getFullArray()[3][1]);
        Assert.assertEquals(true, grid.getFullArray()[1][3]);
        Assert.assertEquals(true, grid.getFullArray()[3][3]);
    }

    @Test
    public void All_Dead_Grid_Remains_Dead() {

        GameGrid grid = new GameGrid(5, 5);

        grid.increment();

        Assert.assertEquals(false, grid.getFullArray()[1][1]);
        Assert.assertEquals(false, grid.getFullArray()[3][1]);
        Assert.assertEquals(false, grid.getFullArray()[1][3]);
        Assert.assertEquals(false, grid.getFullArray()[3][3]);
    }
    @Test
    public void IncrementGrid_Scenario_6_Second_Increment() {
        int[][] seedArray = new int[3][2];
        seedArray[0] = new int[]{1, 2};
        seedArray[1] = new int[]{2, 2};
        seedArray[2] = new int[]{3, 2};

        GameGrid grid = new GameGrid(5, 5, seedArray);

        grid.increment();
        grid.increment();

        Assert.assertEquals(true, grid.getFullArray()[1][2]);
        Assert.assertEquals(true, grid.getFullArray()[2][2]);
        Assert.assertEquals(true, grid.getFullArray()[3][2]);
        Assert.assertEquals(false, grid.getFullArray()[2][1]);
        Assert.assertEquals(false, grid.getFullArray()[2][3]);
    }
     /*
    @Test
      public void Scenario_7_2_Increments() {
            int[][] seedArray = new int[5][2];
            seedArray[0] = new int[]{2, 2};
            seedArray[1] = new int[]{3, 3};
            seedArray[2] = new int[]{3, 4};
            seedArray[2] = new int[]{2, 4};
            seedArray[2] = new int[]{1, 4};

            GameGrid grid = new GameGrid(5, 5, seedArray);

            grid.increment();
            grid.increment();

            Assert.assertEquals(true, grid.getFullArray()[2][0]);
            Assert.assertEquals(true, grid.getFullArray()[3][0]);
            Assert.assertEquals(true, grid.getFullArray()[3][3]);
            Assert.assertEquals(true, grid.getFullArray()[3][4]);
            Assert.assertEquals(true, grid.getFullArray()[1][4]);
            Assert.assertEquals(false, grid.getFullArray()[2][2]);
            Assert.assertEquals(false, grid.getFullArray()[2][4]);
            Assert.assertEquals(false, grid.getFullArray()[4][3]);
        }
    */
}