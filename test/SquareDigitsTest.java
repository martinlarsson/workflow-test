import org.junit.*;
import se.mlarsson.SquareDigits;

import static org.junit.Assert.assertEquals;

public class SquareDigitsTest {
    private SquareDigits sd;

    @Before
    public void setUp() {
        sd = new SquareDigits();
    }

    @Test
    public void testsSquareZero() throws Exception {
        int expected = 0;
        int actual = sd.square(0);
        assertEquals("Testing digit square of 0", expected, actual);
    }

    @Test
    public void testsSquareOne() throws Exception {
        int expected = 1;
        int actual = sd.square(1);
        assertEquals("Testing digit square of 1", expected, actual);
    }

    @Test
    public void testsSquareTwo() throws Exception {
        int expected = 4;
        int actual = sd.square(2);
        assertEquals("Testing digit square of 2", expected, actual);
    }

    @Test
    public void testsSquareTwelve() throws Exception {
        int expected = 14;
        int actual = sd.square(12);
        assertEquals("Testing digit square of 12", expected, actual);
    }

    @Test
    public void testsSquare359() throws Exception {
        int expected = 92581;
        int actual = sd.square(359);
        assertEquals("Testing digit square of 359", expected, actual);
    }
}