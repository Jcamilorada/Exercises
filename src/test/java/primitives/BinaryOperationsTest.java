package primitives;

import com.google.common.base.Stopwatch;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class BinaryOperationsTest
{
    @Test
    public void testCalculateParity()
    {
        final long big_value = 0b010101011100;

        Stopwatch stopwatch = Stopwatch.createStarted();
        short parity = BinaryOperations.parity(big_value);
        System.out.print(stopwatch.elapsed(TimeUnit.NANOSECONDS));

        TestCase.assertEquals(0, parity);
    }

    @Test
    public void testImprovedCalculateParity()
    {
        final long big_value = 0b010101011100;

        Stopwatch stopwatch = Stopwatch.createStarted();
        short parity = BinaryOperations.improved_parity(big_value);
        System.out.print(stopwatch.elapsed(TimeUnit.NANOSECONDS));

        TestCase.assertEquals(0, parity);
    }

    @Test
    public void testSwap()
    {
        final long number = 0b10101001;
        long result = BinaryOperations.swap(number, 0, 2);

        TestCase.assertEquals(0b10101100, result);
    }
}
