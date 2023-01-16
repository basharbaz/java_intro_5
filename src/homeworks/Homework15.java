package homeworks;

import java.util.*;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println("==========TASK-1==========");
        System.out.println(Arrays.toString(fibonacciSeries1(3)));
        System.out.println(Arrays.toString(fibonacciSeries1(5)));
        System.out.println(Arrays.toString(fibonacciSeries1(7)));
        System.out.println(Arrays.toString(fibonacciSeries1(11)));

        System.out.println("=========TASK-2===========");
        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(8));

        System.out.println("==========TASK-3===========");

        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));
        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
        System.out.println(Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));

        System.out.println("=========TASK-4=========");
        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));
        System.out.println(isPowerOf3(27));
        System.out.println(isPowerOf3(253));

        System.out.println("=========TASK-5========");
        int[] arr5_1 = {};
        System.out.println(firstDuplicate(arr5_1));
        int[] arr5_2 = {1};
        System.out.println(firstDuplicate(arr5_2));
        int[] arr5_3 = {1, 2, 2, 3};
        System.out.println(firstDuplicate(arr5_3));
        int[] arr5_4 = {1, 3, 3, 4, 5, 1};
        System.out.println(firstDuplicate(arr5_4));

    }
        /*TASK1
        Requirement:
        -Create a method called fibonacciSeries1()
        -This method will take an int argument as n, and it will return n series of Fibonacci numbers as an int array.

        REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21

        Test Data 1: 3
        Expected Result 1: [0, 1, 1]

        Test Data 2: 5
        Expected Result 2: [0, 1, 1, 2, 3]

        Test Data 3: 7
        Expected Result 3: [0, 1, 1, 2, 3, 5, 8]

         */

    public static int[] fibonacciSeries1(int num){
        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;

        int firstTerm =  0;
        int secondTerm = 1;

        for (int i = 2; i < num; i++) {
            int nextTerm = firstTerm + secondTerm;
            arr[i] = nextTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return arr;
    }

    /*TASK2
    Requirement:
    -Create a method called fibonacciSeries2()
    -This method will take an int argument as n, and it will return the nth series of Fibonacci number as an int.

    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21

    Test Data 1: 2
    Expected Result 1: 1

    Test Data 2: 4
    Expected Result 2: 2

    Test Data 3: 8
    Expected Result 3: 13

     */
    public static int fibonacciSeries2(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        for (int i = 3; i <= n; i++) {
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        return nextNumber;
    }

    /*TASK3
    Requirement:
    -Create a method called findUniques()
    -This method will take 2 int array argument and it will return an int array which has only the unique values from both given arrays.
    NOTE: If both arrays are empty, then return an empty array.
    NOTE: if one of the array is empty, then return unique values from the other array.

    Test Data 1: [], []
    Expected Result 1: []

    Test Data 2: [], [1, 2, 3, 2]
    Expected Result 2: [1, 2, 3]

    Test Data 3: [1, 2, 3, 4], [3, 4, 5, 5]
    Expected Result 3: [1, 2, 5]

    Test Data 4: [8, 9], [9, 8, 9]
    Expected Result 4: []
     */

    public static int[] findUniques(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int element : a) {
            listA.add(element);
        }
        for (int element : b) {
            listB.add(element);
        }



        for (int i = 0; i < listA.size(); i++) {
            if (!list.contains(listA.get(i)) && !listB.contains(listA.get(i))) list.add(listA.get(i));
        }
        for (int i = 0; i < listB.size(); i++) {
            if (!list.contains(listB.get(i)) && !listA.contains(listB.get(i))) list.add(listB.get(i));
        }
        int[] uniques = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniques[i] = list.get(i);
        }
        return uniques;
    }

    /*TASK 4
    Requirement:
    -Create a method called isPowerOf3()
    -This method will take an int argument and it will return true if given int argument is equal to 3 power of the X.
     Otherwise, it will return false.

    Numbers that are power of 3 = 1, 3, 9, 27, 81, 243….

    Test Data 1: 1
    Expected Result 1: true

    Test Data 2: 2
    Expected Result 2: false

    Test Data 3: 3
    Expected Result 3: true

    Test Data 4: 81
    Expected Result 4: true
     */

    public static boolean isPowerOf3(int number){//27
        int power = 3;
        while(power < number){
            power = power * 3;
        }
        return power == number;
    }

    /*TASK5
    Requirement:
    -Create a method called firstDuplicate()
    -This method will take an int array argument and it will return an int which is the first duplicated number.
    NOTE: All elements will be positive numbers.
    NOTE: If there are no duplicates, then return -1
    NOTE: If there are more than one duplicate, then return the one for which second occurrence has the smallest index.

    Test Data 1: []
    Expected Result 1: -1

    Test Data 2: [1]
    Expected Result 2: -1

    Test Data 3: [1, 2, 2, 3]
    Expected Result 3: 2

    Test Data 4: [1,  2, 3, 3, 4, 1]
    Expected Result 4: 3
     */
    public static int firstDuplicate(int[] arr){
        int duplicate = -1;
        int iOfDuplicate = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && j < iOfDuplicate) {
                    duplicate = arr[i];
                    iOfDuplicate = j;
                }
            }
        }
        return duplicate;
    }

}