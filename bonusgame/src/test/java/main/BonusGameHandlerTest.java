package main;

import accounts.Player;
import accounts.Wallet;
import handlers.WinHandlersManager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by maciej.kocik on 2/9/2017.
 */
public class BonusGameHandlerTest {
    private Player player;
    private Wallet wallet;
    private WinHandlersManager winHandlersManager;
    private BonusGameHandler bonusGameHandler;

    @Before
    public void shouldPrepareBonusGameHandlerTests() {
        player = mock(Player.class);
        wallet = mock(Wallet.class);
        winHandlersManager = mock(WinHandlersManager.class);

        bonusGameHandler = new BonusGameHandler(player, wallet, winHandlersManager);
    }

    @Test
    public void shouldFinishRoundInNormalMode() {
        bonusGameHandler.setBonusGameFlag(false);
        bonusGameHandler.finishRound();

        assertFalse(bonusGameHandler.isBonusGame());
    }

    @Test
    public void shouldFinishRoundInBonusMode() {
        bonusGameHandler.setBonusGameFlag(true);
        bonusGameHandler.finishRound();

        assertFalse(bonusGameHandler.isBonusGame());
    }
}
