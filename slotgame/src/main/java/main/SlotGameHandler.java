package main;

import accounts.Player;
import accounts.Wallet;
import handlers.WinHandlersManager;
import handlers.builders.SlotWinHandlerManagerBuilder;
import handlers.factories.SlotWinHandlerFactory;
import simulation.GameHandler;

/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class SlotGameHandler extends GameHandler {


    public SlotGameHandler(Player player, Wallet wallet, WinHandlersManager winHandlersManager) {
        super(player, wallet, winHandlersManager);

        SlotWinHandlerManagerBuilder slotWinHandlerManagerBuilder = new SlotWinHandlerManagerBuilder(winHandlersManager, new SlotWinHandlerFactory(wallet));
        slotWinHandlerManagerBuilder.build();
    }
}
