import javafx.scene.control.Cell;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jon on 14/06/17.
 */
public class CellTests {

    //1 = alive
    //0 = dead

    @Test
    public void Create_A_Live_Cell()
    {
        GameCell cell = new GameCell();
        cell.setState(1);
        Assert.assertEquals(1, cell.getState());
    }
    @Test
    public void Create_A_Dead_Cell()
    {
        GameCell cell = new GameCell();
        cell.setState(0);
        Assert.assertEquals(0, cell.getState());
    }
    @Test
    public void Set_Cell_Coords()
    {
        GameCell cell = new GameCell();
        int[] coords = new int[2];
        coords[0]=0;
        coords[1]=0;
        cell.setCoords(coords);
        Assert.assertEquals(coords, cell.getCoords());
    }
}
