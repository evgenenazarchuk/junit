package by.academy;


import by.academy.homework.Calculator;
import org.junit.*;

public class CalculatorTest extends Assert {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
        System.out.println("Before test call.");
        calculator = new Calculator();
    }

    @After
    public void afterTest() {
        System.out.println("After test call.");
        calculator = null;
    }

    @Test
    public void testGetSum() throws Exception {
        assertEquals(15, calculator.getSum(7, 8));
    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(20, calculator.getDivide(100, 5));
    }


    @Test
   public void testGetMultiple() throws Exception {
        assertEquals(30, calculator.getMultiple(5, 6));
   }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.getDivide(15, 0);
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }


}

