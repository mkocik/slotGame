package simulation;

import accounts.Bet;
import accounts.Player;
import accounts.Wallet;
import handlers.WinHandlersManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by maciej.kocik on 2/9/2017.
 */
public class GameHandlerTest {
    private Player player;
    private Wallet wallet;
    private WinHandlersManager winHandlersManager;
    private GameHandler gameHandler;

    @Before
    public void prepareGameHandlerForTests() {
        player = mock(Player.class);
        wallet = mock(Wallet.class);
        winHandlersManager = mock(WinHandlersManager.class);

        gameHandler = new GameHandler(player, wallet, winHandlersManager);
    }

    @Test
    public void shouldProperlyInitializeGameHandler() {
        Assert.assertEquals(player, gameHandler.getPlayer());
        Assert.assertEquals(wallet, gameHandler.getWallet());
    }

    @Test
    public void shouldPlay() {
        Bet bet = mock(Bet.class);
        when(player.getBet()).thenReturn(bet);
        when(bet.getCoinsPerBet()).thenReturn(new BigInteger("10"));

        gameHandler.play();

        verify(winHandlersManager, times(1)).handleWinSituations();
    }
}
