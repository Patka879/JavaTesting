package org.testing;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BmiCounter {
    public static void main(String[] args) {
        BmiCounter bmiCounter = new BmiCounter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Height (m)");
        double height = scanner.nextDouble();
        System.out.println("Please Enter Your Weight (kg)");
        double weight = scanner.nextDouble();
        System.out.println("Your BMI: " + bmiCounter.count(weight, height));
    }
        public static double count(double w, double h) {
            double result = w / ( h *  h);
            return result;
        }
}