package bonus.inputHandler;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class AutoInputHandler extends AbstractInputHandler {
    private int stepCounter;

    public AutoInputHandler(int minValue, int maxValue) {
        super(minValue, maxValue);
        stepCounter = minValue - 1;
    }

    @Override
    public int getPlayerIntegerInput() {
        stepCounter++;

        if(stepCounter <= maxValue){
            return stepCounter;
        }

        throw new IndexOutOfBoundsException("Player Input out of bounds");
    }
}
