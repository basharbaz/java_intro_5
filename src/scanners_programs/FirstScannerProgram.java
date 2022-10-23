package scanners_programs;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {

        String fName, lName;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter your name:");
        fName = inputReader.nextLine();
        System.out.println("Please enter your last name:");
        lName = inputReader.nextLine();

        System.out.println(fName +" "+ lName);
    }
}
