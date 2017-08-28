package pl.klolo.workshops.logic.kata;

import org.junit.Test;

import java.util.function.BiPredicate;

import static org.junit.Assert.assertEquals;

/**
 * You have to create a function that takes a positive integer number and returns the next bigger number formed by the same digits:
 * <p>
 * Kata.nextBiggerNumber(12)==21
 * Kata.nextBiggerNumber(513)==531
 * Kata.nextBiggerNumber(2017)==2071
 * If no bigger number can be composed using those digits, return -1:
 * <p>
 * Kata.nextBiggerNumber(9)==-1
 * Kata.nextBiggerNumber(111)==-1
 * Kata.nextBiggerNumber(531)==-1
 */
public class Kata {

    private final static BiPredicate<Long, Long> foundBoth = (l1, l2) -> l1 != -1 && l2 != -1;

    public static long nextBiggerNumber(long n) {
        return -1;
    }

    @Test
    public void basicTests() {
        assertEquals(21, Kata.nextBiggerNumber(12));
        assertEquals(531, Kata.nextBiggerNumber(513));
        assertEquals(2071, Kata.nextBiggerNumber(2017));
        assertEquals(441, Kata.nextBiggerNumber(414));
        assertEquals(414, Kata.nextBiggerNumber(144));
    }
}
