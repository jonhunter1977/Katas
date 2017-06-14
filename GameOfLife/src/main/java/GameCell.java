/**
 * Created by jon on 14/06/17.
 */
public class GameCell {

    private int _state = 0; //everything is dead by default, program sets what is alive
    private int[] _coords;

    public void setState(int state){
        _state = state;
    }

    public int getState() {
        return _state;
    }

    public void setCoords(int[] coords) {
        _coords = coords;
    }

    public int[] getCoords() {
        return _coords;
    }
}
