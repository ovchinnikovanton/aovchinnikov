package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тестируем Факториал.
 */
public class FactorialTest {
    /**
     * Тест для числа 120.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial rsl = new Factorial();
        int result = rsl.calc(5);
        assertThat(result, is(120));
    }

    /**
     * Тест для числа 0.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial rsl = new Factorial();
        int result = rsl.calc(0);
        assertThat(result, is(1));
    }

}