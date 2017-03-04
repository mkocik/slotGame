package actions;

import accounts.Bet;
import accounts.Player;
import accounts.Wallet;
import handlers.WinHandlersManager;
import org.junit.Test;

import java.math.BigInteger;

import static org.mockito.Mockito.*;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class ChargeableSpinActionTest {

    @Test
    public void shouldPerformSpin() {
        WinHandlersManager winHandlersManager = mock(WinHandlersManager.class);
        Player player = mock(Player.class);
        Bet bet = mock(Bet.class);
        Wallet wallet = mock(Wallet.class);

        when(player.getBet()).thenReturn(bet);
        when(bet.getCoinsPerBet()).thenReturn(new BigInteger("10"));

        ChargableSpinAction.performSpin(winHandlersManager, player, wallet);

        verify(wallet, times(1)).chargeWallet(any());
        verify(player, times(1)).getBet();
        verify(bet, times(1)).getCoinsPerBet();
    }
}
