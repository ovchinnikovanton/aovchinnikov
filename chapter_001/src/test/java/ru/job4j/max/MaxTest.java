package ru.job4j.max;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тестируем поиск максимального значения.
 * @author Anton Ovchinnikov.
 * @since 20.10.2017.
 * @version 1.0.
 */

public class MaxTest {
    /**
     * первое меньше второго.
     */
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

}