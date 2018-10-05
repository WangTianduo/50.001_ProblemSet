package com.example;

import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExceptions {
    public static void main(String [] args) {
        System.out.println("hello class - exception demo.");
        boolean continueInput = true;
        do {
            try {
                tryexception();
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("You have an Input Mismatch Exception. ");
                System.out.println("from getMessage(): " + ex.getMessage());
                System.out.println("Please enter an integer");
            }
        } while (continueInput);
    }

    public static void tryexception () throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print ("Enter an integer: ");
            int k = input.nextInt();
            System.out.println("The reciprocal of square root of your input is: " + reciprocal(sqroot(k)));
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Exception:  " +
                    "You have an Arithmetic Exception");
            System.out.println("Contents of getMessage():  " +
                    ex.getMessage());
        }
        catch (InputMismatchException ex) {
            throw new InputMismatchException ("Input received is non-integer.");
        }
    }

    public static double reciprocal (double d) throws ArithmeticException {
        if (d == 0) {
            throw new ArithmeticException("Divisor cannot be zero.");
        }
        return (1.0/d);
    }

    public static double sqroot (double d) throws ArithmeticException {
        if (d < 0) {
            throw new ArithmeticException("Number cannot be negative.");
        }
        return (java.lang.Math.sqrt(d));
    }
}

