package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тестируем Сортировку.
 */
public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sortTest = new BubbleSort();
        int[] array = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] resultArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        int[] result = sortTest.sort(array);
        assertThat(result, is(resultArray));
    }
}
