package handlers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class WinHandlersManagerTest {
    WinHandlersManager winHandlersManager;
    IWinHandler winHandler;

    @Before
    public void prepareWinHandlersManagerTests() {
        winHandler = mock(IWinHandler.class);

        winHandlersManager = new WinHandlersManager();
        winHandlersManager.registerWinHandler(winHandler);
    }

    @Test
    public void shouldRegisterWinHandler() {
        assertEquals(true, winHandlersManager.getWinHandlers().contains(winHandler));
        assertEquals(1, winHandlersManager.getWinHandlers().size());
    }

    @Test
    public void shouldHandleWinSituations() {
        winHandlersManager.handleWinSituations();

        verify(winHandler, times(1)).handleWinSituation();
    }
}
