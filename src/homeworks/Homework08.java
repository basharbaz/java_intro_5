package homeworks;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Homework08 {
    public static void main(String[] args) {
        System.out.println("\n--------- Task 1 ----------\n");
        String str = "hello";
        System.out.println(countConsonants(str));
        System.out.println("\n--------- Task 2 ----------\n");
        String string = "Hello, nice to meet you!!";
        System.out.println(wordArray(string));
        System.out.println("\n--------- Task 3 ----------\n");
        String s = "Hello,    nice to   meet     you!!";
        System.out.println(removeExtraSpaces(s));
        System.out.println("\n--------- Task 4 ----------\n");
        String sentence = "Hi, my name is John Doe";
        System.out.println(count3OrLess(sentence));
        System.out.println("\n--------- Task 5 ----------\n");
        String dob = "01/21/1999";
        System.out.println(isDateFormatValid(dob));
        System.out.println("\n--------- Task 6 ----------\n");
        String email = "abc@gmail.com";
        System.out.println(returnEmail(email));
    }
    /*
TAsk - 1
Requirement:
Write a method named countConsonants() that takes a
String as an argument a returns how many consonants
are in the String.
NOTE: You must use regex
Example program1:
String str = “hello”;
Program: 3
Example program2:
String str = “JAVA”;
Program: 2
Example program2:
String str = “”;
Program: 0
*/
    public static int countConsonants(String str){
        return str.toLowerCase().replaceAll("[aeiou]","").trim().length();
    }
    /*
Task-2
Requirement:
Write a method named wordArray() that takes a String
as an argument a returns a String array with all the
words in the String
NOTE: Make as dynamic as possible.
Example program1:
String str = “hello”;
Program: [hello]
Example program2:
String str = “java  is    fun”;
Program: [java, is, fun]
Example program2:
String str = “Hello, nice to meet you!!”;
Program: [Hello, nice, to, meet, you]
*/
    public static String[] wordArray(String str){
        str = str.replaceAll("\\s+"," ").trim();
        String[] array = str.replaceAll("[A-Za-z\\s]","").split(" ");
        return array;
    }
    /*
Task-3
Requirement:
Write a method named removeExtraSpaces() that takes
a String as an argument a returns the String back with
all extra spaces removed.
NOTE: Make sure you use regex
Example program1:
String str = “hello”;
Program: hello
Example program2:
String str = “java  is    fun”;
Program: java is fun
Example program2:
String str = “Hello,    nice to   meet     you!!”;
Program: Hello, nice to meet you!!
*/
    public static String removeExtraSpaces(String str){
        str = str.replaceAll("\\s+", " ").trim();
        return str;
    }
    /*
Task-4
Requirement:
Write a method named count3OrLess() that asks the
user to enter a sentence. Return a count of how many
words are 3 characters long or less.
NOTE: You must use regex
Example program1:
String str = “I go to TechGlobal”;
Program: 3
Example program2:
String str = “Hi, my name is John Doe”;
Program: 4
Example program2:
String str = “Hello guys”;
Program: 0
*/
    public static int count3OrLess(String sentence){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        sentence = input.nextLine();
        String[] s = sentence.split("[A-Za-z]{4,}");
        Pattern pattern = Pattern.compile("[A-Za-z]{1,3}");
        Matcher matcher = pattern.matcher(Arrays.toString(s));
        int counter =0;
        while (matcher.find()){
            counter++;
        }
        return counter;
    }
    /*
Task-5
Requirement:
Write a method named isDateFormatValid() that takes a
String dateOfBirth as an argument and checks if the given
date matches the given DOB requirements.
This method would return a true or false boolean
Format: nn/nn/nnnn
Example program1:
String dateOfBirth = “01/21/1999”;
Program: true
Example program2:
String dateOfBirth = “1/20/1991”;
Program: false
Example program3:
String dateOfBirth = “10/2/1991”;
Program: false
Example program4:
String dateOfBirth = “12-20 2000”;
Program: false
Example program5:
String dateOfBirth = “12/16/19500”;
Program: false
*/
    public static boolean isDateFormatValid(String dateOfBirth){
        return(Pattern.matches("[\\d]{2,}[/]\\d]{2,}[/][\\d]{4,}",dateOfBirth));
    }
    /*
Task-6
Requirement:
Write a method named isEmailFormatValid() that takes a String
email as an argument and checks if the given email matches
the given email requirements.
This method would return a true or false boolean.
Format: <2+chars>@<2+chars>.<2+chars>
NOTE: Do not use any type of loop. Use Regex
Example program1:
String email = “abc@gmail.com”;
Program: true
Example program2:
String email = “abc@student.techglobal.com”;
Program: true
Example program3:
String email = “a@gmail.com”;
Program: false
Example program4:
String email = “abcd@@gmail.com”;
Program: false
Example program5:
String email = “abc@gmail”;
Program:false
*/
    public static boolean returnEmail (String email){
        return (Pattern.matches("[\\w]{2,}[@][\\w]{2,}\\.[\\w]{2,}",email));
    }
}