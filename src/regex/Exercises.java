package regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("1 - " + Pattern.matches("[ A-Za-z0-9_-]{8,15}","JohnDoe_123 "));
        System.out.println("2 - " + Pattern.matches("[\\w]{8,15}","JohnDoe_123 "));
        System.out.println("3 - " + Pattern.matches("[\\w\\- ]{8,15}","JohnDoe_123 "));
        System.out.println("4 - " + Pattern.matches("[\\d]{8,15}","12345678"));
        System.out.println("5 - " + Pattern.matches("[\\D]{8,15}","12345678"));
        System.out.println("6 - " + Pattern.matches("[\\D]{8,15}","sadgsghsra"));
        System.out.println("7 - " + Pattern.matches("[\\D]{8,15}","sadgsghsra1"));
        System.out.println("8 - " + Pattern.matches("\\.","sadgsghsra123$"));
        System.out.println("9 - " + Pattern.matches("[.]","sadgsghsra123$"));
        System.out.println("10 - " + Pattern.matches(".+","sadgsghsra123$"));
        System.out.println("11 - " + Pattern.matches("[a-z]+","sadgsghsra123$"));
        System.out.println("12 - " + Pattern.matches("[a-z]+","z"));
        System.out.println("13 - " + Pattern.matches("[a-z]+",""));
        System.out.println("14 - " + Pattern.matches("[\\d]{3}-","000"));
        System.out.println("15 - " + Pattern.matches("[\\d]{3}-","000-"));
        System.out.println("16 - " + Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}","000-00-0000"));
        System.out.println("================task2=============");
        System.out.println("17 - " + Pattern.matches("\\([0-9]{3}\\)","(630)"));
        System.out.println("18 - " + Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}","630-123-4567"));
        System.out.println("19 - " + Pattern.matches("[()0-9-]{14}","630-123-4567"));
        System.out.println("20 - " + Pattern.matches("[()0-9-]{14}","00000000000000"));
        System.out.println("21 - " + Pattern.matches("[()0-9-]{14}",""));



        System.out.println("================task3=============");
        //replace all specail chars in string
        String str =" abc 123 $#^ ";

        System.out.println(str.replaceAll(" !\\w!\\d!\\s" ," abc 123 $#^ "));
        System.out.println(str.replaceAll("[ $#^ ]","")); // not dynamic
        System.out.println(str.replaceAll("[\\W]","")); //
        System.out.println(str.replaceAll("[\\W_]","")); //
        System.out.println(str.replaceAll("[^\\w_]","")); //
        System.out.println(str.replaceAll("[\\W_]","")); //
        System.out.println(str.replaceAll("[^a-zA-Z0-9]","")); //




        System.out.println("================task4=============");


        //create a regex pattern that check first name and last name

        System.out.println(Pattern.matches("[A-Za-z]{2,} [A-Za-z]{2,}","John Doe"));
        System.out.println(Pattern.matches("[A-Za-z ]{2,}","John Doe"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]+ [A-Z]{1}[a-z]+","John Doe"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]+ [A-Z]{1}[a-z]+","john Doe"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+","John Doe"));







        str = "##A1%%b2#$%C^&3";
      //  System.out.println(Arrays.toString(str.replaceAll("[^A-Za-z]"),""))
                //(str.replaceAll("[^A-Za-z]"),"");



    }
}
