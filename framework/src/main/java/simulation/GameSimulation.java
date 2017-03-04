package simulation;

import accounts.Player;
import accounts.Wallet;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
class GameSimulation {
    private static final Integer ROUNDS_AMOUNT = 1000000;
    private GameHandler gameHandler;

    GameSimulation(GameHandler gameHandler) {
        this.gameHandler = gameHandler;
    }

    void start() {
        printStartStatistics();

        for(int i=0; i<ROUNDS_AMOUNT; i++){
            this.gameHandler.act();
        }

        printEndStatistics();
    }



    private void printStartStatistics() {
        System.out.println("Simulation has started, your player data: ");
        System.out.println(this.gameHandler.getPlayer().toString());
    }

    private void printEndStatistics() {
        System.out.println();
        Player player = this.gameHandler.getPlayer();
        Wallet wallet = this.gameHandler.getWallet();

        System.out.println("Simulation has ended");
        System.out.println("Amount of rounds played:" + ROUNDS_AMOUNT);
        System.out.println("Bet:" + player.getBet().getCoinsPerBet());
        System.out.println(wallet.toString());

        BigInteger totalBet = player.getBet().getCoinsPerBet().multiply(new BigInteger(ROUNDS_AMOUNT.toString()));
        BigInteger totalWin = wallet.getCoinsBalance().add(totalBet);
        System.out.println("Total bet: " + totalBet);
        System.out.println("Total win: " + totalWin);

        BigDecimal RTP = new BigDecimal(totalWin).divide(new BigDecimal(totalBet), MathContext.DECIMAL128);
        System.out.println("RTP: " + RTP);
    }
}
