package accounts;

import org.junit.Before;
import org.junit.Test;
import java.math.BigInteger;
import static org.junit.Assert.assertEquals;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class WalletTest {
    private Wallet wallet;


    @Before
    public void prepareWalletTests() {
        wallet = new Wallet();
    }

    @Test
    public void shouldGetProperBalance() {
        assertEquals(0, wallet.getCoinsBalance().intValue());
    }

    @Test
    public void shouldChargeWallet() {
        wallet.chargeWallet(new BigInteger("1000"));

        assertEquals(-1000, wallet.getCoinsBalance().intValue());
    }

    @Test
    public void shouldAddCoinsToBalance() {
        wallet.addCoinsToBalance(new BigInteger("1000"));

        assertEquals(1000, wallet.getCoinsBalance().intValue());
    }

    @Test
    public void shouldReturnProperString() {
        assertEquals("Current amount of coins: 0" , wallet.toString());
    }
}
