import java.util.ArrayList;

/**
 * Created by jon on 13/06/17.
 */
public class Frame {

    private ArrayList<Bowl> _bowls;
    private int _frameScore;
    private boolean _isSpare;
    private boolean _isStrike;

    public Frame(ArrayList<Bowl> bowls) {
        _bowls = bowls;
        determineFrameType();
        score();
    }

    public ArrayList<Bowl> get_bowls() {
        return _bowls;
    }

    public void set_frameScore(int _frameScore) {
        this._frameScore = _frameScore;
    }

    public boolean is_isSpare() {
        return _isSpare;
    }

    public boolean is_isStrike() {
        return _isStrike;
    }

    public int get_frameScore() {
        return _frameScore;
    }

    public void determineFrameType() {
        if(_bowls.get(0).get_total() == 10){
            _isStrike = true;
            return;
        }

        if(_bowls.get(0).get_total() < 10) {
            if(_bowls.get(0).get_total() + _bowls.get(1).get_total() == 10) {
                _isSpare = true;
                return;
            }
        }
    }

    public void score() {

        if(is_isSpare() || is_isStrike()) return;

        for(Bowl b : _bowls) {
            _frameScore += b.get_total();
        }
    }
}
