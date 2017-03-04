package main;

import accounts.Player;
import accounts.Wallet;
import bonus.box.Basket;
import bonus.box.Box;
import bonus.inputHandler.AbstractInputHandler;
import bonus.inputHandler.InputHandlerFactory;
import handlers.WinHandlersManager;
import handlers.builders.BonusGameWinHandlerManagerBuilder;
import handlers.factories.BonusGameWinHandlerFactory;
import simulation.GameHandler;

import java.math.BigInteger;


/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class BonusGameHandler extends GameHandler {
    private boolean isBonusGame;

    public BonusGameHandler(Player player, Wallet wallet, WinHandlersManager winHandlersManager) {
        super(player, wallet, winHandlersManager);
        isBonusGame = false;

        BonusGameWinHandlerManagerBuilder slotWinHandlerManagerBuilder = new BonusGameWinHandlerManagerBuilder(winHandlersManager, new BonusGameWinHandlerFactory(), this);
        slotWinHandlerManagerBuilder.build();
    }

    @Override
    public void act() {
        if(!isBonusGame) {
            super.act();
            finishRound();
        }
    }

    @Override
    public void finishRound() {
        if(isBonusGame){
            Basket basket = new Basket();
            AbstractInputHandler inputHandler = new InputHandlerFactory().createAutoInputHandler(0, basket.getBoxesSize() - 1);

            Box pickedBox;

            do {
                pickedBox = basket.getBox(inputHandler.getPlayerIntegerInput());
                wallet.addCoinsToBalance(new BigInteger(pickedBox.getValue().toString()));

            } while(!pickedBox.isBlocker());

            setBonusGameFlag(false);
        }
    }

    public void setBonusGameFlag(boolean isBonusGame) {
        this.isBonusGame = isBonusGame;
    }

    public boolean isBonusGame() {
        return this.isBonusGame;
    }
}
