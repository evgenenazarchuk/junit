package by.academy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class SecondClassTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before SecondClassTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After SecondClassTest.class");
    }

    @Test
    public void someSecondTest() {
        System.out.println("someSecondTest");
    }
}
