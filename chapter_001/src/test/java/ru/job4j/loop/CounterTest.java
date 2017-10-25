package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тестируем сумму чётных чисел.
 */
public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter summ = new Counter();
        int result = summ.add(0, 10);
        assertThat(result, is(30));
    }

}