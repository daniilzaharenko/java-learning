package lv.acodemy;

import java.util.Scanner;

public class IfElseWeekSolution {
    public static void main(String[] args) {
        // dz pro dni nedeli
        Scanner myScanner = new Scanner(System.in);
        String userInput = myScanner.next();

        switch (userInput) {
            case "0":
                System.out.println("Sunday");
                break;
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("User input is not correct: " + userInput);
        }
    }
}