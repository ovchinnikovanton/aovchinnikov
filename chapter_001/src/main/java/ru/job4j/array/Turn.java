package ru.job4j.array;
/**
 * Переворот массива.
 * @author Anton Ovchinnikov.
 * @since 25.10.2017.
 * @version 1.0.
 */
public class Turn {
    /**
     * Метод переворота массива. Меняем местами противоположные ячейки
     * @param array - массив.
     * @return - возвращаем перевёрнуты массив.
     */
    public int[] back(int[] array) {
        /**
         * .
         */
        int x;
        for (int i = 0; i < array.length / 2; i++) {
            x = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = x;
        }

        return array;
    }
}
