package homeworks;


import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("========TASK-1========");
        String str = "";
        System.out.println(noDigit(str));
        str = "Java";
        System.out.println(noDigit(str));
        str = "123Hello";
        System.out.println(noDigit1(str));
        str = "123Hello World149";
        System.out.println(noDigit(str));
        str = "123Tech456Global149";
        System.out.println(noDigit1(str));

        System.out.println("=========TASK-2===========");
        str = "";
        System.out.println(noVowel(str));
        str = "xyz";
        System.out.println(noVowel1(str));
        str = "JAVA";
        System.out.println(noVowel(str));
        str = "125$";
        System.out.println(noVowel1(str));
        str = "TechGlobal";
        System.out.println(noVowel(str));

        System.out.println("==========TASK-3===========");
        str = "";
        System.out.println(sumOfDigits(str));
        str = "Java";
        System.out.println(sumOfDigits(str));
        str = "John’s age is 29";
        System.out.println(sumOfDigits(str));
        str = "$125.0";
        System.out.println(sumOfDigits(str));

        System.out.println("==========TASK-4============");
        str = "";
        System.out.println(hasUpperCase(str));
        str = "java";
        System.out.println(hasUpperCase(str));
        str = "John’s age is 29";
        System.out.println(hasUpperCase(str));
        str = "$125.0";
        System.out.println(hasUpperCase(str));

        System.out.println("===========TASK-5===========");
        int a = 1, b = 1, c = 1;
        System.out.println(middleInt(a, b, c));
        a = 1;
        b = 2;
        c = 2;
        System.out.println(middleInt(a, b, c));
        a = 5;
        b = 5;
        c = 8;
        System.out.println(middleInt(a, b, c));
        a = 5;
        b = 3;
        c = 5;
        System.out.println(middleInt(a, b, c));
        a = -1;
        b = 25;
        c = 10;
        System.out.println(middleInt(a, b, c));

        System.out.println("=========TASK-6========");
        int[] arr;
        arr = new int[]{1, 2, 3 ,4};
        System.out.println(Arrays.toString(no13(arr)));
        arr = new int[]{13, 2, 3};
        System.out.println(Arrays.toString(no13(arr)));
        arr = new int[]{13, 13, 13 , 13, 13};
        System.out.println(Arrays.toString(no13(arr)));

        System.out.println("==========TASK-7=========");
        arr = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(arrFactorial(arr)));
        arr = new int[]{0, 5};
        System.out.println(Arrays.toString(arrFactorial(arr)));
        arr = new int[]{5 , 0, 6};
        System.out.println(Arrays.toString(arrFactorial(arr)));
        arr = new int[]{};
        System.out.println(Arrays.toString(arrFactorial(arr)));

        System.out.println("===========TASK-8===========");
        str = "     ";
        System.out.println(Arrays.toString(categorizeCharacters(str)));
        str = "abc123$#%";
        System.out.println(Arrays.toString(categorizeCharacters(str)));
        str = "12ab$%3c%";
        System.out.println(Arrays.toString(categorizeCharacters(str)));



    }

    /* TASK-1
    Requirement:
    -Create a method called noDigit()
    -This method will take one String argument and it will
    return a new String with all digits removed from the
    original String
    Test Data 1: “”
    Expected Result 1: “”
    Test Data 2: “Java”
    Expected Result 2: “Java”
    Test Data 3: “123Hello”
    Expected Result 3: “Hello”
    Test Data 4: “123Hello World149”
    Expected Result 4: “Hello World”
    Test Data 5: “123Tech456Global149”
    Expected Result 5: “TechGlobal”
     */
    public static String noDigit(String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                str = str.replace(str.substring(i, i + 1), "");
                i--;
            }
        }
        return str;
    }

    public static String noDigit1(String str){
        return str.replaceAll("[0-9]", "");
    }

    /* TASK-2
    Requirement:
    -Create a method called noVowel()
    -This method will take one String argument and it will
    return a new String with all vowels removed from the
    original String
    Test Data 1: “”
    Expected Result 1: “”
    Test Data 2: “xyz”
    Expected Result 2: “xyz”
    Test Data 3: “JAVA”
    Expected Result 3: “JV”
    Test Data 4: “125$”
    Expected Result 4: “125$”
    Test Data 5: “TechGlobal”
    Expected Result 5: “TchGlbl”
     */

    public static String noVowel(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'u'){
                str = str.replace(str.substring(i, i + 1), "");
                i--;
            }
        }
        return str;
    }

    public static String noVowel1(String str){
        return str.toLowerCase().replaceAll("[aeiou]", "");
    }

    /*TASK-3
    Requirement:
    -Create a method called sumOfDigits()
    -This method will take one String argument and it will return an int sum
    of all digits from the original String.
    NOTE: Return zero if there is no digits in the String
    Test Data 1: “”
    Expected Result 1: 0
    Test Data 2: “Java”
    Expected Result 2: 0
    Test Data 3: “John’s age is 29”
    Expected Result 3: 11
    Test Data 4: “$125.0”
    Expected Result 4: 8
     */

    public static int sumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) sum += Integer.parseInt(str.substring(i, i+1));
        }
        return sum;
    }

    /*TASK-4
    Requirement:
    -Create a method called hasUpperCase()
    -This method will take one String argument and it will return boolean
    true if there is an uppercase letter and false otherwise.
    Test Data 1: “”
    Expected Result 1: false
    Test Data 2: “java”
    Expected Result 2: false
    Test Data 3: “John’s age is 29”
    Expected Result 3: true
    Test Data 4: “$125.0”
    Expected Result 4: false
     */

    public static boolean hasUpperCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) return true;
        }
        return false;
    }

    /*TASK-5
    Requirement:
    -Create a method called middleInt()
    -This method will take three int arguments and it will return the middle
    int.
    Test Data 1: 1, 1, 1
    Expected Result 1: 1
    Test Data 2: 1, 2, 2
    Expected Result 2: 2
    Test Data 3: 5, 5, 8
    Expected Result 3: 5
    Test Data 4: 5, 3, 5
    Expected Result 4: 5
    Test Data 4: -1, 25, 10
    Expected Result 4: 10
     */

    public static int middleInt(int a,int b, int c){
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int sum = a + b + c;
        return sum - max - min;
    }

    /*TASK-6
    Requirement:
    -Create a method called no13()
    -This method will take an int array as argument and it will return a new
    array with all 13 replaced with 0.
    NOTE: Assume length will always be more than zero.
    Test Data 1: [1, 2, 3 ,4]
    Expected Result 1: [1, 2, 3 ,4]
    Test Data 2: [13, 2, 3 ]
    Expected Result 2: [0, 2, 3 ]
    Test Data 3:[13, 13, 13 , 13, 13]
    Expected Result 3: [0, 0, 0, 0, 0]
     */

    public static int[] no13 (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    /*TASK-7
    Requirement:
    -Create a method called arrFactorial()
    -This method will take an int array as argument and it will return the
    array with every number replaced with their factorials.
    NOTE: If given array is empty, then return it back empty.
    NOTE: 0! equals to 1
    Test Data 1: [1, 2, 3, 4]
    Expected Result 1: [1, 2, 6, 24]
    Test Data 2: [0, 5]
    Expected Result 2: [1, 120]
    Test Data 3:[5 , 0, 6]
    Expected Result 3: [120, 1, 720]
    Test Data 4:[]
    Expected Result 4: []
     */

    public static int[] arrFactorial(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else{
                int factorial = 1;
                for (int j = 1; j <= arr[i]; j++) {
                    factorial *= j;
                }
                arr[i] = factorial;
            }
        }
        return arr;
    }

    /*TASK-8
    Requirement:
    -Create a method called categorizeCharacters()
    -This method will take String as an argument and return a String array as
    letters at index of 0, digits at index of 1 and specials at index of 2.
    NOTE: IGNORE SPACES
    NOTE: Assume length will always be more than zero.
    Test Data 1: “     ”
    Expected Result 3: [ , , ]
    Test Data 2: “abc123$#%”
    Expected Result 2: [abc, 123, $#%]
    Test Data 3: “12ab$%3c%”
    Expected Result 3: [abc, 123, $%%]
     */

    public static String[] categorizeCharacters(String str){
        String[] arr = {"", "", ""};
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) arr[0] += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) arr[1] += str.charAt(i);
            else if (!Character.isWhitespace(str.charAt(i))) arr[2] += str.charAt(i);
        }
        return arr;
    }



}