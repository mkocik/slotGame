package handlers.checkers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by maciej.kocik on 2/8/2017.
 */
public class WinCheckerTest {

    @Test
    public void shouldReturnWin() {
        WinChecker winChecker = new WinChecker(1);

        assertEquals(true, winChecker.isWin());
    }

    @Test
    public void shouldNotReturnWin() {
        WinChecker winChecker = new WinChecker(0);

        assertEquals(false, winChecker.isWin());
    }
}
