package handlers;

import handlers.appliers.IWinApplier;
import handlers.checkers.IWinChecker;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class WinHandlerTest {

    @Test
    public void shouldHandleWinSituation() {
        IWinChecker winChecker = mock(IWinChecker.class);
        IWinApplier winApplier = mock(IWinApplier.class);

        when(winChecker.isWin()).thenReturn(true);

        WinHandler winHandler = new WinHandler(winChecker, winApplier);
        winHandler.handleWinSituation();

        verify(winApplier, times(1)).applyWin();
    }
}
