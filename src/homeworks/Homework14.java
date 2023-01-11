package homeworks;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("========TASK-1========");
        fizzBuzz1(3);
        System.out.println("=========");
        fizzBuzz1(5);
        System.out.println("=========");
        fizzBuzz1(16);


        System.out.println("========TASK-2=======");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        System.out.println("========TASK-3=========");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));

        System.out.println("========TASK-4=========");
        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));

        System.out.println("========TASK-5==========");
        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));


    }

    /*TASK1
    -Create a method called fizzBuzz1()
    -This method will take an int argument, and it will print numbers starting from 1
    to given argument. BUT, it will print “Fizz” for the numbers divided by 3,
    “Buzz” for the numbers divided by 5, and “FizzBuzz” for the numbers divided both by 3 and 5.

    Test Data 1: 3
    Expected Result 1:
    1
    2
    Fizz

    Test Data 2: 5
    Expected Result 2:
    1
    2
    Fizz
    4
    Buzz

     */
    public static void fizzBuzz1(int argument){
        for (int i = 1; i <= argument; i++) {
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }

    /*TASK-2
    Requirement:
    -Create a method called fizzBuzz2()
    -This method will take an int argument, and it will return a String.
    BUT it will return “Fizz” if the given number is divided by 3, “Buzz”
    if the number is divided by 5, and “FizzBuzz” if the number is divided both by 3 and 5.
    Otherwise, it will return number itself.

    Test Data 1: 0
    Expected Result 1: FizzBuzz

    Test Data 2: 1
    Expected Result 2: 1

    Test Data 3: 3
    Expected Result 3: Fizz

    Test Data 4: 5
    Expected Result 4: Buzz

    Test Data 5: 15
    Expected Result 5: FizzBuzz
     */

    public static String fizzBuzz2(int argument){
        if (argument % 15 == 0) return "FizzBuzz";
        else if (argument % 5 == 0) return "Buzz";
        else if (argument % 3 == 0) return "Fizz";
        return argument + "";
    }

    /* TASK-3
    Requirement:
    -Create a method called findSumNumbers()
    -This method will take a String argument and it will return an int which is the sum of all numbers presented in the String.

    NOTE: If there are no numbers represented in the String, return 0.

    Test Data 1: “abc$”
    Expected Result 1: 0

    Test Data 2: “a1b4c  6#”
    Expected Result 2: 11

    Test Data 3: “ab110c045d”
    Expected Result 3: 155

    Test Data 4: “525”
    Expected Result 4: 525

     */

    public static int findSumNumbers(String str){

        String[] arr = str.split("[^0-9]");

        int sumOfNumbers = 0;

        for (String s : arr) {
            if (!s.isEmpty()) sumOfNumbers += Integer.parseInt(s);
        }
        return sumOfNumbers;
    }

    /*
    Requirement:
    -Create a method called findBiggestNumber()
    -This method will take a String argument and it will return an int which is the number presented in the String.

    NOTE: If there are no numbers represented in the String, return 0.

    Test Data 1: “abc$”
    Expected Result 1: 0

    Test Data 2: “a1b4c  6#”
    Expected Result 2: 6

    Test Data 3: “ab110c045d”
    Expected Result 3: 110

    Test Data 4: “525”
    Expected Result 4: 525
     */

    public static int findBiggestNumber(String str){

        String[] arr = str.split("[^0-9]");
        int biggestNumber = Integer.MIN_VALUE;
        for (String s : arr) {
            if(!s.isEmpty() && Integer.parseInt(s) > biggestNumber) biggestNumber = Integer.parseInt(s);
        }
        return biggestNumber;
    }

    /*
    Requirement:
    -Create a method called countSequenceOfCharacters()
    -This method will take a String argument and it will return a
    String which is the count of repeated characters in a sequence in the String.
    NOTE: If given String is empty, then return empty String.
    NOTE: It is case sensitive!!!

    Test Data 1: “”
    Expected Result 1: “”

    Test Data 2: “abc”
    Expected Result 2: “1a1b1c”

    Test Data 3: “abbcca”
    Expected Result 3: “1a2b2ca”

    Test Data 4: “aaAAa”
    Expected Result 4: “2a2A1a”

     */

    public static String countSequenceOfCharacters(String str){
        String answer = "";
        int count = 1;         //    abbccaa
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)){
                count++;
            }else{
                answer += String.valueOf(count) + str.charAt(i); // 1a 2b 2c 2a
                count = 1;
            }
            if(i == str.length()-2) answer += String.valueOf(count) + str.charAt(i+1);
        }
        return answer;
    }


}

