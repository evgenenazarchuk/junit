package by.academy.homework;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;


public class ApplicationListener extends BlockJUnit4ClassRunner {
    private CalculatorTestListener calculatorTestListener;

    public ApplicationListener(Class<?> testClass) throws InitializationError {
        super(testClass);
    }


    public void TestRunner(Class<ApplicationListener> clz) throws InitializationError {
   //     super(clz);
        calculatorTestListener = new CalculatorTestListener();
    }
        @Override
        public void run ( final RunNotifier notifier){
            notifier.addListener(calculatorTestListener);
            super.run(notifier);
        }
    }




