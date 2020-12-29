package by.academy.homework.Parametrize;


import java.util.Arrays;
import java.util.Collection;
import by.academy.homework.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(value = Parameterized.class)

public class ParameterizeTest extends Assert {

    @Parameterized.Parameters()
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                        { 1, 1, 2 },
                        { 2, 7, 8 },
                        { 2, 2, 4 },
                }
        );
    }

    private int valueA;
    private int valueB;
    private int expected;

    public ParameterizeTest(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }





    @Test
    public void Summa() {
        assertEquals(expected, new Calculator().getSum(valueA, valueB));

    }
    @Test
    public void Div() {
        assertEquals(expected, new Calculator().getDivide(valueA, valueB));

    }
    @Test
    public void Multiplication() {
        assertEquals(expected, new Calculator().getMultiple(valueA, valueB));

    }
}