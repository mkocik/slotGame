package handlers.builders;

import handlers.WinHandlersManager;
import handlers.factories.BonusGameWinHandlerFactory;
import main.BonusGameHandler;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by mkocik on 09.02.2017.
 */
public class BonusGameWinHandlerManagerBuilderTest {

    @Test
    public void shouldBuild() {
        WinHandlersManager winHandlersManager = mock(WinHandlersManager.class);
        BonusGameWinHandlerFactory bonusGameWinHandlerFactory = mock(BonusGameWinHandlerFactory.class);
        BonusGameHandler bonusGameHandler = mock(BonusGameHandler.class);

        BonusGameWinHandlerManagerBuilder builder = new BonusGameWinHandlerManagerBuilder(winHandlersManager, bonusGameWinHandlerFactory, bonusGameHandler);
        builder.build();

        verify(winHandlersManager, times(1)).registerWinHandler(any());
        verify(bonusGameWinHandlerFactory, times(1)).createBonusGameHandler(bonusGameHandler);
    }
}
