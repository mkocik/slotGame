package simulation;

import accounts.Player;
import accounts.Wallet;
import actions.ChargableSpinAction;
import handlers.WinHandlersManager;

/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class GameHandler {
    protected Player player;
    protected Wallet wallet;
    protected WinHandlersManager winHandlersManager;

    public GameHandler(Player player, Wallet wallet, WinHandlersManager winHandlersManager) {
        this.player = player;
        this.wallet = wallet;
        this.winHandlersManager = winHandlersManager;
    }

    public void finishRound() {}

    public Player getPlayer() {
        return this.player;
    }
    public Wallet getWallet() {
        return this.wallet;
    }

    public void play() {
        ChargableSpinAction.performSpin(winHandlersManager, player, wallet);
    }
    public void act() { this.play(); }
}
