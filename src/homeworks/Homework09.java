
package homeworks;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");

        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        ArrayList<Integer> firstNumDup = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !firstNumDup.contains(numbers[i])) {
                    firstNumDup.add(numbers[i]);
                }
            }
        }
        if (firstNumDup.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(firstNumDup.get(0));

        System.out.println("\n-----TASK 2------\n");

        String[] words = {"a", "b", "B", "XYZ", "123"};
        ArrayList<String> firstStrDup = new ArrayList<>();

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j]) && !firstStrDup.contains(words[i])) {
                    firstStrDup.add(words[i]);
                }
            }
        }
        if (firstStrDup.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(firstStrDup.get(0));

        System.out.println("\n-----TASK 3------\n");

        int[] digits = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        ArrayList<Integer> allDupDigits = new ArrayList<>();

        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] == digits[j] && !allDupDigits.contains(digits[i])) {
                    allDupDigits.add(digits[i]);
                    break;
                }
            }
        }
        if (allDupDigits.isEmpty()) System.out.println("There is no duplicates");
        else for (Integer element : allDupDigits) System.out.println(element);


        System.out.println("\n-----TASK 4------\n");

        String[] randomWords = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        ArrayList<String> allDupWords = new ArrayList<>();

        for (int i = 0; i < randomWords.length - 1; i++) {
            for (int j = i + 1; j < randomWords.length; j++) {
                if (randomWords[i].equalsIgnoreCase(randomWords[j]) && !allDupWords.contains(randomWords[i])) {
                    allDupWords.add(randomWords[i]);
                    break;
                }
            }
        }
        if (allDupWords.isEmpty()) System.out.println("There is no duplicates");
        else for (String element : allDupWords) System.out.println(element);


        System.out.println("\n-----TASK 5------\n");

        String[] words1 = {"abc", "foo", "bar"};
        ArrayList<String> reverseElements= new ArrayList<>();

        for (int i = words1.length-1; i >= 0; i--) {
            reverseElements.add(words1[i]);
        }
        System.out.println(reverseElements);


        System.out.println("\n-----TASK 6------\n");

        String str = "Java is fun";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        String[] reserve2 = reverse.split(" ");
        String reverseAgain = "";
        for (int i = reserve2.length - 1; i >= 0; i--) {
            reverseAgain += reserve2[i] + " ";
        }
        System.out.println(reverseAgain.trim());



    }
}
