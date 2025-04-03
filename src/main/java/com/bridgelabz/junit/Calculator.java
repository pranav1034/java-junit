package com.bridgelabz.junit;

public class Calculator {

    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of Two Numbers: " + add(3,6));
        System.out.println("Subtraction of Two Numbers: " + subtract(6,3));
        System.out.println("Multiplication of Two Numbers: " + multiply(5,3));
        System.out.println("Division of Two Numbers: " + divide(6,3));
    }
}
