package primitives;


class BinaryOperations
{
    /**
     * Calculate the Parity of a number. First get the last number using AND operation and the computes and XOR.
     *
     * @param number a very large number.
     *
     * @return number parity 0 Odd 1 Even.
     */
    static short parity(long number)
    {
        short result = 0;
        while (number != 0)
        {
            result ^= (number & 1);
            number >>= 1;
        }

        return result;
    }

    /**
     * Calculate the Parity of a number. First get the last number using AND operation and the computes and XOR.
     * The algorithm removes the lest significant digit.
     *
     * @param number a very large number.
     *
     * @return number parity 0 Odd 1 Even.
     */
    static short improved_parity(long number)
    {
        short result = 0;
        while (number != 0)
        {
            result ^= 1;
            number &= (number - 1);
        }

        return  result;
    }

    /**
     * Swap i, j numbers index values.
     *
     * @param number the number to change index numbers.
     * @param i int number representing one index on the number binary array.
     * @param j int number representing one index on the number binary array.
     *
     * @return the updated number.
     */
    static long swap(long number, int i, int j)
    {
        long i_number = (number >> i) & 1;
        long j_number = (number >> j) & 1;

        if (i_number != j_number)
        {
            number ^=  (1 << j) | (1 << i);
        }

        return number;
    }
}
