package main;

import accounts.Bet;
import accounts.Player;
import accounts.Wallet;
import bonus.box.Basket;
import bonus.box.Box;
import bonus.inputHandler.AbstractInputHandler;
import bonus.inputHandler.InputHandlerFactory;
import handlers.WinHandlersManager;

import java.math.BigInteger;

/**
 * Created by mkocik on 09.02.2017.
 */
public class SingleSpinMain {
    public static void main ( String [] arguments ) {

        Player player = new Player(0, new Bet(new BigInteger("10")));
        Wallet wallet = new Wallet();
        BonusGameHandler bonusGameHandler = new BonusGameHandler(player, wallet, new WinHandlersManager());

        bonusGameHandler.play();

        /* following lines are extracted from BonusGameHandler.finishRound (used in simulation)s
         * they give direct access to inputHandler and let us to get input from different sources */
        if(bonusGameHandler.isBonusGame()) {
            Basket basket = new Basket();
            AbstractInputHandler inputHandler = new InputHandlerFactory().createAutoInputHandler(0, basket.getBoxesSize() - 1);

            Box pickedBox;

            do {
                pickedBox = basket.getBox(inputHandler.getPlayerIntegerInput());
                wallet.addCoinsToBalance(new BigInteger(pickedBox.getValue().toString()));

            } while(!pickedBox.isBlocker());

            bonusGameHandler.setBonusGameFlag(false);
        }

        System.out.print(wallet);
    }
}
