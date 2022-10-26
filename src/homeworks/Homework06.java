package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println("\n========== Task 1 ===========");

// Creating an int array - size 10
        int[] numbers = new int[10];

// Assigning values
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;

// Printing elements
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);

        System.out.println(Arrays.toString(numbers));



        System.out.println("\n========== Task 2 ===========");

        // Creating string array size 5
        String[] str = new String[5];

// Assigning values
        str[1] = "abc" ;
        str[4] = "xyz" ;

// Printing elements
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);

// Printing the entire array
        System.out.println(Arrays.toString(str));


        System.out.println("\n========== Task 3 ===========");


        // Creating an array that stores numbers
        int[] nums = {23, -34, -56, 0, 89, 100};

// Printing the entire array
        System.out.println(Arrays.toString(nums));

// Printing the array stored in ascending order
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        System.out.println("\n========== Task 4 ===========");
        // Creating an array that stores countries
        String [] countries = {"Germany", "Argentina","Ukraine", "Romania"};

// Printing the entire array
        System.out.println(Arrays.toString(countries));

//Printing array sorted lexicographically
        Arrays.sort(countries);

        System.out.println(Arrays.toString(countries));

        System.out.println("\n========== Task 5 ===========");

        // Creating a String array that stores cartoon dogs
        String[] cartoonDogs = {"Scooby Doo", " Snoopy", "Blue", "Pluto", "Dino","Sparky" };

        //(!str2.contains(" "))
        System.out.println(Arrays.toString(cartoonDogs));

        boolean hasPluto = false;
        for (String cartoonDog : cartoonDogs ) {
            if (cartoonDog.equals("Pluto")) {
                hasPluto = true;

            }

        }

        System.out.println(hasPluto);

        System.out.println("\n========== Task 6 ===========");

        // Creating String array that stores cartoon cats
        String [] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};

// Printing  entire array sorted lexicographically
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));

        boolean hasGarfield = false;
        boolean hasFelix = false;

        for (String cartoonCat : cartoonCats ) {
            if (cartoonCat.equals("Garfield")) {
                hasGarfield = true;

            }
            if (cartoonCat.equals("Felix")) {
                hasFelix = true;
            } else System.out.println();


        }


        System.out.println("\n========== Task 7 ===========");

// Creating a double array that stores doubles
        double[] doubles = {10.5, 20.75, 70, 80, 15.75};

// Printing entire array
        System.out.println(Arrays.toString(doubles));

// Printing each  element
        for (double db: doubles) {
            System.out.println(db);

        }

        //test test





    }
}
