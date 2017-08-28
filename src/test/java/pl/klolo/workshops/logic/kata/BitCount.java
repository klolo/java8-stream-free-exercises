package pl.klolo.workshops.logic.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Write a function that takes an (unsigned) integer as input, and returns the number of bits that are equal to one in the binary representation of that number.
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 * <p>
 * Nie korzystamy z metody bitCount w klasie Ineteger.
 */
public class BitCount {
    public static int countBits(int n) {
        return -1;
    }

    @Test
    public void testGame() {
        assertEquals(1, BitCount.countBits(4));
        assertEquals(5, BitCount.countBits(1234));
        assertEquals(3, BitCount.countBits(7));
        assertEquals(2, BitCount.countBits(9));
        assertEquals(2, BitCount.countBits(10));
    }
}
