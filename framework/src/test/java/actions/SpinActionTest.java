package actions;

import handlers.WinHandlersManager;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class SpinActionTest {

    @Test
    public void shouldPerformSpin() {
        WinHandlersManager winHandlersManager = mock(WinHandlersManager.class);

        SpinAction.performSpin(winHandlersManager);

        verify(winHandlersManager, times(1)).handleWinSituations();
    }
}
