package pl.klolo.workshops.logic.kata;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * In this kata, you must create a digital root function.
 * <p>
 * A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n.
 * If that value has two digits, continue reducing in this way until a single-digit number is produced.
 * This is only applicable to the natural numbers.
 * <p>
 * digital_root(16)
 * => 1 + 6
 * => 7
 * <p>
 * digital_root(942)
 * => 9 + 4 + 2
 * => 15 ...
 * => 1 + 5
 * => 6
 * <p>
 * digital_root(132189)
 * => 1 + 3 + 2 + 1 + 8 + 9
 * => 24 ...
 * => 2 + 4
 * => 6
 * <p>
 * digital_root(493193)
 * => 4 + 9 + 3 + 1 + 9 + 3
 * => 29 ...
 * => 2 + 9
 * => 11 ...
 * => 1 + 1
 * => 2
 */
public class DRoot {

    private static int digital_root(int n) {
        if (n < 10) {
            return Stream.of(String.valueOf(n)
                    .split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();
        } else {
            return digital_root(Stream.of(String.valueOf(n)
                    .split(""))
                    .mapToInt(Integer::parseInt)
                    .sum());
        }
    }

    @Test
    public void Tests() {
        assertEquals("16->7", DRoot.digital_root(16), 7);
        assertEquals("942->6", DRoot.digital_root(942), 6);
        assertEquals("132189->6", DRoot.digital_root(132189), 6);
        assertEquals("493193->2", DRoot.digital_root(493193), 2);
    }
}
//https://www.codewars.com/kata/541c8630095125aba6000c00/solutions/java