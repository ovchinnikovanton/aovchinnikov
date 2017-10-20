package ru.job4j.calculator;
/**
 * Calculator.
 * @author Anton Ovchinnikov.
 * @since 18.10.2017.
 * @version 1.0.
 */
public class Calculator {
    /** поле результат.
     */
    private double result;
    /** метод складывает аргументы first и second и записывать результат в поле this.result.
     * @param first args.
     * @param second args.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /** метод вычитает аргумент second из first и записывать результат в поле this.result.
     * @param first args.
     * @param second args.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /** метод делит аргумент first на second и записывать результат в поле this.result.
     * @param first args.
     * @param second args.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /** метод умножает аргументы first и second и записывать результат в поле this.result.
     * @param first args.
     * @param second args.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /** метод возвращает результат.
     * @return args args.
     */
    public double getResult() {
        return this.result;
    }
}
