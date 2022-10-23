package ternary_operator;

public class Exercise2_FindMin {
    /*
TASK
Write a program that generates 2 random numbers bt 1 and 10
Find and print the smallest number

USE TERNARY
 */

    public static void main(String[] args) {

        int num1 =  (int)(Math.random() * 100) + 1;
        int num2 =  (int)(Math.random() * 100) + 1;

        System.out.println("Random 1 = " + num1);
        System.out.println("Random 2 = " + num2);

        int min = num1 < num2 ? num1 : num2;

    }
}
