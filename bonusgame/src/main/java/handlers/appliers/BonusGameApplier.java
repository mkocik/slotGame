package handlers.appliers;

import main.BonusGameHandler;

/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class BonusGameApplier implements IWinApplier {
    private BonusGameHandler bonusGameHandler;

    public BonusGameApplier(BonusGameHandler bonusGameHandler){
        this.bonusGameHandler = bonusGameHandler;
    }

    public void applyWin() {
        bonusGameHandler.setBonusGameFlag(true);
    }
}
