package calculator.handler;

import calculator.annotation.Calculator;

public class CalculatorHandler {


    @Calculator(number1 = 100, number2 = 200)
    public void sum(int number1, int number2) {
        System.out.println(number1 + number2);
    }
    @Calculator(number1 = 100, number2 = 200)
    public void sub(int number1, int number2) {
        System.out.println(number1 - number2);
    }
    @Calculator(number1 = 100, number2 = 200)
    public void mul(int number1, int number2) {
        System.out.println(number1 * number2);
    }
    @Calculator(number1 = 100, number2 = 200)
    public void div(int number1, int number2) {
        if (number2 == 0) {
            try {
                System.out.println((double) number1 / number2);
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
            }
        } else {
            {
                System.out.println((double) number1 / number2);
            }
        }
    }

}
