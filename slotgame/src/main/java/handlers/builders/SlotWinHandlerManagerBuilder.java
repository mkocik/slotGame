package handlers.builders;

import handlers.WinHandlersManager;
import handlers.factories.SlotWinHandlerFactory;

/**
 * Created by maciej.kocik on 2/9/2017.
 */
public class SlotWinHandlerManagerBuilder implements IWinHandlerManagerBuilder {
    private WinHandlersManager winHandlersManager;
    private SlotWinHandlerFactory slotWinHandlerFactory;

    public SlotWinHandlerManagerBuilder(WinHandlersManager winHandlersManager, SlotWinHandlerFactory slotWinHandlerFactory) {
        this.winHandlersManager = winHandlersManager;
        this.slotWinHandlerFactory = slotWinHandlerFactory;
    }

    @Override
    public void build() {
        winHandlersManager.registerWinHandler(slotWinHandlerFactory.createMultiplyWinHandler());
        winHandlersManager.registerWinHandler(slotWinHandlerFactory.createFreeSpinHandler(winHandlersManager));
    }
}
