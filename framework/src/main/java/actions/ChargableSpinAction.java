package actions;

import accounts.Player;
import accounts.Wallet;
import handlers.WinHandlersManager;

/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class ChargableSpinAction {

    public static void performSpin(WinHandlersManager winHandlersManager, Player player, Wallet wallet) {
        wallet.chargeWallet(player.getBet().getCoinsPerBet());
        SpinAction.performSpin(winHandlersManager);
    }
}
