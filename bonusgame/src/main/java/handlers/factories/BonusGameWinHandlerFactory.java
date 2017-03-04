package handlers.factories;

import handlers.WinHandler;
import handlers.appliers.BonusGameApplier;
import handlers.appliers.IWinApplier;
import handlers.checkers.IWinChecker;
import handlers.checkers.WinChecker;
import main.BonusGameHandler;

/**
 * Created by maciej.kocik on 2/9/2017.
 */
public class BonusGameWinHandlerFactory {
    private static final double BONUS_GAME_CHANCE = 0.1;

    public WinHandler createBonusGameHandler(BonusGameHandler bonusGameHandler) {
        IWinChecker bonusGameChecker = new WinChecker(BONUS_GAME_CHANCE);
        IWinApplier bonusGameApplier = new BonusGameApplier(bonusGameHandler);

        return new WinHandler(bonusGameChecker, bonusGameApplier);
    }
}
