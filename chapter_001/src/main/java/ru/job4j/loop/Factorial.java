package ru.job4j.loop;
/**
 * Факториал.
 * @author Anton Ovchinnikov.
 * @since 25.10.2017.
 * @version 1.0.
 */
public class Factorial {
    /**
     * Вычисляем факториал.
     * @param n - заданное число.
     * @return - фозвращаем факториал.
     */
    public int calc(int n) {
        int fact = 1;
        for (int count = 1; count <= n; count++) {
            fact = fact * count;
        }
        return fact;
    }
}
