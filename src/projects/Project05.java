package projects;

import java.util.Arrays;

public class Project05 {


    public static void findGreatestAndSmallestWithSort(int[] a){
        if (a.length > 1){
            Arrays.sort(a);
            System.out.println("Smallest = " + a[0]);
            System.out.println("Greatest = " + a[a.length-1]);
        }
    }

//                                                                                          [10, 7, 7, 10 -3, 10, -3]

    public static void findGreatestAndSmallest(int[] a) {
        if (a.length >= 1) {

            int smallest = a[0] , greatest = a[0];

            for (int i : a) { // i = 10
                if (i < smallest) smallest = i; //-3   // 10 < 0 false smallest = 0 | 7 < 0 false smallest = 0 | 10 < 0 false |  -3 < 0 true smallset = -3|    10 < -3 false
                if (i > greatest) greatest = i; //10    // 10 > 0 true greatest = 10 | 7 > 10 false gratest = 10 | 10 > 10 false | -3 > 10 false greatest = 10| 10 < 10 false
            }
            System.out.println("Smallest = " + smallest);
            System.out.println("Greatest = " + greatest);

        } else System.out.println("Array is empty");
    }







    // [10, 5, 6, 7, 8, 5, 15, 15]
    //[5, 5, 6, 7, 8, 10, 15, 15]
    public static void findSecondGreatestAndSmallestWithSort(int[] a){

        Arrays.sort(a);

        int smallest = a[0], secondSmallest = a[1]; // smallest = 5, secondSmallest = 5;

        int greatest = a[a.length - 1], secondGreatest = a[a.length - 2]; // greatest = 15, secondGreatest = 15;

        for (int element : a){
            if (element != smallest){ // 5 != 5 false | 5 != 5 false | 6 != 5 true
                secondSmallest = element; // secondSmallest = 6
                break;
            }
        }
        for (int element : a){
            if (greatest != element){
                secondGreatest = element;
            }
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }


//          [10, 5, 6, 7, 8, 5, 15, 15]
    public static void findSecondGreatestAndSmallest(int[] a){
        int greatest = Integer.MIN_VALUE, secondGreatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int duplicates = 0;
        if (a.length > 1){
            for (int i = 0; i < a.length-1; i++){
                for (int j = i + 1; j < a.length; j++){
                    if (a[i] == a[j]) duplicates += a[i];
                }
            }
            for (int i = 0; i < a.length; i++){
                if (a[i] > greatest && a[i] != duplicates){
                    secondGreatest = greatest;
                    greatest = a[i];
                }else if (a[i] > secondGreatest && a[i] != greatest && a[i] != duplicates){
                    secondGreatest = a[i];
                }
                if (a[i] < smallest && a[i] != duplicates){
                    secondSmallest = smallest;
                    smallest = a[i];
                }else if (a[i] < secondSmallest && a[i] != smallest && a[i] != duplicates){
                    secondSmallest = a[i];
                }
            }
            System.out.println("Second Smallest = " + secondSmallest);
            System.out.println("Second Greatest = " + secondGreatest);
        }
    }
    //          [10, 5, 6, 7, 8, 5, 15, 15]
    // [-23, -10, -40, -100]
    public static void findSecondGreatestAndSmallest2(int[] num) {

        int firstSmallest = num[0];
        int firstGreatest = num[0];
        int secondSmallest = Integer.MAX_VALUE;
        int secondGreatest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) { // i = 1 | 2 | 3 | 4
            if (num[i] > firstGreatest) firstGreatest = num[i]; //firstGreatest = 15         //5 > 10 false                  | 6 > 10 false | 7 > 10 false | 8 > 10 false | 15 > 10 true firstGreatest = 15
            if (num[i] < firstSmallest) firstSmallest = num[i]; //firstSmallest = 5         // 5 < 10 true firstSmallest = 5 | 6 < 5 false  | 7 < 5 false  | 8 < 5 falser |
        }


        for (int i = 0; i < num.length; i++) {
            if (num[i] != firstGreatest && num[i] > secondGreatest) secondGreatest = num[i]; // 10 != 15 && 10 > -20000000 true secondGreatest = 10| 5 != 15 &&  5 > 10 false  | 6 != 15 && 6 > 10 false |
            if (num[i] != firstSmallest && num[i] < secondSmallest) secondSmallest = num[i]; // 10 != 5 && 10 < 200000000 true secondSmallest = 10 | 5 != 5 false  | 6 != 5 && 6 < 10 true secondSmallest = 6 | 5 !=
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
    }

//   [“foo”, “bar”, “Foo”, “bar”, “6”, “abc”, “6”, “xyz”]

    public static void findDuplicatedElementsInAnArray(String[] a) {
        String duplicates = "";
        if (a.length > 1) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i].equals(a[j])) {
                        duplicates += a[i] + "\n"; // bar
                                                   // 6

                    }
                }
            }
            System.out.println(duplicates);
        }
    }

    public static void findMostRepeatedElementInAnArray (String[]a){
        String overallMostDup = "";
        int overallDupCounter = 0;

        for (int i = 0; i < a.length-1; i++) {
            String tempMostDup = a[i];
            int tempDupCounter = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].equals(a[j]) && !overallMostDup.contains(a[i])){
                    tempDupCounter++;
                }
            }
            if (tempDupCounter > overallDupCounter){
                overallMostDup = tempMostDup;
                overallDupCounter = tempDupCounter;
            }
        }
        System.out.println(overallMostDup);
    }


    public static void findMostRepeatedElementInAnArrayy(String[] strings){
        String mostRepeatedElement = "";
        int counterMostRepeated = 0;
        int counterHowManyRepeated = 0;
        for (int i = 0; i < strings.length; i++){
            for (int j = i + 1; j < strings.length; j++){
                if (strings[i].equals(strings[j])) counterHowManyRepeated++;

                if(counterHowManyRepeated > counterMostRepeated) {
                    counterMostRepeated = counterHowManyRepeated;
                    mostRepeatedElement = strings[i];
                }
            }
            counterHowManyRepeated =  0;

        }
        System.out.println(counterMostRepeated);
        System.out.println(mostRepeatedElement);
        System.out.println(counterHowManyRepeated);
    }

}
