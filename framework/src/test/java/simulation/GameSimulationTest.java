package simulation;

import accounts.Bet;
import accounts.Player;
import accounts.Wallet;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.mockito.Mockito.*;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class GameSimulationTest {
    private GameHandler gameHandler;
    private GameSimulation gameSimulation;

    @Before
    public void prepareGameSimulationTest() {
        gameHandler = mock(GameHandler.class);

        gameSimulation = new GameSimulation(gameHandler);
    }

    @Test
    public void shouldPlayProperRoundsAmount() {
        Player player = mock(Player.class);
        Bet bet = mock(Bet.class);
        Wallet wallet = mock(Wallet.class);

        when(gameHandler.getPlayer()).thenReturn(player);
        when(gameHandler.getWallet()).thenReturn(wallet);
        when(player.getBet()).thenReturn(bet);
        when(bet.getCoinsPerBet()).thenReturn(new BigInteger("10"));
        when(wallet.toString()).thenReturn("wallet");
        when(wallet.getCoinsBalance()).thenReturn(new BigInteger("10"));

        gameSimulation.start();

        verify(gameHandler, times(1000000)).play();
    }
}
