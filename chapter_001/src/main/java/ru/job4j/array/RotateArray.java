package ru.job4j.array;
/**
 * Переворот двумерного массива на 90гр.
 * @author Anton Ovchinnikov.
 * @since 02.11.2017.
 * @version 1.0.
 */
public class RotateArray {
    /**
     * Переворот массива по часовой стрелке.
     * @param array - массив.
     * @return - возвращаем перевёрнутый массив.
     */
    public int[][] rotate(int[][] array) {
        int x;
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i; j < array.length - 1 - i; j++) {
                x = array[i][j];
                array[i][j] = array[array.length - 1 - j][i];
                array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j];
                array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - 1 - i];
                array[j][array.length - 1 - i] = x;
            }
        }
        return array;
    }
}
