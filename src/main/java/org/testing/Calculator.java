package org.testing;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter first number");
        int num2 = scanner.nextInt();

        System.out.println("Add: " + calculator.add(num1, num2));
        System.out.println("Subtract: " + calculator.subtract(num1, num2));
        System.out.println("Multiply: " + calculator.multiply(num1, num2));
        System.out.println("Divide: " + calculator.divide(num1, num2));
    }

        public int add ( int num1, int num2){
            return num1 + num2;
        }
        public int subtract ( int num1, int num2)   {
            return num1 - num2;
        }
        public int multiply ( int num1, int num2){
            return num1 * num2;
        }
        public double divide ( double num1, double num2){
            if (num2 == 0) {
                System.out.println("Not possible to divide by 0");
                throw new IllegalArgumentException("Not possible to divide by zero");
            } else {
                return num1 / num2;
            }
        }
}
