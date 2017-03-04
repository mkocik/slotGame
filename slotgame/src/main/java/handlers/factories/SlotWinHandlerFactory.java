package handlers.factories;

import accounts.Wallet;
import handlers.WinHandler;
import handlers.WinHandlersManager;
import handlers.appliers.CoinWinApplier;
import handlers.appliers.FreeSpinApplier;
import handlers.appliers.IWinApplier;
import handlers.checkers.IWinChecker;
import handlers.checkers.WinChecker;

/**
 * Created by maciej.kocik on 2/9/2017.
 */
public class SlotWinHandlerFactory {
    private static final double COIN_WIN_CHANCE = 0.3;
    private static final double FREE_SPIN_CHANCE = 0.1;

    private Wallet wallet;

    public SlotWinHandlerFactory(Wallet wallet) {
        this.wallet = wallet;
    }

    public WinHandler createMultiplyWinHandler() {
        IWinChecker multiplyWinChecker = new WinChecker(COIN_WIN_CHANCE);
        IWinApplier multiplyBetApplier = new CoinWinApplier(wallet);

        return new WinHandler(multiplyWinChecker, multiplyBetApplier);
    }

    public WinHandler createFreeSpinHandler(WinHandlersManager winHandlersManager) {
        IWinChecker freeSpinWinChecker = new WinChecker(FREE_SPIN_CHANCE);
        IWinApplier freeSpinApplier = new FreeSpinApplier(winHandlersManager);

        return new WinHandler(freeSpinWinChecker, freeSpinApplier);
    }
}
