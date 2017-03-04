package accounts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class PlayerTest {
    Bet bet;
    Player player;

    @Before
    public void preparePlayerTests() {
        bet = mock(Bet.class);
        player = new Player(0, bet);
    }

    @Test
    public void shouldProperlyInitPlayer() {
        assertEquals(bet, player.getBet());
    }

    @Test
    public void shouldReturnProperString() {
        when(bet.toString()).thenReturn("bet");

        assertEquals("Player: 0 => bet", player.toString());
    }
}
