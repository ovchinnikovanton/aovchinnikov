package ru.job4j.array;
/**
 * Сортировка массива методом пузырька.
 * @author Anton Ovchinnikov.
 * @since 31.10.2017.
 * @version 1.0.
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                if (array[j] > array[j + 1]) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }

        }

        return array;
    }
}
