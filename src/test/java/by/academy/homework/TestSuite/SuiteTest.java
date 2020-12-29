package by.academy.homework.TestSuite;

import by.academy.CalculatorTest;
import by.academy.SecondClassTest;
import by.academy.homework.ApplicationListener;
import by.academy.homework.Parametrize.ParameterizeTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


    @RunWith(Suite.class)
    @Suite.SuiteClasses({CalculatorTest.class, SecondClassTest.class, ParameterizeTest.class, ApplicationListener.class})
    public class SuiteTest  {

    }




