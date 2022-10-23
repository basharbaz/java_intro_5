package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {


        System.out.println("\n-----------Task1-----------------");
        Scanner task1 = new Scanner(System.in);

        System.out.println("Please input two numbers ");
        int num1 = task1.nextInt();
        int num2 = task1.nextInt();

        System.out.println("The difference between numbers is = " + (Math.abs(num1 - num2)));


        System.out.println("\n-----------Task2-----------------");


        Scanner task2 = new Scanner(System.in);

        System.out.println("Please input five numbers ");

        int number1 = task2.nextInt();
        int number2 = task2.nextInt();
        int number3 = task2.nextInt();
        int number4 = task2.nextInt();
        int number5 = task2.nextInt();

        System.out.println("Max value = " + Math.max(Math.max((Math.max(number1, number2)), (Math.max(number3, number4))), number5));

        System.out.println("Min value = " + Math.min(Math.min((Math.min(number1, number2)), (Math.min(number3, number4))), number5));


        ///////////////////////////


        System.out.println("\n-----------Task3-----------------");


        int RandomBetween50to100_1 = (int) (Math.random() * (100 - 50 + 1) + 50);

        System.out.println("Number 1 = " + RandomBetween50to100_1);

        int RandomBetween50to100_2 = (int) (Math.random() * (100 - 50 + 1) + 50);

        System.out.println("Number 2 = " + RandomBetween50to100_2);

        int RandomBetween50to100_3 = (int) (Math.random() * (100 - 50 + 1) + 50);

        System.out.println("Number 3 = " + RandomBetween50to100_3);

        System.out.println("The sum of numbers is = " + (RandomBetween50to100_1 + RandomBetween50to100_2 + RandomBetween50to100_3));


/////////////////////////////////////////////

        System.out.println("\n-----------Task4-----------------");

        int alex = 125;
        int mike = 220;

        double alexgivemike = (125 - 25.5);
        double mikegetfromalex = (220 + 25.5);

        System.out.println("Alex's money: " + alexgivemike + "$");
        System.out.println("Alex's money: " + mikegetfromalex + "$");


        /////////////////////////////////////////////

        System.out.println("\n-----------Task5-----------------");

        int bikeprice = 390;
        double b2 = 15.60;

        double b3 = (bikeprice / b2);

        System.out.println(b3);


        //////////////

        System.out.println("\n-----------Task6-----------------");

        String s1 = "5", s2 = "10";

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("Sum of 5 and 10 is = " + (i1 + i2));

        System.out.println("Product of 5 and 10 is = " + i1 * i2);

        System.out.println("Division of 5 and 10 is = " + i1 / i2);

        System.out.println("Subtraction of 5 and 10 is = " + (i1 - i2));

        System.out.println("Remainder of 5 and 10 is = " + i1 % i2);


        ////////////////////////////////////


        System.out.println("\n-----------Task7-----------------");


        String s11 = "200" , s22 = "-50" ;

        int i11 = Integer.parseInt(s11);
        int i22 = Integer.parseInt(s22);




        System.out.println("The greatest value is = " + Math.max(i11, i22));
        System.out.println("The smallest value is = " + Math.min(i11, i22));
        System.out.println("The average is = " + (i11 + i22) / 2);
        System.out.println("The absolute difference is = " + Math.abs(i11 - i22));


/////////////////////////////////////////////////////


        System.out.println("\n-----------Task8-----------------");


        double moneysave1 = 0.96;

        System.out.println((int) (24 / moneysave1) + " days");
        System.out.println((int) (168 / moneysave1) + " days");
        System.out.println("$" + 150 * moneysave1);


///////////////////////////////////////////////////////////////////////////////


        System.out.println("\n-----------Task9-----------------");


        double jessiesave = 1250;
        double dailysave = 62.5;

        System.out.println((int) (jessiesave / dailysave));


////////////////////////////


        System.out.println("\n-----------Task10-----------------");

        double dansave = 14265;

        System.out.println("Option 1 will take " + (int) (dansave / 475.5) + " months");
        System.out.println("Option 1 will take " + (int) (dansave / 951) + " months");


///////////////////////////////////////////


        System.out.println("\n-----------Task11-----------------");

        Scanner task11 = new Scanner(System.in);

        int nn1 = task11.nextInt();
        int nn2 = task11.nextInt();

        System.out.println((double) nn1 / nn2);


/////////////////////////////////////////////


        System.out.println("\n-----------Task12-----------------");

        int randomNumber = (int) (Math.random() * 101);

        int randomNumber2 = (int) (Math.random() * 101);

        int randomNumber3 = (int) (Math.random() * 101);

        System.out.println(randomNumber);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);

        if (randomNumber > 25) {
            System.out.println("True");
        } else {
            System.out.println("false");
            {

            }
        }
        if (randomNumber2 > 25) {
            System.out.println("True");
        } else {
            System.out.println("false");
            {

            }
        }
        if (randomNumber3 > 25) {
            System.out.println("True");
        } else {
            System.out.println("false");
            {

            }
        }

        /////////////////////////////////////////////


        System.out.println("\n-----------Task13-----------------");


        Scanner task13 = new Scanner(System.in);

        System.out.println("enter a number between 1 to 7 ");

        int daynumber = task13.nextInt();

        if (daynumber == 1) {
            System.out.println("The number entered returns MONDAY");
        } else if (daynumber == 2) {
            System.out.println("The number entered returns TUESDAY");
        } else if (daynumber == 3) {
            System.out.println("The number entered returns WEDNESDAY");
        } else if (daynumber == 4) {
            System.out.println("The number entered returns THURSDAY");
        } else if (daynumber == 5) {
            System.out.println("The number entered returns FRIDAY");
        } else if (daynumber == 6) {
            System.out.println("The number entered returns SATURDAY");
        } else if (daynumber == 7) {
            System.out.println("The number entered returns SUNDAY");
        }


        //////////////////////////////////////


        System.out.println("\n-----------Task14-----------------");


        Scanner task14 = new Scanner(System.in);

        System.out.println("Tell me your exam results?");

        int grade = task14.nextInt();

        int grade2 = task14.nextInt();

        int grade3 = task14.nextInt();


        if ((grade + grade2 + grade3) / 3 >= 70) {
            System.out.println("YOU PASSED!");
        } else {
            {
                System.out.println("YOU FAILED!");
            }


        }


        //////////////////////////////////////


        System.out.println("\n-----------Task15-----------------");


        Scanner task15 = new Scanner(System.in);

        System.out.println("Enter 3 numbers");

        int numb1 = task15.nextInt();
        int numb2 = task15.nextInt();
        int numb3 = task15.nextInt();

        if (numb1 == numb2 && numb2 == numb3 && numb1 == numb3) {
            System.out.println("TRIPLE MATCH");
        } else if (numb1 == numb2) {
            System.out.println("DOUBLE MATCH");
        } else if (numb2 == numb3) {
            System.out.println("DOUBLE MATCH");
        } else if (numb1 == numb3) {
            System.out.println("DOUBLE MATCH");
        } else if (numb1 != numb2 && numb2 != numb3 && numb1 != numb3) {
            System.out.println("NO MATCH");
        } else {
            System.out.println("Wrong entry");
            {

            }
        }
    }
}







































