package lv.acodemy.clasroom;

import java.util.Arrays;

public class ArraysIfs {
    public static void main(String[] args) {

        //Array
        int[] numbers = {1, 5, 9, 10, 20, 30, 50};

        System.out.println(numbers[3]); // print 10
        //numbers[0] = 1
        //numbers[1] = 5
        //numbers[2] = 9...

        //System.out.println(numbers[7]); - has exception - out of bounds

        int[] ages = new int[10];
        ages[0] = 18;
        ages[3] = 24;

        System.out.println(Arrays.toString(ages));
        System.out.println(ages);

        // String array

        String[] names = {"John", "Andrew", "Mary", "Angelica"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]);

        // Logical Statements

        if (5 < 10)
            System.out.println("Yes this is correct!");
        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Yes this ia summer and its quite hot in here!");
        }

        int x = 10;
        if (x > 0) {
            System.out.println("number is positive:" +x);
        }
        if (x < 0) {
            System.out.println("Number is negative:");
        }

        if (x % 2 == 0) {
            System.out.println("Number can be divided: " + x);
        }

        /*

        if(true) {
        do something if true
        } else {
        do something another if false
        }
         */
        if (x > 0) {
            System.out.println("Number is positive:" + x);
        } else {
            System.out.println("Number is negative:" + x);
        }
        if (x % 2 == 0) {
            System.out.println("Number is even:" + x);
        } else {
            System.out.println("Number is odd");
        }

        int y = 18;
        // <= (less or equal)
        // >= (more or less)
        // == (compare)

        if (y >= 18) {
            System.out.println("Person is eligible to vote:" + y);
        }
        if (y < 18) {
            System.out.println("Person is not eligible for voting:" + y);
        } else {
            System.out.println("Person can go vote:" + y);
        }

        isSummer = true;
        boolean isWinter = false;
        boolean isAutumn = false;

        if (isSummer) {
            System.out.println("Right, this is summer!");
        } else if (isWinter) {
            System.out.println("Right, this is winter!");
        } else if (isAutumn) {
            System.out.println("Right, this is Autumn!");
        } else {
            System.out.println("Not sure, but it can be spring!");
        }
        // Determine the grade based on a student's score

        int grade = 10;
        if (grade == 1) {
            System.out.println("Unsatisfactory");
        } else if (grade == 4) {
            System.out.println("Almost satisfactory");
        } else if (grade == 5) {
            System.out.println("Satisfactory");
        } else if (grade == 6) {
            System.out.println("Almost good");
        } else if (grade == 7) {
            System.out.println("Good");
        } else if (grade == 8) {
            System.out.println("Very good");
        } else if (grade == 9) {
            System.out.println("Excellent");
        } else if (grade == 10) {
            System.out.println("With distinction");
        } else {
            System.out.println("Incorrect grade provided");
        }

        // Classify a given angle as acute, right, obtuse, or straight.
        //Acute angle > 0 <99
        //Right angle 90
        //Obtuse >90 <180
        //Straight 180

        int angle = 200;
        if (angle > 0 && angle < 90) {
            System.out.println("Acute angle");
        } else if (angle == 90) {
            System.out.println("Right angle");
        } else if (angle > 90 && angle < 180) {
            System.out.println("Obtuse angle");
        } else if (angle == 180) {
            System.out.println("Straight angle");
        } else {
            System.out.println("Provided angle is not supported");
        }

        //Determine the largest of three given numbers.

        int [] numberArray = {5, 7, 10};
        //numberArray[0] = 5
        //numberArray[1] = 7
        //numberArray[2] = 10

        int max = 0;
        if (numberArray[2] > numberArray[0]) {
            max = numberArray[2];
        } else if (numberArray[2] > numberArray[1]) {
            max = numberArray[2];
        }
        System.out.println(max);

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > max){
                max = numberArray[i];
            }
        }
        System.out.println("Maximum is:" + max);
        
        int[] numArray = {4, 10, 5};
        int maxNum = 0;

    }


}
















