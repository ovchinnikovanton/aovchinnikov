package ru.job4j.array;

import java.util.Arrays;

/**
 * Удаление дубликатов из массива.
 * @author Anton Ovchinnikov.
 * @since 07.11.2017.
 * @version 1.0.
 */

public class ArrayDuplicate {
    /**
     * Метод сравнения значений в массиве и перестановки дубликата с конец массива с последующим уменьшением массива на 1.
     * @param array - исходный массив.
     * @return - возврат копии массива с длиной х.
     */
    public String[] remove(String[] array) {
        /**
         * х - длина уникального массива.
         */
        int x = array.length;
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[x - 1];
                    x--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, x);
    }
}
