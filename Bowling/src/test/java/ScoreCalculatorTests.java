import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by jon on 13/06/17.
 */

public class ScoreCalculatorTests {

    private BowlingGame _bowlingGame;

    @Before
    public void setup() {
        _bowlingGame = new BowlingGame(new ScoreCalculator());
    }

    @Test
    public void It_Calculates_The_Score_Correctly_For_1_Frame() {
        ArrayList<Bowl> bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(1));
        bowls.add(1, new Bowl(4));
        _bowlingGame.addFrame(bowls);

        int actualScore = _bowlingGame.scoreGame();
        Assert.assertEquals(5, actualScore);
    }

    @Test
    public void It_Calculates_The_Score_Correctly_For_2_Frames() {
        ArrayList<Bowl> bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(1));
        bowls.add(1, new Bowl(4));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(4));
        bowls.add(1, new Bowl(5));
        _bowlingGame.addFrame(bowls);

        int actualScore = _bowlingGame.scoreGame();
        Assert.assertEquals(14, actualScore);
    }

    @Test
    public void It_Calculates_The_Score_Correctly_Before_A_Spare_Score_Added() {
        ArrayList<Bowl> bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(1));
        bowls.add(1, new Bowl(4));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(4));
        bowls.add(1, new Bowl(5));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(6));
        bowls.add(1, new Bowl(4));
        _bowlingGame.addFrame(bowls);

        int actualScore = _bowlingGame.scoreGame();
        Assert.assertEquals(14, actualScore);
    }

    @Test
    public void It_Calculates_The_Score_Correctly_After_A_Spare() {
        ArrayList<Bowl> bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(4));
        bowls.add(1, new Bowl(5));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(6));
        bowls.add(1, new Bowl(4));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(8));
        bowls.add(1, new Bowl(1));
        _bowlingGame.addFrame(bowls);

        int actualScore = _bowlingGame.scoreGame();
        Assert.assertEquals(36, actualScore);
    }

    @Test
    public void It_Calculates_The_Score_Correctly_Before_A_Strike_Score_Added() {
        ArrayList<Bowl> bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(1));
        bowls.add(1, new Bowl(4));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(4));
        bowls.add(1, new Bowl(5));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(10));
        _bowlingGame.addFrame(bowls);

        int actualScore = _bowlingGame.scoreGame();
        Assert.assertEquals(14, actualScore);
    }

    @Test
    public void It_Calculates_The_Score_Correctly_After_A_Strike() {
        ArrayList<Bowl> bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(4));
        bowls.add(1, new Bowl(5));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(10));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(8));
        bowls.add(1, new Bowl(1));
        _bowlingGame.addFrame(bowls);

        int actualScore = _bowlingGame.scoreGame();
        Assert.assertEquals(37, actualScore);
    }

    @Test
    public void It_Calculates_The_Score_Correctly_If_2_Spares_In_A_Row() {
        ArrayList<Bowl> bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(4));
        bowls.add(1, new Bowl(5));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(6));
        bowls.add(1, new Bowl(4));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(9));
        bowls.add(1, new Bowl(1));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(8));
        bowls.add(1, new Bowl(1));
        _bowlingGame.addFrame(bowls);

        int actualScore = _bowlingGame.scoreGame();
        Assert.assertEquals(55, actualScore);
    }

    @Test
    public void It_Calculates_The_Score_Correctly_If_2_Strikes_In_A_Row() {
        ArrayList<Bowl> bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(4));
        bowls.add(1, new Bowl(5));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(10));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(10));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(7));
        bowls.add(1, new Bowl(2));
        _bowlingGame.addFrame(bowls);

        int actualScore = _bowlingGame.scoreGame();
        Assert.assertEquals(64, actualScore);
    }

    @Test
    public void It_Calculates_The_Score_Correctly_If_3_Strikes_In_A_Row() {
        ArrayList<Bowl> bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(4));
        bowls.add(1, new Bowl(5));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(10));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(10));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(10));
        _bowlingGame.addFrame(bowls);

        bowls = new ArrayList<Bowl>();
        bowls.add(0, new Bowl(7));
        bowls.add(1, new Bowl(2));
        _bowlingGame.addFrame(bowls);

        int actualScore = _bowlingGame.scoreGame();
        Assert.assertEquals(94, actualScore);
    }
}
