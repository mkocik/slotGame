package accounts;

import org.junit.Before;
import org.junit.Test;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class BetTest {
    private Bet bet;

    @Before
    public void prepareBetTest() {
        bet = new Bet(new BigInteger("10"));
    }

    @Test
    public void shouldGetProperCoinsPerBet() {
        assertEquals(10, bet.getCoinsPerBet().intValue());
    }

    @Test
    public void shouldReturnProperString() {
        assertEquals("Current bet: " + 10, bet.toString());
    }
}
