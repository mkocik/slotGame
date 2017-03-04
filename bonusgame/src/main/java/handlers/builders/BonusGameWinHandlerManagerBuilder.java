package handlers.builders;

import handlers.WinHandlersManager;
import handlers.factories.BonusGameWinHandlerFactory;
import main.BonusGameHandler;

/**
 * Created by maciej.kocik on 2/9/2017.
 */
public class BonusGameWinHandlerManagerBuilder implements IWinHandlerManagerBuilder {
    private WinHandlersManager winHandlersManager;
    private BonusGameWinHandlerFactory bonusGameWinHandlerFactory;
    private BonusGameHandler bonusGameHandler;

    public BonusGameWinHandlerManagerBuilder(WinHandlersManager winHandlersManager, BonusGameWinHandlerFactory bonusGameWinHandlerFactory, BonusGameHandler bonusGameHandler) {
        this.winHandlersManager = winHandlersManager;
        this.bonusGameWinHandlerFactory = bonusGameWinHandlerFactory;
        this.bonusGameHandler = bonusGameHandler;
    }

    @Override
    public void build() {
        winHandlersManager.registerWinHandler(bonusGameWinHandlerFactory.createBonusGameHandler(bonusGameHandler));
    }
}
