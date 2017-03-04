package actions;

import handlers.WinHandlersManager;

/**
 * Created by maciej.kocik on 2/6/2017.
 */
public class SpinAction {

    public static void performSpin(WinHandlersManager winHandlersManager) {
        winHandlersManager.handleWinSituations();
    }
}
