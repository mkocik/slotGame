package handlers.appliers;

import handlers.WinHandlersManager;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class FreeSpinApplierTest {

    @Test
    public void shouldApplyWin() {
        WinHandlersManager winHandlersManager = mock(WinHandlersManager.class);

        FreeSpinApplier freeSpinApplier = new FreeSpinApplier(winHandlersManager);
        freeSpinApplier.applyWin();

        verify(winHandlersManager, times(1)).handleWinSituations();
    }
}
