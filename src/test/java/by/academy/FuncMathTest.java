package by.academy;

import by.academy.homework.FuncMath;
import org.junit.Assert;
import org.junit.Test;

public class FuncMathTest extends Assert {
    @Test
    public void testGetSum() throws Exception {
        assertEquals(15, FuncMath.factorial(2));
    }
}
