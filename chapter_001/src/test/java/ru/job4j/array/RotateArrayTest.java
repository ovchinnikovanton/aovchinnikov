package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тестируем переворот массива.
 */

public class RotateArrayTest {
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        //напишите здесь тест, проверяющий поворот массива размером 2 на 2.
        RotateArray rotTest = new RotateArray();
        int[][] array = {{3, 5},
                         {4, 1}};
        int[][] resultArray = {{4, 3},
                               {1, 5}};
        int[][] result = rotTest.rotate(array);
        assertThat(result, is(resultArray));
    }
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        //напишите здесь тест, проверяющий поворот массива размером 3 на 3.
        RotateArray rotTest = new RotateArray();
        int[][] array = {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};
        int[][] resultArray = {{7, 4, 1},
                               {8, 5, 2},
                               {9, 6, 3}};
        int[][] result = rotTest.rotate(array);
        assertThat(result, is(resultArray));
    }


}