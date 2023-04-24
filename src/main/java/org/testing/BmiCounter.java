package org.testing;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BmiCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Height (m)");
        double height = scanner.nextDouble();
        System.out.println("Please Enter Your Weight (kg)");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.print("Your BMI is:" + decimalFormat.format(bmi));
    }
}