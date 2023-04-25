package org.testing;

import java.util.Arrays;
import java.util.Scanner;

public class Company {

    private int counter;
    private int capacity;
    private String[] employees;

    public Company() {
        this(1);
    }
    public Company (int capacity) {
        this.capacity = capacity;
        employees = new String[capacity];
    }

    public String[] getEmployee() {
        return Arrays.copyOf(employees, counter);
    }
    public boolean addEmployee(String name) {
        if (counter >= capacity) {
            throw new IllegalArgumentException("The company is full!");
        }

        employees[counter] = name;
        counter++;
        return true;
    }

    public boolean removeEmployee(String name) {
        String[] arr = new String[capacity];
        int i = 0;
        boolean success = false;
        for (String employee : employees) {
            if (employee == name) {
                success = true;
                counter--;
            } else {
                arr[i] = employee;
                i++;
            }
        }
        employees = arr;
        return success;
    }
}
