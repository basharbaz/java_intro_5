package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
        System.out.println("===========TASK1============\n");

        String str = ScannerHelper.getAString();

        if (str.length()<8) System.out.println("This String does not have 8 characters");
        else {
            System.out.println(str.substring(str.length()-4 ) +   str.substring(4,str.length()-4)   +   str.substring(0,4));
        }

        System.out.println("===========TASK2============\n");

     //   Selenium is an automation tool

        String str2 = ScannerHelper.getAString();

        if (!str2.contains(" ")){
            System.out.println("This sentence does not have 2 or more words to swap");
        }
        else {
            System.out.println(str2.substring(str2.lastIndexOf( ' ') + 1) +
                    str2.substring(str2.indexOf(' '),str2.lastIndexOf(' ') + 1 )+
                    str2.substring(0 , str2.indexOf(' ') ));

        }

        System.out.println("===========TASK3============\n");

        String str_1 = "These books are so stupid";
        String str_2 = "I like idiot behaviors";
        String str_3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println(str_1.replace("stupid","nice"));
        System.out.println(str_2.replace("idiot","nice"));
        System.out.println(str_3.replace("stupid","nice").replace("idiot","nice"));



        System.out.println("===========TASK4============\n");

        String name = ScannerHelper.getAName();
        if(name.length()<2) System.out.println("Invalid input!!!");

        if(name.length() % 2 == 0) {
            System.out.println("Middle char is = " + (name.substring(name.length()/2 - 1, name.length()/2 + 1)));

        }
        if (name.length() % 2 == 1)  {
            System.out.println("Middle char is = " + (name.charAt(name.length() / 2)));

        }

        System.out.println("===========TASK5============\n");

        System.out.println("Enter a country.");
        String name2 = ScannerHelper.getAName();
        if(name2.length()>5){
            name2 = name2.substring(2, name2.length() - 2);
            System.out.println(name2);
        }
        else System.out.println("Invalid input!!!");



        System.out.println("===========TASK6============\n");

        System.out.println("enter your address.");

        String address = ScannerHelper.getAnAddress();

        //String address = "2860 S River Rd Suite 350, Des Plaines IL 60018";

        if (address.contains("a") || address.contains("A") || address.contains("e") || address.contains("E") ||
                address.contains("i") || address.contains("I") || address.contains("o") || address.contains("O") ||
                address.contains("u") || address.contains("U"))

            System.out.println(address.replaceAll("a", "*").replaceAll("A", "*")
                    .replaceAll("e", "#").replaceAll("E", "#")
                    .replaceAll("i", "+").replaceAll("I", "+")
                    .replaceAll("o", "$").replaceAll("O", "$")
                    .replaceAll("u", "@").replaceAll("U", "@"));



        System.out.println("===========TASK7============\n");

      /*  Write a program that generates 2 random numbers between 0 and 25 (0 and 25 are included),
      Then print all numbers between 2 random numbers that cannot be divided by 5 in ascending order.
                Test data:
        int randomNumber1 = 12;
        int randomNumber1 = 4;
        Expected output:
        4 – 6 – 7 – 8 – 9 – 11 – 12*/

        int randomNumber1 = RandomNumberGenerator.getARandomNumber(0,25);
        int randomNumber2 = RandomNumberGenerator.getARandomNumber(0,25);

        System.out.println("Random number 1 is = " + randomNumber1);
        System.out.println("Random number 2 is = " + randomNumber2);

        String answer = "";

        for (int i = Math.min(randomNumber1,randomNumber2); i <= Math.max(randomNumber1,randomNumber2) ; i++) {
            if (i % 5 != 0 ) answer +=  i + " - ";

        }
        System.out.println(answer.substring(0,answer.length() -3));


        System.out.println("===========TASK8============\n");

        String sentence1 = ScannerHelper.getAString();

        int counter = 0;

        if(!sentence1.contains(" ")) System.out.println("This sentence does not have multiple words");
        else {
            for (int i = 0; i < sentence1.length(); i++) {
                if(sentence1.charAt(i) == ' ') counter++;
                
            }
            System.out.println("This sentence has " + (counter + 1) + " words.");
            
        }

        System.out.println("===========TASK9============\n");

        int positiveNumber = ScannerHelper.getANumber();

        for (int i = 1; i <= positiveNumber ; i++) {
            if (i % 6 == 0 ) System.out.println("FooBar");
            else if (i % 2 == 0 ) System.out.println("Foo");
            else if (i % 3 == 0 ) System.out.println("Bar");
            else System.out.println(i);


        }

        System.out.println("===========TASK10============\n");

        String word = ScannerHelper.getAName();

        String reverse = "";
        //  0  1   2   3  4
