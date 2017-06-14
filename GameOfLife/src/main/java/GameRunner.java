import java.util.concurrent.TimeUnit;

/**
 * Created by jon on 14/06/17.
 */
public class GameRunner {

    public static void main(String[] args) throws InterruptedException {

        int[][] seedArray = new int[3][2];
        seedArray[0] = new int[]{1, 2};
        seedArray[1] = new int[]{2, 2};
        seedArray[2] = new int[]{3, 2};

        GameGrid grid = new GameGrid(5, 5, seedArray);

        while (true) {
            grid.print();
            grid.increment();
            TimeUnit.SECONDS.sleep(1);
        }
    }

}
