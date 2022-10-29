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


    public static void findGreatestAndSmallest(int[] a){
        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        if (a.length > 1){
            for (int element : a){
                greatest = Math.max(greatest, element);
                smallest = Math.min(smallest, element);
            }
            System.out.println("Smallest = " + smallest);
            System.out.println("Greatest = " + greatest);
        }
    }



    public static void findSecondGreatestAndSmallestWithSort(int[] a){
        Arrays.sort(a);
        int smallest = a[0], secondSmallest = a[1];
        int greatest = a[a.length - 1], secondGreatest = a[a.length - 2];
        for (int element : a){
            if (smallest != element){
                secondSmallest = element;
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



    public static void findDuplicatedElementsInAnArray(String[] a) {
        String duplicates = "";
        if (a.length > 1) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i].equals(a[j])) {
                        duplicates += a[i] + "\n";
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



}
