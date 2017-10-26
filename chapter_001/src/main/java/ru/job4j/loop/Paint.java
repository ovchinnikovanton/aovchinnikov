package ru.job4j.loop;
/**
 * Пирамида.
 * @author Anton Ovchinnikov.
 * @since 26.10.2017.
 * @version 1.0.
 */
public class Paint {
    /**
     * Создаем пирамиду.
     * @param h - высота.
     * @return - возвращаем строчки.
     */
    public String piramid(int h) {
        /**
         * Метод для построения.
         */
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h * 2 - 1; j++) {
                if (j > h - i && j < h + i) {
                    str.append("^");
                } else {
                    str.append(" ");
                }
            }
            str.append(System.getProperty("line.separator"));
        }
        return str.toString();
    }
}
