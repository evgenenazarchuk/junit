package by.academy;


import by.academy.homework.FuncMath;
import org.junit.Assert;
import org.junit.*;

public class SimpleMathTest extends Assert {




    @Test
    public void testMathPlus() {
        assertEquals(5, FuncMath.plus(2, 2));
    }
}


