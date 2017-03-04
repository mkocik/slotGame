package main;

import accounts.Bet;
import accounts.Player;
import accounts.Wallet;
import handlers.WinHandlersManager;

import java.math.BigInteger;

/**
 * Created by mkocik on 09.02.2017.
 */
public class SingleSpinMain {

    public static void main ( String [] arguments ) {

        Player player = new Player(0, new Bet(new BigInteger("10")));
        Wallet wallet = new Wallet();

        SlotGameHandler slotGameHandler = new SlotGameHandler(player, wallet, new WinHandlersManager());
        slotGameHandler.play();

        System.out.print(wallet);
    }
}
