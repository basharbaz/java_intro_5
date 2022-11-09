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

        for (int i = 0; i <= 7; i++){

            System.out.println("The square of " + i + " is = " + i * i);
        }



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

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter a positive number:");
//        int number = scan.nextInt();
//
//        int factorial = 1;                     // container must start at 1 not 0 : i == 0
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;                     // 'i' represent the value of each iteration
//        }
//        System.out.println(factorial);
//
//        System.out.println("\nEND OF THE PROGRAM");


        System.out.println("\n===========TASK7============\n");

        Scanner input2 = new Scanner(System.in);


        int counter = 0;

        System.out.println("Please enter your full name");
        String fullName = input2.nextLine();

        for (int i = 0; i <= fullName.length() - 1; i++) {
            if (fullName.charAt(i) == 'a' || fullName.charAt(i) == 'e' || fullName.charAt(i) == 'i' ||
                    fullName.charAt(i) == 'o' || fullName.charAt(i) == 'u' ||
                    fullName.charAt(i) == 'A' || fullName.charAt(i) == 'E' || fullName.charAt(i) == 'I' ||
                    fullName.charAt(i) == 'O' || fullName.charAt(i) == 'U')   counter++;
        }
        System.out.println("There are " + counter + " vowel letters in this full name");


        System.out.println("\n===========TASK8============\n");


        int sum8 = 0;
        do {
            System.out.println("Please enter a number");
            int n = input.nextInt();
            sum8 += n;
            if (n < 100 && sum8 < 100) {
                System.out.println("Please enter a number");
                n = input.nextInt();
                sum8 += n;
            }
            else if (n > 100) System.out.println("This number is already more than 100");

        } while (sum8 < 100);
        System.out.println("Sum of entered numbers is at least 100");
        input.nextLine();


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
//        int fibonacci = 7, n1 = 0, n2 = 1, n3;
//        String container = "";
//
//        for (int i = 0; i < fibonacci; i++){
//            container += n1 + " - ";
//            n3 = n1 + n2;
//            n1 = n2; // the variables are reassigned each iteration w/ the previous values. ex: zero becomes 1 and one becomes the value of the sum
//            n2 = n3;
//        }
//        System.out.println(container.substring(0, container.length() - 3));
//
//        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n===========TASK10============\n");

        Scanner input5 = new Scanner(System.in);


        System.out.println("Please enter a name");
        String name = input5.nextLine();

        do {

            if (name.indexOf('J') != 0 || name.indexOf('j') != 0) {
            }
            System.out.println("Enter a name");
            input5.nextLine();
        }
        while (name.indexOf('J') == 1 || name.indexOf('j') == 1);

        System.out.println("End of program");

//        scan.nextLine(); // empty space collector
//        String name1; // must declare outside block of code to reuse; it'll be assigned later
//        do {
//            System.out.println("Please enter a name:");
//            name1 = scan.nextLine();
//            if (name1.startsWith("j") || name1.startsWith("J")) System.out.println("End of the program");
//        } while (!(name1.startsWith("j") || name1.startsWith("J")));

    }
}