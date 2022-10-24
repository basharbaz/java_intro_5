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
            System.out.println(str.substring(str.length()-4 ) +str.substring(4,str.length()-4)+str.substring(0,4));
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
            System.out.println("Middle char is = " + (name.substring(name.length()/2-1, name.length()/2+1)));

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

        String address2 = address.replace('a','*')
                .replace('e','#')
                .replace('i','+')
                .replace('u','$')
                .replace('o','@');

        System.out.println(address2);

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
            if (i % 5 != 0 ) answer += i + " - ";

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

        for (int i = word.length() -1; i >=0 ; i--) {
            reverse+= word.charAt(i);

        }
        if (word.length() == 0) System.out.println("This word does not have 1 or more characters");
        else if(word.equals(reverse)) System.out.println("This word is palindrome");
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

