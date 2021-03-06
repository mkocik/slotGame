package simulation;

import accounts.Bet;
import accounts.Player;
import accounts.Wallet;
import handlers.WinHandlersManager;
import main.SlotGameHandler;

import java.math.BigInteger;

/**
 * Created by maciej.kocik on 2/6/2017.
 */
public class SimulationMain {

    public static void main ( String [] arguments ) {

        Player player = new Player(0, new Bet(new BigInteger("10")));

        GameSimulation gameSimulation = new GameSimulation(new SlotGameHandler(player, new Wallet(), new WinHandlersManager()));
        gameSimulation.start();
    }
}
