package lv.acodemy;

import java.util.Collection;
import java.util.Collections;

public class MethodExercises {
    public static void main(String[] args) {

        System.out.println(fahrenheitConvertere(100));

        System.out.println(currencyConverter("CZK", 50));
        System.out.println(currencyConverter("GBP", 50));
        System.out.println(currencyConverter("PLN", 50));

        System.out.println(isPalindrome("ovip"));
    }

    public static double fahrenheitConvertere(double fahrenheit) {
        return (fahrenheit - 32) / 1.80000;
    }

    public static double currencyConverter(String currency, double money) {
        double convertedAmount;
        switch (currency) {
            case "PLN":
                convertedAmount = money * 4.45;
                break;
            case "CZK":
                convertedAmount = money * 24.55;
                break;
            case "GBP":
                convertedAmount = money * 0.87;
                break;
            default:
                throw new RuntimeException("Ünsuported currency: " + currency);
        }
        return convertedAmount;
    }

    public static boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (reversed.equals(word)) {
            return true;
        }
        return reversed.equals(word);
    }

    public static double calculator(String operation, double cisloOdin, double cislodva) {
        double result = 0;
        switch (operation) {
            case "+":
                result = cisloOdin = cislodva;
            case "-":
                result = cisloOdin = cislodva;
            case "/":
                result = cisloOdin = cislodva;
            case "*":
                result = cisloOdin = cislodva;
            default:
                throw new RuntimeException("Invalid operation " + operation);
        }
        return result;
    }

}


