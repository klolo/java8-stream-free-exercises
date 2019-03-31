package pl.klolo.workshops.logic.kata;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Accumulate {
    private static String accumulate(final String input) {
        return IntStream.range(0, input.length())
                .mapToObj(i -> IntStream.range(0, i + 1)
                        .mapToObj(i1 -> i1 == 0 ? String.valueOf(input.charAt(i))
                                .toUpperCase() : String.valueOf(input.charAt(i))
                                .toLowerCase())
                        .collect(Collectors.joining())
                ).collect(Collectors.joining("-"));
    }

    @Test
    public void test() {
        assertEquals(Accumulate.accumulate("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq" +
                "-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
        assertEquals(Accumulate.accumulate("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy" +
                "-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
        assertEquals(Accumulate.accumulate("MjtkuBovqrU"), "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv" +
                "-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
        assertEquals(Accumulate.accumulate("EvidjUnokmM"), "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo" +
                "-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
        assertEquals(Accumulate.accumulate("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx" +
                "-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
    }
}
//https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/discuss/java