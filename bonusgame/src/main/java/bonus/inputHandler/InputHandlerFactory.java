package bonus.inputHandler;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class InputHandlerFactory {
    public AbstractInputHandler createConsoleInputHandler(int minInputValue, int maxInputValue) {
        return new ConsoleInputHandler(minInputValue, maxInputValue);
    }

    public AbstractInputHandler createAutoInputHandler(int minInputValue, int maxInputValue) {
        return new AutoInputHandler(minInputValue, maxInputValue);
    }

    public AbstractInputHandler createGUIInputHandler(int minInputValue, int maxInputValue) {
        return new AutoInputHandler(minInputValue, maxInputValue);
    }
}
