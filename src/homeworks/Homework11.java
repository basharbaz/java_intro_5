package homeworks;

import sun.util.calendar.BaseCalendar;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("\n==============Task 1===============");
        String str1 = " Hello World   ";
        System.out.println(noSpace(str1));

        System.out.println("\n==============Task 2===============");
        String str2 = "Tech Global";
        System.out.println(replaceFirstLast(str2));

        System.out.println("\n==============Task 3===============");
        String str3 = "Java";
        System.out.println(hasVowel(str3));

        System.out.println("\n==============Task 4===============");
        //checkAge();

        System.out.println("\n==============Task 5===============");
        System.out.println(averageOfEdges(-2,-2,10));
        System.out.println(averageOfEdges(0,0,6));


        System.out.println("\n==============Task 6===============");
        String[] arr = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(arr)));

        System.out.println("\n==============Task 7===============");
        int[] a7 = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(a7)));

        System.out.println("\n==============Task 8===============");
        int[] a8 = {7, 4, 11, 23, 17};
        int[] a81 = {41, 53, 19, 47, 67};
        int[] a82 = {-10, -3, 0, 1};
        System.out.println(countPrimes(a8));
        System.out.println(countPrimes(a81));
        System.out.println(countPrimes(a82));

    }

    public static String noSpace(String str) {
        return str.replaceAll(" ", "");
    }

    public static String replaceFirstLast(String str) {
        String str2 = "";
        str2 = str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        return str2;
    }
    public static boolean hasVowel(String str) {
        boolean hasVowel = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') hasVowel = true;}
        return hasVowel;
    }
    public static void checkAge(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter year of birth");
        int year = scan.nextInt(); scan.nextLine();
        if(2022 - year >= 16 && 2022 - year < 100) System.out.println("AGE IS ALLOWED");
        else if (2022 - year < 16 && 2022 - year >= 0) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS NOT VALID");
    }
    public static int averageOfEdges(int a, int b, int c){
        int average = (Math.max(Math.max(a,b),c) + Math.min(Math.min(a,b),c)) / 2;
        return average;
    }
    public static String[] noA(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().startsWith("a")) arr[i] = arr[i].replaceAll(arr[i],"###");
        }return arr;
    }
    public static int[] no3or5(int[] arr){
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 15 == 0) a[i] = 101;
            else if (arr[i] % 3 == 0) a[i] = 100;
            else if (arr[i] % 5 == 0) a[i] = 99;
            else a[i] = arr[i];
        }return a;
    }
    public static int countPrimes(int[] arr){
        int countPrime = 0;
        for (int i : arr) {
            if(i / 2 !=0 && i / 3 !=0 && i / 5 !=0 && i / 7 !=0 && i >= 0) countPrime++;
        }return countPrime;
    }
}