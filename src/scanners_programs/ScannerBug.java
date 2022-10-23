package scanners_programs;

import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter your age");

        int age = scanner.nextInt();

        scanner.nextLine(); // moving cursor to the next line of input


        System.out.println("Please enter your address");

        String address = scanner.nextLine();

        System.out.println("Age is = " + age);
        System.out.println("Address is = " + address);


        /*
        Task-2
         */

        System.out.println("Please enter 2 number");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();

        System.out.println(num1 / num2);

    }
}
