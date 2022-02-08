package com.morriscm.homework;

import java.util.Scanner;

public class Calculator01 {
    public static void main(String[] args) {
        System.out.println("*** Welcome to my Calculator App ***");
        System.out.println("------------------------------------");
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);// scanner object for user input

        System.out.println("Enter First Number: "); // input first number
        double firstNumber = input.nextDouble(); //retrieve input
        System.out.println("Enter Second Number: "); // input second number
        double secondNumber = input.nextDouble(); //retrieve input

        System.out.println("Please select an option: ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int selection = input.nextInt();

        double result = 0;

        switch (selection) {
            case 1: result = firstNumber + secondNumber;
            break;
            case 2: result = firstNumber - secondNumber;
            break;
            case 3: result = firstNumber * secondNumber;
            break;
            case 4: result = firstNumber / secondNumber;
            break;
            default:
                System.exit(0); // clean exit
        }
        System.out.println("Output: ");
        System.out.println("Result: " + result);


    }
}
