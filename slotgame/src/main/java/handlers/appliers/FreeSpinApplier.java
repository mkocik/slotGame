package handlers.appliers;

import actions.SpinAction;
import handlers.WinHandlersManager;

/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class FreeSpinApplier implements IWinApplier {
    private WinHandlersManager winHandlersManager;

    public FreeSpinApplier(WinHandlersManager winHandlersManager){
        this.winHandlersManager = winHandlersManager;
    }

    public void applyWin() {
        SpinAction.performSpin(winHandlersManager);
    }
}
