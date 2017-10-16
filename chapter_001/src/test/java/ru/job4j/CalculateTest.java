package ru.job4j;
import org.junit.Test;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test для начала.
* @author Anton Ovchinnikov.
* @since 16.10.2017.
* @version 1.0.
*/

public class CalculateTest {
 /**
* Test echo.
*/
@Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Anton Ovchinnikov";
    String expect = "Echo, echo, echo : Anton Ovchinnikov";
	Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
}