package pl.klolo.workshops.logic.kata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * You can use one small if here :)
 * <p>
 * #Srot the inner ctnnoet in dsnnieedcg oredr
 * <p>
 * You have to sort the inner content of every word of a string in descending order.
 * The inner content is the content of a word without first and the last char.
 * <p>
 * Some examples:
 * <p>
 * "sort the inner content in descending order" -> "srot the inner ctonnet in dsnnieedcg oredr"
 * "wait for me" -> "wiat for me"
 * "this kata is easy" -> "tihs ktaa is esay"
 * The string will never be null and will never be empty.
 * It will contain only lowercase-letters and whitespaces.
 * <p>
 * <p>
 * Have fun coding it and please don't forget to vote and rank this kata! :-)
 * <p>
 * I have also created other katas. Take a look if you enjoyed this kata!
 */
public class SrotKata {

    private static String sortTheInnerContent(String words) {
        return Arrays.stream(words.split(" "))
                .map(word -> {
                    if (word.length() > 3) {
                        String sortedInnerContent = Stream.of(word.substring(1, word.length() - 1)
                                .split(""))
                                .sorted(Comparator.reverseOrder())
                                .reduce("", (r, s) -> r + s);
                        return new StringBuilder(word)
                                .replace(1, word.length() - 1, sortedInnerContent);
                    }
                    return word;
                }).collect(Collectors.joining(" "));
    }

    @Test
    public void exampleTests() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", sortTheInnerContent("sort the inner " +
                "content in descending order"));
        assertEquals("wiat for me", sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", sortTheInnerContent("this kata is easy"));
    }
}
//https://www.codewars.com/kata/5898b4b71d298e51b600014b/solutions/java