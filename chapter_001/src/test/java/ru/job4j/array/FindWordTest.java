package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тест программы поиска слова в слове.
 */

public class FindWordTest {
    @Test
    public void whenTheWordContainsSameLettersThenTrue() {
        String origin = "Привет";
        String sub = "иве";
        FindWord duplicate = new FindWord();
        boolean rsl = duplicate.contains(origin, sub);
        assertThat(rsl, is(true));
        }

}
