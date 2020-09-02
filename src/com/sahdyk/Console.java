package com.sahdyk;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static double ReadNumber(String prompt){
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
    /*
    What the "readNumber" method does:
    It basically just reads user input and returns that value.
    The reason we have two methods is because we OVERLOADED them which
    means that they have the same name and everything but just accept
    different parameters. For example the first one only reads a number, it
    could be any number. The second method reads a number but also the number
    needs to be between two specific values which the user passes.
     */
}
