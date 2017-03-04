package handlers.builders;

import handlers.WinHandlersManager;
import handlers.factories.SlotWinHandlerFactory;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by maciej.kocik on 2/9/2017.
 */
public class SlotWinHandlerManagerBuilderTest {

    @Test
    public void shouldBuild() {
        WinHandlersManager winHandlersManager = mock(WinHandlersManager.class);
        SlotWinHandlerFactory slotWinHandlerFactory = mock(SlotWinHandlerFactory.class);

        SlotWinHandlerManagerBuilder slotWinHandlerManagerBuilder = new SlotWinHandlerManagerBuilder(winHandlersManager, slotWinHandlerFactory);
        slotWinHandlerManagerBuilder.build();

        verify(winHandlersManager, times(2)).registerWinHandler(any());
    }
}
