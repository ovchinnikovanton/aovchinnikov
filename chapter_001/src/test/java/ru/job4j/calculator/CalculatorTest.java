package ru.job4j.calculator;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * CalculatorTest.
 * @author Anton Ovchinnikov.
 * @since 18.10.2017.
 * @version 1.0.
 */

public class CalculatorTest {
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    public void whenOneMineOneThenZero() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }
    public void whenOneDividedByOneThenOne() {
        Calculator calc = new Calculator();
        calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    public void whenOneTimesOneThenOne() {
        Calculator calc = new Calculator();
        calc.multiple(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
}