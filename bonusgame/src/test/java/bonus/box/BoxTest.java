package bonus.box;


import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Created by maciej.kocik on 2/9/2017.
 */
public class BoxTest {

    @Test
    public void shouldReturnProperValue() {
        Box box = new Box(10);

        assertEquals(10, box.getValue().intValue());
    }

    @Test
    public void shouldCheckBlocker() {
        Box box = new Box(0);

        assertEquals(true, box.isBlocker());
    }
}
