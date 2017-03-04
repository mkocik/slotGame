package bonus.inputHandler;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public abstract class AbstractInputHandler {
    protected int minValue;
    protected int maxValue;

    public AbstractInputHandler(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public abstract int getPlayerIntegerInput();
}
