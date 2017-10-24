package ru.job4j.condition;

/**
 * Треугольник.
 * @author Anton Ovchinnikov.
 * @since 24.10.2017.
 * @version 1.0.
 */

public class Triangle {
    /**
     * Создаем точки.
     */
    private Point a, b, c;

    /**
     * Задаем треугольник.
     * @param a - точка a.
     * @param b - точка b.
     * @param c - точка c.
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Вычисление расстояния между точками. Берм точки из класса Point.
     * @param left - точка слева.
     * @param right - точка справа.
     * @return - возвращаем расстояние.
     */
    public double distance(Point left, Point right) {
        return Math.sqrt(Math.pow(left.getX() - right.getX(), 2) + Math.pow(left.getY() - right.getY(), 2));
    }

    /**
     * Вычисляем полупериметр треугольника.
     * @param ab - расстояние между точками a b.
     * @param ac - расстояние между точками a c.
     * @param bc - расстояние между точками b c.
     * @return - возвращаем периметр.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Вычисляем площадь треугольника.
     * @return - возвращаем площадб треугольника, если он существует.
     */
    public double area() {
        double rsl = -1;
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Проверяем существование треугольника.
     * @param ab - сторона.
     * @param ac - сторона.
     * @param bc - сторона.
     * @return - возвращаем.
     */
    private boolean exist(double ab, double ac, double bc) {
        return (ab < bc + ac) && (ac < ab + bc) && (bc < ab + ac);
    }

}
