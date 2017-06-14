import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jon on 13/06/17.
 */
public class BowlTests {

    @Test
    public void Bowl_Score_Can_Be_Retrieved() {
        Bowl bowl = new Bowl(4);
        Assert.assertEquals(4, bowl.get_total());
    }

}
