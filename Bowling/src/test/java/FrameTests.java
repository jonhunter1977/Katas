import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jon on 13/06/17.
 */
public class FrameTests {

    private Frame _frame;

    @Test
    public void Bowl_2_Gets_Added_To_The_Frame() {
        ArrayList<Bowl> bowls = new ArrayList<>();
        bowls.add(new Bowl(1));
        bowls.add(new Bowl(4));
        _frame = new Frame(bowls);
        Assert.assertEquals(_frame.get_bowls().size(), 2);
    }

    @Test
    public void Frame_Is_Determined_As_A_Spare() {
        ArrayList<Bowl> bowls = new ArrayList<>();
        bowls.add(new Bowl(1));
        bowls.add(new Bowl(9));
        _frame = new Frame(bowls);
        Assert.assertEquals(true, _frame.is_isSpare());
    }

    @Test
    public void Frame_Is_Determined_As_A_Strike() {
        ArrayList<Bowl> bowls = new ArrayList<>();
        bowls.add(new Bowl(10));
        _frame = new Frame(bowls);
        Assert.assertEquals(true, _frame.is_isStrike());
    }


}
