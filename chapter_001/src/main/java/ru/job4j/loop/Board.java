package ru.job4j.loop;
/**
 * Шахматная доска.
 * @author Anton Ovchinnikov.
 * @since 26.10.2017.
 * @version 1.0.
 */
public class Board {
    /**
     * Метод для вычисления положения Х и пробела.
     * @param width - ширина.
     * @param height - высота.
     * @return строим доску.
     */
    public String paint(int width, int height) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i + j) % 2 == 0) {
                    str.append("x");
                } else {
                    str.append(" ");
                }
            }
            str.append(System.getProperty("line.separator"));
        }
        return str.toString();
    }
}
