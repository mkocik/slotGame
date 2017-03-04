package handlers.appliers;

import accounts.Bet;
import accounts.Player;
import accounts.Wallet;
import org.junit.Test;

import java.math.BigInteger;

import static org.mockito.Mockito.*;

/**
 * Created by maciej.kocik on 2/9/2017.
 */
public class CoinWinApplierTest {

    @Test
    public void shouldApplyWin() {
        Wallet wallet = mock(Wallet.class);

        CoinWinApplier multiplyBetApplier = new CoinWinApplier(wallet);
        multiplyBetApplier.applyWin();

        verify(wallet, times(1)).addCoinsToBalance(any());
    }
}
