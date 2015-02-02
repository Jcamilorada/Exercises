package primitives;

import junit.framework.TestCase;
import org.junit.Test;

public class BinaryShiftTest
{
    @Test
    public void testLeftShift()
    {
        int value = 0b010101;
        int result = value << 2;

        TestCase.assertEquals(result, 0b01010100);
    }

    @Test
    public void testRightShift()
    {
        int value = 0b010101;
        int result = value >> 2;

        TestCase.assertEquals(result, 0b101);
    }

    @Test
    public void testAnd()
    {
        int value = 0b010101;

        int result = value & 1;
        TestCase.assertEquals(result, 0b01);

        result = value & 0;
        TestCase.assertEquals(result, 0b0);
    }

    @Test
    public void testXor()
    {
        int value = 0b010101;

        int result = value ^ 0b000001;
        TestCase.assertEquals(result, 0b010100);

        result = value ^ 0b0;
        TestCase.assertEquals(result, 0b010101);
    }
}
