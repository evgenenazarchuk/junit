package by.academy.homework;

public class FuncMath {
    private static int per;
 

    public int getCalls() {
        return per;
    }

    public static long factorial(int number) {
        per++;

        if (number < 0) {
            throw new IllegalArgumentException();
        }

        long result = 1;
        if (number > 1) {
            for (int i = 1; i <= number; i++)
                result = result * i;
        }

        return result;
    }

    public static long plus(int num1, int num2) {
        return num1 + num2;
    }
}

