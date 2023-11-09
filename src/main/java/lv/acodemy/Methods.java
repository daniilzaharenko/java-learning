package lv.acodemy;

public class Methods {
    public static void main(String[] args) {

        printSomeText(10, "Proverka");
        printSomeText(25, "Pivasick");

        System.out.println(calculateSumOfTwoNumbers(20, 40));

        int sunOfTwoNumbers = calculateSumOfTwoNumbers(10, 20);
        System.out.println(sunOfTwoNumbers);
        // Hello World x 5
        personalInformation("Daniil", "Zaharenko", 22);
        personalInformation("Petr", "Bayoyovichj", 54);
        personalInformation("Vladimir", "Pivovypilovich", 5);
    }

    public static void printSomeText(int loopCount, String text) {

        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);

        }
    }

    public static int calculateSumOfTwoNumbers(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;

    }

    //Create method that accepts (String name, String Lastname, int age
    // Method should print out text: Mynameis nam
    public static void personalInformation(String name, String lastName, int age) {
        if (name.equals("Daniil")) {
            System.out.println("ÿou are the best");
        }
        System.out.printf("My name is %s. My surname is %s. I am %d years old\n", name, lastName, age);

    }
}
