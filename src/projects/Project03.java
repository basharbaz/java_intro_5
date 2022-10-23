package projects;

import java.util.Random;


public class Project03 {
    public static void main(String[] args) {
        /*
        -Assume that you are given below Strings
        String s1 = “24”, s2 = “5”;
        -Find the sum, subtraction, division, multiplication and remainder of the s1 and s2.
        The sum of 24 and 5 = 29
        The subtraction of 24 and 5 = 19
        The division of 24 and 5 = 4.8
        The multiplication of 24 and 5  = 120
        The remainder of 24 and 5 = 4
        */
        System.out.println("***** TASK 1 *****");
        String s1 = "24", s2 = "5";

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (num1 + num2));
        System.out.println("The subtraction of " + s1 + " and " + s2 + " = " + (num1 - num2));
        System.out.println("The division of " + s1 + " and " + s2 + " = " +  ((double) num1 / num2));
        System.out.println("The multiplication of " + s1 + " and " + s2 + " = " + (num1 * num2));
        System.out.println("The remainder of " + s1 + " and " + s2 + " = " + (num1 % num2));

        /*
        Write a program that generates a random number between 1 and 35 (1 to 35 are included)
        Find if the given number is Prime
        Prime Numbers - 2, 3, 5, 7, 11, 13, 17...
         */
        System.out.println("\n***** TASK 2 *****");
        int ranNum = 1 + (int)(Math.random() * 35);
        boolean isPrime = true;
        for (int i = 2; i <= ranNum / 2; i++) {
            if (ranNum % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println(ranNum + " is a prime number");
        else System.out.println(ranNum + " is not a prime number");


        // Your expected answer should match something like...
//        int random = (int)(Math.random() * 35 + 1);
//        System.out.println(random);
//        if (random == 1){
//            System.out.println(random + " IS NOT A PRIME NUMBER");
//        }
//        else if (random == 2 || random == 3 || random == 5 || random % 2 != 0 && random % 3 != 0 && random % 5 != 0){
//            System.out.println(random + " IS A PRIME NUMBER");
//        }
//        else {
//            System.out.println(random + " IS NOT A PRIME NUMBER");
//        }


        /*
        Write a program that generates 3 random numbers between 1 to 50 (1 and 50 are included)
        -Find and print each number in an ascending order
        -Ascending order is ordering from lowest to greatest
         */
        System.out.println("\n***** TASK 3 *****");
        int ran1 = 1 + (int) (Math.random() * 50);
        int ran2 = 1 + (int) (Math.random() * 50);
        int ran3 = 1 + (int) (Math.random() * 50);

        int lowest = Math.min(Math.min(ran1, ran2), ran3);
        int greatest = Math.max(Math.max(ran1, ran2), ran3);
        int middle = 0;

        if (lowest == ran1){
            middle = Math.min(ran2, ran3);
        } else if (lowest == ran2) {
            middle = Math.min(ran1, ran3);
        } else middle = Math.min(ran1, ran2);

        // OPTIMAL => int midNumber = (myRandom1 + myRandom2 + myRandom3 - maxNumber - minNumber);

        System.out.println("Lowest number is = " + lowest);
        System.out.println("Middle number is = " + middle);
        System.out.println("Greatest number is = " + greatest);

        /* Task 4
        Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If the given char is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out if it is an uppercase or a lowercase letter.
        -If the letter is uppercase, then print “The letter is uppercase”, else print “The
        letter is lowercase”.
         */
        System.out.println("\n***** TASK 4 *****");

        char c1 = '3';

        boolean isLower1 = (c1 >= 'a' && c1 <= 'z');
        boolean isUpper1 = (c1 >= 'A' && c1 <= 'Z');

        if (isLower1 || isUpper1) {
            if (isLower1) System.out.println("The letter is lowercase");
            else System.out.println("The letter is uppercase");
        } else System.out.println("Invalid character detected!!!");

        // Task 5 //
        System.out.println("\n***** TASK 5 *****");
        char c2 = 'e';

        boolean isLower2 = (c2 >= 'a' && c2 <= 'z');
        boolean isUpper2 = (c2 >= 'A' && c2 <= 'Z');

        if (isLower2 || isUpper2) {
            if (isUpper2) c2 += 32; // 69 + 32 = 101 -> e
            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') {
                System.out.println("The letter is vowel");
            } else System.out.println("The letter is consonant");
        } else System.out.println("Invalid character detected!!!");
    
        
        
                System.out.println("\n----------Task-6-----------\n");

                char c11 = '@';
                if (c11 >= 65 && c11 <= 90 || c11 >= 97 && c11 <= 122 || c11 >= 48 && c11 <= 57) {
                    System.out.println("Invalid character detected!!!");
                } else {
                    System.out.println("Special character is = " + c1);
                }
                System.out.println("End of the program!");


            System.out.println("\n------Task-7----- \n");

            char d1 = '8';
                 if(d1 >= 65 && d1 <= 90 || d1 >= 97 && d1 <= 122) {
            System.out.println("Character is a letter");}

                else if(d1 >= 48 && d1 <= 57){
                System.out.println("Character is a digit");
                }
                    else {
                     System.out.println("Character is a special character");
                 }
                    System.out.println("End of the program!");


            }
        }
    