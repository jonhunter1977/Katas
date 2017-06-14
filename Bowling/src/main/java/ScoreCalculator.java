import java.util.ArrayList;

/**
 * Created by jon on 13/06/17.
 */
public class ScoreCalculator implements IScoreCalculator {

    public static final int TOTAL_PINS = 10;

    private void scoreStrikeAndSpareFrames(ArrayList<Frame> frames) {

       Frame lastFrame = null;

        for(Frame frame : frames) {

            if(lastFrame != null) {

                if(lastFrame.is_isSpare()) {
                    lastFrame.set_frameScore(TOTAL_PINS + frame.get_bowls().get(0).get_total());
                }

                if(lastFrame.is_isStrike()) {
                    if(frame.is_isStrike()) {
                        int currentIndex = frames.indexOf(frame);
                        int additionalScore = frames.get(currentIndex + 1).get_bowls().get(0).get_total();
                        lastFrame.set_frameScore(TOTAL_PINS + TOTAL_PINS + additionalScore);
                    } else {
                        lastFrame.set_frameScore(TOTAL_PINS + frame.get_frameScore());
                    }

                }

            }

            lastFrame = frame;
        }
    }

    @Override
    public int score(ArrayList<Frame> frames) {

        scoreStrikeAndSpareFrames(frames);

        int totalScore = frames.stream().mapToInt(i -> i.get_frameScore()).sum();

        return totalScore;
    }
}
