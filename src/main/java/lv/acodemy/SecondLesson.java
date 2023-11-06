package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12};
        //first number = 2 - > [0] index

        int myNumber = numbers[4];
        System.out.println(myNumber);

        // determine area size
        System.out.println(numbers.length);

        //change number in array
        numbers[5] = 1337;
        System.out.println(Arrays.toString(numbers));

        //* 8 - sloty dlja cifr
        int[] emptyArray = new int[8];
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 21;
        emptyArray[1] = 12;
        emptyArray[2] = 2000;
        emptyArray[3] = 18;
        emptyArray[4] = 10;
        emptyArray[5] = 555;
        emptyArray[6] = 1488;
        emptyArray[7] = 2023;


        System.out.println(Arrays.toString(emptyArray));
        // string [] array
        String[] fruitBasket = {"apples", "banana", "watermelon", "kiwi",};
        System.out.println(Arrays.toString(fruitBasket));
        // first fruit = apples -> [0] index
        String kiwi = fruitBasket[3];
        System.out.println(kiwi);
        System.out.println(fruitBasket[3]);

        //Logic in Java
        /*
        condition = true/false
        5 > 2 = true
        if (conditions){

        }
        if (5 > 2) {
        // this code block will be executed in case if condition = true
        }
         */
        if (10 > 5) {
            System.out.println("This statement is True");
        }
        if (fruitBasket[0].equals("apples")) {
            System.out.println("Goni babki");
        }
        //if-else
        boolean isSummer = false;
        if (isSummer){
            System.out.println("We will lay on a beach!");
        } else {
            System.out.println("We will watch Nextflix series!");
        }
        // else - esli i v ostalnyh sluchajah
        // if-else-if-else

        /*
        if(condition){

        } else if ( condition){

        } else if (condition){

        }
         */
        //String light = "RED";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter traffic light color: ");
        String light = myScanner.next();
        if (light.equals("GREEN")){
            System.out.println("You can go!");
        } else if (light.equals("Yellow")) {
            System.out.println("Pay attention");
        } else if (light.equals("RED")) {
            System.out.println("WAIT FOR GREEN LIGHT");
        } else {
            System.out.println("Traffic light is not working!");
        }

    }
}
