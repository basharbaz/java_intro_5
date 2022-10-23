package homeworks;

import java.util.Scanner;

public class homework02 {
    public static void main(String[] args) {

        System.out.println("\n===========TASK1============\n");

        System.out.println("\nSum of 2 numbers\n");

        Scanner task1 = new Scanner(System.in);

        int num1,num2 ;

        System.out.println("Please enter the FIRST number of your choice");

        num1 = task1.nextInt();

        System.out.println("Please enter the SECOND number of your choice");

        num2 = task1.nextInt();

        System.out.println("Please enter the FIRST number of your choice : " + num1 );


        System.out.println("Please enter the SECOND number of your choice : " + num2 );



        System.out.println("The sum of number 1 and 2 entered by user is : " +(num1 + num2));

        /////////////////////////////////////////////////////////

        System.out.println("\n===========TASK2============\n");

        Scanner task2 = new Scanner(System.in);

        System.out.println("\nProduct of the numbers\n");

        System.out.println("Please enter the FIRST number of your choice");

        num1 = task2.nextInt();

        System.out.println("Please enter the SECOND number of your choice");

        num2 = task2.nextInt();

        System.out.println("The product of the given 2 numbers is : " + num1 * num2);

        //////////////////////////////////////////////////////

        System.out.println("\n===========TASK3============\n");




        Scanner task3 = new Scanner(System.in);

        System.out.println("Please enter the FIRST floating number of your choice");
        float firstNum = task3.nextFloat();


        System.out.println("Please enter the SECOND floating number of your choice");
        float secondNum = task3.nextFloat();

        System.out.println("The sum of the given numbers is = " + (firstNum + secondNum));
        System.out.println("The product of the given numbers is = " + firstNum * secondNum );
        System.out.println("The subtraction of the given numbers is = " + (firstNum - secondNum));
        System.out.println("The division of the given numbers is = " + firstNum / secondNum);
        System.out.println("The remainder of the given numbers is = " + firstNum % secondNum + "\n");


        //////////////////////////////////////////////////////


        System.out.println("\n===========TASK4============\n");

        System.out.println(-10 + 7 * 5);
        System.out.println((72+24) % 24);
        System.out.println(10 + -3*9 / 9);
        System.out.println(5 + 18 / 3 * 3 - 6 % 3);


        //////////////////////////////////////////////////////



        System.out.println("\n===========TASK5============\n");


        Scanner task5 = new Scanner(System.in);

        System.out.print("Input first number: ");

        int number01 = task5.nextInt();

        System.out.print("Input second number: ");

        int number02 = task5.nextInt();

        System.out.println("The average of the given numbers is : " + (number01 + number02) / 2);



        ///////////////////////////////



        System.out.println("\n===========TASK6============\n");

        Scanner task6 = new Scanner(System.in);

        System.out.print("Input first number: ");

        int number001 = task6.nextInt();

        System.out.print("Input second number: ");

        int number002 = task6.nextInt();

        System.out.print("Input third number: ");

        int number003 = task6.nextInt();

        System.out.print("Input forth number: ");

        int number004 = task6.nextInt();

        System.out.print("Input fifth number: ");

        int number005 = task6.nextInt();


        System.out.println("The average of the given numbers is : " + (number001 + number002 + number003 + number004 + number005) / 5);



        //////////////////////////////////


        System.out.println("\n===========TASK7============\n");



        Scanner task7 = new Scanner(System.in);

        System.out.print("Please enter first number: ");

        int number0001 = task7.nextInt();

        //System.out.println(number0001 * number0001);

        System.out.print("Please enter second number: ");

        int number0002 = task7.nextInt();

        //System.out.println(number0002 * number0002);

        System.out.print("Please enter third number: ");

        int number0003 = task7.nextInt();

        System.out.println("The " + number0001 + " multiplied with " + number0001 + " is = " + (number0001 * number0001));

        System.out.println("The " + number0002 + " multiplied with " + number0002 + " is = " + (number0002 * number0002));

        System.out.println("The " + number0003 + " multiplied with " + number0003 + " is = " + (number0003 * number0003));




        //////////////////////////////////


        System.out.println("\n===========TASK8============\n");


        Scanner task8 = new Scanner(System.in);


        System.out.println("enter the side of a square ");

        int number_1 = task8.nextInt();

        System.out.println("Area of the square = " + number_1 * number_1);


        System.out.println("Perimeter of the square  = " + number_1 * 4 );



        //////////////////////////////////



        System.out.println("\n===========TASK9============\n");


        double income = 90000;

        System.out.println("How much money can a Software Engineer in Test earn in 3 years? ");

        System.out.println("A Software Engineer in Test can earn " + "$" + (income * 3) + " in 3 years.");



        ////////////////////////////////




        System.out.println("\n===========TASK10============\n");

        Scanner task10 = new Scanner(System.in);

        String book,color;
        int number;

        System.out.println("What is your favorite book? ");

        book = task10.nextLine();

        System.out.println("What is your favorite color? ");

        color = task10.nextLine();

        System.out.println("What is your favorite number? ");

        number = task10.nextInt();

        System.out.println("User's favorite book is: " + (book) +"\n" +
                "User's favorite color is: " + (color) +"\n" +
                "User's favorite number is: " + (number));


        //////////////////////

        System.out.println("\n===========TASK11============\n");

        Scanner task11 = new Scanner(System.in);


        System.out.println("firstName");

        String firstName = task11.nextLine();

        System.out.println("lastName");

        String lastName = task11.nextLine();

        System.out.println("age");

        int age = task11.nextInt();


        System.out.println("emailAddress");

        String emailAddress = task11.next();


        System.out.println("phoneNumber");

        String phoneNumber = task11.next();
        task11.nextLine();


        System.out.println("address");

        String address = task11.nextLine();


        System.out.println("\tUser who joined this program is " + (firstName +" "+ lastName) +
                "." + " " + (firstName) + "'s age is " + (age) + ". " + (firstName) + "'s" + " email\naddress is " +
                (emailAddress) + "," + " phone number is " + (phoneNumber)+", " + "and address is\n " + address + ".");



    }
}








