package pl.klolo.workshops.logic.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * You have to create a function that takes a positive integer number and returns
 * the next bigger number formed by the same digits:
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

    private static long bigger(long num) {
        char[] cs = String.valueOf(num).toCharArray();
        for (int i = 0; i < cs.length; i++) {
            for (int j = 0; j < i; j++) {
                if (cs[j] < cs[i]) {
                    char tmp = cs[i];
                    cs[i] = cs[j];
                    cs[j] = tmp;
                }
            }
        }
        return Long.parseLong(String.valueOf(cs));
    }

    private static long nextBiggerNumber(long n) {
        if (n <= 10) {
            return -1;
        }

        long bigNum = bigger(n);
        if (n == bigNum) {
            return -1;
        }

        long i = n;
        while (i < bigNum) {
            if (bigger(i) == bigNum && i > n) {
                return i;
            }
            i++;
        }
        return i;
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
//https://my.oschina.net/u/215547/blog/808282 (zmieniłem w lini 56 return -1 na return i)