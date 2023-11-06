package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("This is Variables.java file");

        // int (number)
        int myCurrentAge = 22;
        System.out.println(myCurrentAge);

        /*
        This is
        multi Line
        command approach
         TODO: Delete it later
         */

        byte myWeight = 60; // byte data type
        short salary = 2500; // short data type
        char myFirstNameLetter = 'D'; // character data type
        long populationOfLatvia = 1900000; // long data type

        double numberPi = Math.PI; //PI number
        float randomNumber = 3213123213213213.6786867876867868f; // Floating Number
        double classicFloatingNumber = 123456789.987654321; // Double number

        //Boolean true/false is, has
        //Example: isSummer,isAdult, hasEnoughAge, hasProperValue;
        boolean isSummer = false;
        boolean isAutumn = true;

        var age = 20;
        var myCurrentWeight = 20.5;
        //Mozhno delat but not recommend

        //Exercise 1.
        //Create 2 variables for each data type
        //Variable should be meaningful as it possible;
        //Variable name should contain at least 2 words
        //lower camel case: lowerCamelCase
        //constants: int MY_AGE = 10;
        //kebab case: my-current-age
        short dateOfBirth = 2000;
        System.out.println(dateOfBirth);
        short worldWarStart = 1939;
        System.out.println(worldWarStart);
        byte coffeePerDayAmount = 4;
        System.out.println(coffeePerDayAmount);
        byte myIntelegenceLevel = 100;
        System.out.println(myIntelegenceLevel);
        char firstLetterOfAlphabet = 'A';
        System.out.println(firstLetterOfAlphabet);
        char lastLetterOfAlphabet = 'Z';
        System.out.println(lastLetterOfAlphabet);
        long populationOnEarth = 80000000;
        System.out.println(populationOnEarth);
        long usaPopulation = 1200000;
        System.out.println(usaPopulation);

        int x, y, z;
        x = 10;
        y = 4;
        z = 8;
        int summa = x + y + z;
        System.out.println(summa);
        int summaExample = 10 + 5 + 2 + x + y + 4 + z;
        System.out.println(summaExample);

        // 2a(a + b); result?
        int a = 4;
        int b = 3;
        int result = 2 * a * (a + b);
        System.out.println(result);

        int reminder = 10 % 3;
        System.out.println(reminder);

        //String
        String firstName = "Daniil";
        System.out.println(firstName);
        String lastName = "Zaharenko";
        System.out.println(lastName);
        System.out.println(firstName + " " + lastName);


        System.out.printf("My Full name is %s %s\n", firstName, lastName);
        // if printf i nado perenesti nanizhnuju strochku  \n
        // %s chtoby doabit class
        String fullSentence = firstName + " " + lastName + "." + "I am " + myCurrentAge + " ÿears old\n";
        System.out.printf(fullSentence);

        String novySentence = "Latvia have" + populationOfLatvia + "." + "And population of planet is" + populationOnEarth + ".";
        System.out.println(novySentence);


    }
}
