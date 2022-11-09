package regex;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}");

        System.out.println(pattern);
        System.out.println(pattern.pattern());
        System.out.println(pattern.toString());

        System.out.println(Pattern.matches(pattern.pattern(),"hello world"));
        System.out.println(Pattern.matches(pattern.toString(),"hello world"));

        String str ="I go to school at Techglobal and i love it";

        String[] arr = str.split(" [a-z0-9]{5,10}");

        System.out.println(Arrays.toString(arr));


        System.out.println("===========EX1==========");

        String username = ScannerHelper.getAName();

      //  pattern = Pattern.compile("[a-zA-Z0-9]}");

     //   if (Pattern.matches("[a-zA-Z0-9]}")) System.out.println("valid username");


        //if(userName.matches("[a-zA-Z0-9]{5,10}")) System.out.println("Valid UserName");
       // if (Pattern.matches(pattern.toString(),username)) System.out.println("valid username");
      //  else System.out.println("ERROR! Username must be 5 to 10 characters");




    }
}
