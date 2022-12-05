package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Project08 {
    public static void main(String[] args) {
        System.out.println("\n=================Task 1===============");
        int[] arr1 = {4};
        int[] arr11 = {4,8,7,15};
        int[] arr12 = {10, -5, 20, 50, 100};
        System.out.println(findClosestDistance(arr1));
        System.out.println(findClosestDistance(arr11));
        System.out.println(findClosestDistance(arr12));

        System.out.println("\n=================Task 2===============");
        int[] arr2 = {2};
        int[] arr21 = {5, 3, -1, 3, 5, 7, -1};
        int[] arr22 = {5, 3, -1, 3, 5, 7, -1, 7, 2};

        System.out.println(findSingleNumber(arr2));
        System.out.println(findSingleNumber(arr21));
        System.out.println(findSingleNumber(arr22));

        System.out.println("\n=================Task 3===============");
        String s3 = "Hello";
        String s31 = "abc abc d";
        String s32 = "abab";

        System.out.println(findFirstUniqueCharacter(s3));
        System.out.println(findFirstUniqueCharacter(s31));
        System.out.println(findFirstUniqueCharacter(s32));

        System.out.println("\n=================Task 4===============");
        int[] arr4 = {2, 4};
        int[] arr41 = {2, 3, 1, 5};
        int[] arr42 = {4, 7, 8, 6};
        int[] arr43 = {10, 8, 6, 7};

        System.out.println(findMissingNumber(arr4));
        System.out.println(findMissingNumber(arr41));
        System.out.println(findMissingNumber(arr42));
        System.out.println(findMissingNumber(arr43));


    }
    public static int findClosestDistance(int[] arr){
        int distance = Integer.MAX_VALUE;
        if(arr.length == 1) distance = -1;
        for (int i = 0; i < arr.length ; i++){
            for (int j = i + 1; j < arr.length; j++)
                if (Math.abs(arr[i] - arr[j]) < distance) distance = Math.abs(arr[i] - arr[j]);
        } return distance;
    }
    public static int findSingleNumber(int[] arr){
        int findSingle = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] != arr[j] && findSingle != arr[i]) {
                    findSingle = arr[i];
                    break;
                }
        }return findSingle;
    }
    public static String findFirstUniqueCharacter(String s){
        String firstChar = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                firstChar += s.charAt(i);
                break;
            }
        }return firstChar;
    }
    public static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);
        int missing = 0;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] != arr[i + 1] - 1) missing = arr[i];
        return missing + 1;
    }
}