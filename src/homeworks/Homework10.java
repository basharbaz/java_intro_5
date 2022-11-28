package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {
    public static int countWords(String s){
        String[] words = s.trim().split(" ");
        return words.length;
    }

    public static int countA(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') count++;
        }
        return count;
    }

    public static int countPos(ArrayList<Integer> numbers){
        int count = 0;
        for (Integer number : numbers){
            if (number > 0) count++;
        }
        return count;
    }

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> removedDuplicateNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (!removedDuplicateNumbers.contains(numbers.get(i))) {
                removedDuplicateNumbers.add(numbers.get(i));
            }
        }
        return removedDuplicateNumbers;
    }

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str){
        ArrayList<String> removedDuplicateElements = new ArrayList<>();
        for (int i = 0; i < str.size(); i++){
            if (!removedDuplicateElements.contains(str.get(i))){
                removedDuplicateElements.add(str.get(i));
            }
        }
        return removedDuplicateElements;
    }

    public static String removeExtraSpaces(String s){
        s = s.trim();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' || s.charAt(i+1) != ' ') str += s.charAt(i);
        }
        return str;
    }

    public static String add(int[] nums1, int[] nums2){
        int[] newArr = new int[Math.max(nums1.length, nums2.length)];
        for (int i = 0; i < Math.min(nums1.length, nums2.length); i++) {
            newArr[i] = (nums1[i] + nums2[i]);
        }
        for (int i = Math.min(nums1.length, nums2.length); i < Math.max(nums1.length, nums2.length) ; i++) {
            if (Math.max(nums1.length, nums2.length) == nums2.length) newArr[i] = nums2[i];
            else newArr[i] = nums1[i];
        }
        return Arrays.toString(newArr);
    }

    public static int findClosestTo10(int[] numbers){
        int closest = Integer.MIN_VALUE;
        int distance = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if ((Math.abs(numbers[i] - 10)) < distance && numbers[i] != 10){
                distance = Math.abs(numbers[i] - 10);
                closest = numbers[i];
            } else if ((Math.abs(numbers[i] - 10)) == distance){
                if (closest > numbers[i] && numbers[i] != 10) closest = numbers[i];
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        System.out.println(countWords("      Java is fun       "));
        System.out.println(countWords("Selenium is the most common UI automation tool.   "));
        System.out.println(countA("TechGlobal is a QA bootcamp"));
        System.out.println(countA("QA stands for Quality Assurance"));
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);
        numbers.add(20);
        numbers.add(35);
        numbers.add(60);
        numbers.add(70);
        numbers.add(60);
        // System.out.println(countPos(numbers));
        System.out.println(removeDuplicateNumbers(numbers));
        ArrayList<String> s = new ArrayList<>();
        s.add("java");
        s.add("C#");
        s.add("ruby");
        s.add("JAVA");
        s.add("ruby");
        s.add("C#");
        s.add("C++");
        System.out.println(removeDuplicateElements(s));
        System.out.println(removeExtraSpaces("  I   am      learning     Java     "));
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(add(arr1,arr2));
        int[]num1 = {10, -13, 5, 70, 15, 57};
        int[]num2 = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(num1));
        System.out.println(findClosestTo10(num2));


    }
}