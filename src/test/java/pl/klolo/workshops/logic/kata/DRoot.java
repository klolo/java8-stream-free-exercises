package pl.klolo.workshops.logic.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * In this kata, you must create a digital root function.
 * <p>
 * A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n.
 * If that value has two digits, continue reducing in this way until a single-digit number is produced.
 * This is only applicable to the natural numbers.
 *
 * digital_root(16)
 * => 1 + 6
 * => 7
 *
 * digital_root(942)
 * => 9 + 4 + 2
 * => 15 ...
 * => 1 + 5
 * => 6
 *
 * digital_root(132189)
 * => 1 + 3 + 2 + 1 + 8 + 9
 * => 24 ...
 * => 2 + 4
 * => 6
 *
 * digital_root(493193)
 * => 4 + 9 + 3 + 1 + 9 + 3
 * => 29 ...
 * => 2 + 9
 * => 11 ...
 * => 1 + 1
 * => 2
 */
public class DRoot {

    public static int digital_root(int n) {
        return -1;
    }

    @Test
    public void Tests() {
        assertEquals("16->7", DRoot.digital_root(16), 7);
        assertEquals("942->6", DRoot.digital_root(942), 6);
        assertEquals("132189->6", DRoot.digital_root(132189), 6);
        assertEquals("493193->2", DRoot.digital_root(493193), 2);
    }
}
