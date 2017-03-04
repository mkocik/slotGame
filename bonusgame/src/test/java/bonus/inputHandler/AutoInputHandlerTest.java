package bonus.inputHandler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by maciej.kocik on 2/9/2017.
 */
public class AutoInputHandlerTest {

    @Test
    public void shouldGetProperPlayerIntegerInput() {
        AutoInputHandler autoInputHandler = new AutoInputHandler(0, 3);

        assertEquals(0, autoInputHandler.getPlayerIntegerInput());
        assertEquals(1, autoInputHandler.getPlayerIntegerInput());
        assertEquals(2, autoInputHandler.getPlayerIntegerInput());
        assertEquals(3, autoInputHandler.getPlayerIntegerInput());
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void shouldThrowException() {
        AutoInputHandler autoInputHandler = new AutoInputHandler(0, 0);

        autoInputHandler.getPlayerIntegerInput();
        autoInputHandler.getPlayerIntegerInput();
    }
}
