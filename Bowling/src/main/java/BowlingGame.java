import java.util.ArrayList;

/**
 * Created by jon on 13/06/17.
 */
public class BowlingGame {

    private ArrayList<Frame> _frames = new ArrayList<>();
    private IScoreCalculator _scoreCalculator;

    public BowlingGame(IScoreCalculator scoreCalculator) {
        _scoreCalculator = scoreCalculator;
    }

    public void addFrame(ArrayList<Bowl> bowls) {
        Frame frame = new Frame(bowls);
        _frames.add(frame);
    }

    public int scoreGame() {
        return _scoreCalculator.score(_frames);
    }

}
