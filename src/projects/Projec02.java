package projects;

import java.util.Scanner;

public class Projec02 {


    public static void main(String[] args) {

        System.out.println("\n===========TASK1============\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three numbers ");

        int number1 = input.nextInt();

        int number2 = input.nextInt();

        int number3 = input.nextInt();

        System.out.println("The product of the numbers entered is = " + (number1 * number2 * number3));


        input.nextLine();



        ///////////////////////////////////////////////////////


        System.out.println("\n===========TASK2============\n");


        Scanner input2 = new Scanner(System.in);


        System.out.println("What is your first name? ");

        String firstname = input2.nextLine();

        System.out.println("What is your last name? ");

        String lastname = input2.nextLine();

        System.out.println("What is your year of birth? ");

        int date_of_birth = input2.nextInt();

        System.out.println((firstname) + " " + (lastname)+ "'s" + " " + "age is = " + (2022 - date_of_birth));


        ///////////////////////////////////////////////////////



        System.out.println("\n===========TASK3============\n");


        Scanner input3 = new Scanner(System.in);

        System.out.println("What is your full name?");

        String fullname = input3.nextLine();

        System.out.println("What is your weight?");

        int weight = input.nextInt();

        System.out.println(fullname + "'s weight is = " + weight * 2.205  + " lbs." );



        ///////////////////////////////////////////////////////



        System.out.println("\n===========TASK4============\n");


        Scanner input4 = new Scanner(System.in);

        System.out.println("What is your full name?");

        String fullname01 = input4.nextLine();

        System.out.println("What is your age?");

        int age = input4.nextInt();

        input4.nextLine();
        System.out.println("What is your full name?");

        String fullname02 = input4.nextLine();

        System.out.println("What is your age?");

        int age2 = input4.nextInt();

        input4.nextLine();

        System.out.println("What is your full name?");

        String fullname03 = input4.nextLine();

        System.out.println("What is your age?");

        int age3 = input4.nextInt();
        input4.nextLine();

        System.out.println(fullname01 + "'s age is " + age +".");
        System.out.println(fullname02 + "'s age is " + age2 +".");
        System.out.println(fullname03 + "'s age is " + age3 +".");
        System.out.println("The average age is " + ((age+age2+age3) / 3) + ".");
        System.out.println("The eldest age is " + Math.max(age3, Math.max(age,age2))+ ".");
        System.out.println("The youngest age is " + Math.min(age3, Math.min(age,age2))+ ".");


    }



}
