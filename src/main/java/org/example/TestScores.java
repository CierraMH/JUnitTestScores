package org.example;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        int userInput = prompt("Enter a number between 0 and 100");
        System.out.println(testScores(userInput));
    }

    public static int prompt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int num = Integer.valueOf(scanner.nextLine());
        return num;
    }
    public static String testScores(int userInput){
        if (userInput <= 59){
            return "Your grade is an F";
        } else if (userInput >= 60 && userInput <= 69) {
            return "Your grade is an D";
        } else if (userInput >= 70 && userInput <= 79) {
            return "Your grade is an C";
        } else if (userInput >= 80 && userInput <= 89) {
            return "Your grade is an B";
        } else {
            return "Your grade is an A";
        }
    }
}