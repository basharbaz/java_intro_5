package homeworks;

import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {

        System.out.println("\n===========TASK1============\n");

        String name = ScannerHelper.getAName();

        System.out.println("First character in the name is = " + name.charAt(0));
        System.out.println("Last character in the name is = " + name.charAt(name.length() - 1));
        System.out.println("First 3 characters in the name is = " + name.substring(0, 3));
        System.out.println("Last 3 characters in the name is = " + name.substring(name.length()-3));


        //name.toLowerCase()
        if (name.startsWith("a")) {
            System.out.println("You are in the club!");
        } else if (name.startsWith("A")) {
            System.out.println("You are in the club!");
        } else
            System.out.println("Sorry, you are not in the club");


        System.out.println("\n===========TASK2============\n");


        String city = ScannerHelper.getAnAddress();

        String city2 =(city.toLowerCase());

       if (city2.contains("chicago")) System.out.println("You are in the club");
       else if (city2.contains("des plaines")) System.out.println("You are welcome to join to the club");
       else System.out.println("Sorry, you will never be in the club");



        System.out.println("\n===========TASK3============\n");

        String colors =ScannerHelper.getAString();

        String colors2 =(colors.toLowerCase());


        if (colors2.contains("red") && colors2.contains("green"))
            System.out.println("Green and red are in the list");

        else if (colors2.contains("red"))
            System.out.println("red are in the list");

        else if
        ((colors2.contains("green")))
            System.out.println("green are in the list");
        else System.out.println("Green and red are not in the list");



        System.out.println("\n===========TASK4============\n");

        /*String str = "  Java is FUN   ";

        str = str.trim();
        String str2 = str.toLowerCase();

        System.out.println(str2);

        System.out.println("The first word in the str is " + str2.substring(0,4));
        System.out.println("The second word in the str is " + str2.substring(5,7));
        System.out.println("The third word in the str is " + str2.substring(8,11));

         */
        String str = "   Java is FUN   ";
        str = str.trim().toLowerCase();

        String word1 = str.substring(0,str.indexOf(' '));
        String word2 = str.substring(str.indexOf(' ')+1 , str.lastIndexOf(' '));
        String word3 = str.substring(str.lastIndexOf(' ') + 1);

        System.out.println("The first word in the str is = " + word1);
        System.out.println("The second word in the str is = " + word2);
        System.out.println("The third word in the str is = " + word3);







        }

    }

