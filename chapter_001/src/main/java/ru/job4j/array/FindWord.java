package ru.job4j.array;
import java.util.Arrays;
import java.util.Objects;
/**
 * Поиск слова в слове.
 * @author Anton Ovchinnikov.
 * @since 13.11.2017.
 * @version 1.0.
 */

public class FindWord {
    /**
     *
     * @param origin - исходное слово.
     * @param sub - данное слово.
     * @return - возвращение boolean
     */
    public boolean contains(String origin, String sub) {
        /**
         * Метод переводит слова в массив символов и ищет соответствия между ними.
         */
        char[] originArray = origin.toCharArray();
        char[] subArray = sub.toCharArray();
        boolean rsl = false;
        for (int i = 0; i < originArray.length; i++) {
            int p = 0;
            for (int j = 0; j < subArray.length; j++) {
                if (subArray[j] == originArray[i + j]) {
                    p = p + 1;
                }
            }
            if (p == subArray.length) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
