package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        System.out.println("\n===========TASK1============\n");

        String result = "";

        for (int i = 1; i <= 100; i++)
            if (i % 7 == 0) {
                result += i + " - ";
            }
        System.out.print(result.substring(0, result.length() - 3));


       System.out.println("\n===========TASK2============\n");

        String r2 = "";

        for (int i = 1; i <= 50; i++)
            if (i % 6 == 0){
                r2 += i + " - ";
            }
        System.out.println(r2.substring(0, r2.length() - 3));



        System.out.println("\n===========TASK3============\n");
        String r3 = "";
        for (int i = 100; i >= 50; i--)
            if (i % 5 == 0) {
                r3 += i + " - ";
            }
        System.out.println(r3.substring(0, r3.length() - 3));


        System.out.println("\n===========TASK4============\n");
        String r4 = "";
        for (int i = 0; i <= 7; i++){
            r4 += i + " - ";
        }
        System.out.println(r4.substring(0, r4.length() - 3));


        System.out.println("\n===========TASK5============\n");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);


        System.out.println("\n===========TASK6============\n");


        Scanner input = new Scanner(System.in);
        int positiveNumber;
        int f = 1;
        int factorial = 1;
        System.out.println("Please enter a positive number");
        positiveNumber = input.nextInt();

        while (positiveNumber >= f) {
            factorial *= f;
            f++;
        }
        System.out.println(positiveNumber + "! = " + factorial);


        System.out.println("\n===========TASK7============\n");

        Scanner input2 = new Scanner(System.in);

        String fullName;
        int counter = 0;

        System.out.println("Please enter your full name");
        fullName = input2.nextLine();

        for (int i = 0; i <= fullName.length() - 1; i++) {
            if (fullName.charAt(i) == 'a' || fullName.charAt(i) == 'e' || fullName.charAt(i) == 'i' ||
                    fullName.charAt(i) == 'o' || fullName.charAt(i) == 'u' ||
                    fullName.charAt(i) == 'A' || fullName.charAt(i) == 'E' || fullName.charAt(i) == 'I' ||
                    fullName.charAt(i) == 'O' || fullName.charAt(i) == 'U') counter++;
        }
        System.out.println("There are " + counter + " vowel letters in this full name");


        System.out.println("\n===========TASK8============\n");


        System.out.println("\n===========TASK9============\n");

        Scanner input4 = new Scanner(System.in);
        int count_, num1 = 0, num2 = 1;
        System.out.println("Please enter a number");
        count_ = input4.nextInt();
        int i = 1;
        while (i <= count_) {
            System.out.print(num1 + " ");
            int sumOf2Numbers = num1 + num2;
            num1 = num2;
            num2 = sumOf2Numbers;
            i++;


        }

        System.out.println("\n===========TASK10============\n");

        Scanner input5 = new Scanner(System.in);

        String name;
        System.out.println("Please enter a name");
        name = input5.nextLine();

        do {

            if (name.indexOf('J') != 0 || name.indexOf('j') != 0) {
            }
            System.out.println("Enter a name");
            input5.nextLine();
        }
        while (name.indexOf('J') == 1 || name.indexOf('j') == 1);

        System.out.println("End of program");

    }
}