//          c   i  v   i   c
      //   -5  -4 -3  -2  -1
        for (int i = word.length() -1; i >=0 ; i--) {
            reverse+= word.charAt(i);

        }
        if (word.length() == 0) System.out.println("This word does not have 1 or more characters");
        else if(word.equalsIgnoreCase(reverse)) System.out.println("This word is palindrome");
        else System.out.println("This word is not palindrome");

        System.out.println("===========TASK11============\n");

        String sentence2 = ScannerHelper.getAString();

        int counter2 = 0;

        if(sentence2.length() < 1 ) System.out.println("This sentence does not have any characters");
        else {
            for (int i = 0; i < sentence2.length(); i++) {
                if(sentence2.toLowerCase().charAt(i) == 'a')
                    counter2++;

            }
            System.out.println("This sentence has " + counter2 + " a or A letters.");
        }


    }
}

/*
package projects;

import utilities.RandomNumberGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
        // Task 11 //
        /*
        Write a program that asks user to enter a sentence as a String and count
        how many a or A letters that sentence has and print it with given below
        message. ex. This sentence has 3 a or A letters.
         
        System.out.println("**** TASK 11 ****");
                Scanner input = new Scanner(System.in);
                System.out.println("Please input a string:");
                String ans11 = input.nextLine();
                int counter = 0;

                if (ans11.length() == 0 || (!ans11.contains("a") && !ans11.contains("A"))) {
                System.out.println("This sentence does not have any characters.");
                }
                else {
                for (int i = 0; i < ans11.length(); i++) {
        if (ans11.charAt(i) == 'a' || ans11.charAt(i) == 'A') counter++;
        }
        System.out.println("This sentence has " + counter + " a or A letters.");
        }

        // Task 10 //
        /*
        Write a program that asks user to enter a word, and check if it is palindrome or not.
        Palindrome: It is a word that is read the same backward as forward
        •EX/ kayak, civic, madam

        System.out.println("**** Task 10 ****");
        System.out.println("Please enter a string: ");
        String ans10 = input.nextLine();
        boolean isPalindrome = true;

        if (ans10.length() < 1) {
        System.out.println("This word does not have 1 or more characters.");
        } else {
        for (int i = 0, j = ans10.length() - 1; i <= ans10.length() / 2; i++, j--) {
        if (ans10.charAt(i) == ans10.charAt(j)) {
        isPalindrome = false;
        break;
        }
        }
        if (isPalindrome) System.out.println("This word is a palindrome");
        else System.out.println("This word is not a palindrome");
        }

        // Task 9
        /*
        Write a program that asks user to enter a positive number.
        Print all the number starting from 1 to given number. But, print “Foo” for the
        numbers divided by 2, “Bar” for the numbers divided by 3 and “FooBar” for
        the numbers divided by both 2 and 3.

        System.out.println("**** Task 9 ****");
        System.out.println("Please enter a positive number:");
        int ans9 = input.nextInt();

        for (int i = 1; i <= ans9; i++) {
        if (i % 6 == 0) System.out.println("FooBar");
        else if (i % 3 == 0) System.out.println("Bar");
        else if (i % 2 == 0) System.out.println("Foo");
        else System.out.println(i);
        }

        // Task 8 //
        /*
        Write a program that asks user to enter a sentence as a String, and count
        how many words that sentence has, and print it with given below message.
        NOTE: Write a program that handles any String
        NOTE: First check if the given sentence has 2 words at least. If not, then just
        print “This sentence does not have multiple words”.

        System.out.println("**** Task 8 ****");
        System.out.println("Please enter a sentence:");
        input.nextLine();
        String ans8 = input.nextLine().trim(); // I love animals ([I] , [love], [animals])

        if (ans8.contains(" ")) {
        String[] array8 = ans8.split(" ");
        System.out.println("This sentence has " + array8.length + " words.");
        } else {
        System.out.println("This sentence does not have multiple words.");
        }

        // Task 7 //

        Write a program that generates 2 random numbers between 0 and 25 (0 and
        25 are included), Then print all numbers between 2 random numbers that
        cannot be divided by 5 in ascending order. ex. 4 - 6 - 7 - 8 - 9....

        System.out.println("**** Task 7 ****");
        int num7A = RandomNumberGenerator.getARandomNumber(0, 25);
        int num7B = RandomNumberGenerator.getARandomNumber(0, 25);

        String ans7 = "";

        int min7 = Math.min(num7A, num7B);
        int max7 = Math.max(num7A, num7B);

        for (int i = min7; i <= max7; i++) {
        if (i % 5 != 0) {
        ans7 += i;
        if (i + 1 == max7 && i % 5 != 0) break;
        else {
        ans7 += " - ";
        }
        }
        }

        System.out.println("Min random num = " + min7);
        System.out.println("Max random num = " + max7);
        System.out.println(ans7);


        // Task 6 //
        /*
        Write a program that asks user to enter their full address.
        Replace all letter ‘a’ or ‘A’ with ‘*’
        Replace all letter ‘e’ or ‘E’ with ‘#’
        Replace all letter ‘i’ or ‘I’ with ‘+’
        Replace all letter ‘u’ or ‘U’ with ‘$’
        Replace all letter ‘o’ or ‘O’ with ‘@’
        Then, print result after replacements
         */


        // Task 5 //
        /*
        Write a program that asks user to enter a country.
        First check if length of country is more than 5. If not, then print “Invalid
        input!!!”
        If length of country is more than 5, then print country name without first 2
        and last 2 characters
         */


        // Task 4 //
        /*
        Write a program that asks user to enter their name.
        First check if length of name is more than 2 and is even or odd
        If length of name is less than 2, then print “Invalid input!!!”
        If length of name is odd, then print middle character from the name
        If length of name is even, then print middle 2 characters from the name
         */


        // Task 3 //
        /*
        Assume that you are given some Strings as below, and you want to replace
        bad words with good words.
        String str1 = “These books are so stupid”;
        String str2 = “I like idiot behaviors”;
        String str3 = “I had some stupid t-shirts in the past and also some idiot
        look shoes”;
        Write a Java program that checks any given String and replace bad words
        like “stupid” and “idiot” with “nice” keyword
         */


        // Task 2 //
        /*
        Write a program that asks user to enter a sentence, and swaps first and last
        words of this sentence and print the modified sentence
        Check: sentence has at least 2 words

        System.out.println("**** Task 2 ****");
        System.out.println("Please enter a sentence:");
        String ans2 = input.nextLine().trim(); // Selenium is an automation tool

        if (ans2.contains(" ")) {
        String firstWord = ans2.substring(0, ans2.indexOf(" "));
        String lastWord = ans2.substring(ans2.lastIndexOf(" ") + 1);

        System.out.println(lastWord
        + ans2.substring(ans2.indexOf(" "), ans2.lastIndexOf(" "))
        + firstWord);
        } else {
        System.out.println("This sentence does not have 2 or more words to swap");
        }




        // Task 1 //
        /*
        Write a program that asks user to enter a String, and swaps first and last 4
        characters of this String and print the modified String

        }
        }

 */