package org.testing;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Your phrase");
        String input = scanner.nextLine();

        System.out.println("Reversed String is " + stringManipulation.reversed(input));
        System.out.println("Is this String a palindrome? " + stringManipulation.isPalindrome(input));
    }

    public String reversed(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reversed(str.substring(1)) + str.charAt(0);
    }

    public boolean isPalindrome(String str) {
        String strReversed = reversed(str);
        boolean result = false;
        if (strReversed.equalsIgnoreCase(str)) {
            result = true;
        }
        return result;
    }
}
