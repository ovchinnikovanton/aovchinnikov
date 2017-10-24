package ru.job4j.condition;
/**
 * Поиск точки.
 * @author Anton Ovchinnikov.
 * @since 20.10.2017.
 * @version 1.0.
 */
public class Point {
    /**
     * задаем переменные.
     */
    private int x, y;
    /**
     * метод позиционирования.
     * @param x икс.
     * @param y игрек.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * возвращаем Х.
     * @return икс.
     */
    public int getX() {

        return this.x;
    }
    /**
     * возвращаем У.
     * @return игрек.
     */
    public int getY() {

        return this.y;
    }
    /**
     * проверяем условие нахождения точки.
     * @param a угловой коэффиц.
     * @param b коэффиц. пересечения с осью У.
     * @return истина/ложь..
     */
    public boolean is(int a, int b) {

        return this.y == a * this.x + b;
    }
}

