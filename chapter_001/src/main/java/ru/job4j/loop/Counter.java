package ru.job4j.loop;

/**
 * Сложение чётных чисел.
 * @author Anton Ovchinnikov.
 * @since 25.10.2017.
 * @version 1.0.
 */
public class Counter {
    int count = 0;

    /**
     * Цикл
     * @param start - начальное число
     * @param finish - конечное число
     * @return - сумма
     */

    public int add(int start, int finish) {
         while (start <= finish) {
            start++;
            if (start % 2 == 0) {
                count = count + start;
            }
        }
        return count;
    }
}
