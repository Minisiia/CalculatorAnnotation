package calculator.handler;

import calculator.annotation.Calculator;

/**
 * Class CalculatorHandler contains methods for arithmetic operations: addition, subtraction, multiplying and division
 * @author Anastesiia Dolbina
 * @version 1.0
 * @since 28-12-2022
 */

public class CalculatorHandler {
    /**
     * To calculate the sum of two numbers
     * @param number1 a value of first number
     * @param number2 a value of second number
     * @see Calculator
     */
    @Calculator(number1 = 1000, number2 = 2000)
    public void sum(int number1, int number2) { System.out.println(number1 + number2); }
    /**
     * To calculate the difference between two numbers
     * @param number1 a value of first number
     * @param number2 a value of second number
     * @see Calculator
     */
    @Calculator(number1 = 1000, number2 = 2000)
    public void sub(int number1, int number2) {
        System.out.println(number1 - number2);
    }
    /**
     * To calculate the product of two numbers
     * @param number1 a value of first number
     * @param number2 a value of second number
     * @see Calculator
     */
    @Calculator(number1 = 1000, number2 = 2000)
    public void mul(int number1, int number2) {
        System.out.println(number1 * number2);
    }
    /**
     * To calculate the quotient of two numbers
     * @param number1 a value of first number
     * @param number2 a value of second number
     * @throws ArithmeticException if your second number is zero
     * @see Calculator
     */
    @Calculator(number1 = 1000, number2 = 2000)
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
