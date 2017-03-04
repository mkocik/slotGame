package handlers;

import accounts.Player;
import handlers.appliers.IWinApplier;
import handlers.checkers.IWinChecker;

/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class WinHandler implements IWinHandler{
    private IWinChecker winChecker;
    private IWinApplier winApplier;

    public WinHandler(IWinChecker winChecker, IWinApplier winApplier){
        this.winChecker = winChecker;
        this.winApplier = winApplier;
    }

    public void handleWinSituation() {
        if(winChecker.isWin()){
            winApplier.applyWin();
        }
    }
}
