package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");

        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));


        System.out.println("\n-----TASK 2------\n");

        String[] letters = new String[5];
        letters[1] = "abc";
        letters[4] = "xyz";

        System.out.println(letters[3]);
        System.out.println(letters[0]);
        System.out.println(letters[4]);
        System.out.println(Arrays.toString(letters));


        System.out.println("\n-----TASK 3------\n");

        int[] task3Numbers = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(task3Numbers));

        Arrays.sort(task3Numbers);
        System.out.println(Arrays.toString(task3Numbers));


        System.out.println("\n-----TASK 4------\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\n-----TASK 5------\n");

        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoonDogs));

        boolean hasPluto = false;
        for (String element : cartoonDogs){
            if (element.equals("Pluto")) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);

        // ANOTHER WAY:
        Arrays.sort(cartoonDogs);
        System.out.println(Arrays.binarySearch(cartoonDogs, "Pluto") >= 0);


        System.out.println("\n-----TASK 6------\n");

        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));

        System.out.println(Arrays.binarySearch(cartoonCats, "Garfield") >= 0 && Arrays.binarySearch(cartoonCats, "Felix") >= 0);


        System.out.println("\n-----TASK 7------\n");

        double[] task7Numbers = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(task7Numbers));

        for (double element : task7Numbers){
            System.out.println(element);
        }



        System.out.println("\n-----TASK 8------\n");

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(characters));

        int countLetters = 0, countLowerCase = 0, countUpperCase = 0, countDigits = 0, countSpecials = 0;
        for(char element : characters) {
            if (Character.isLetter(element)) {countLetters++;
                if (Character.isUpperCase(element)) countUpperCase++;
                else
                    countLowerCase++;
            }else if (Character.isDigit(element)){ countDigits++;
            }else countSpecials++;
        }
        System.out.println("Letters = " + countLetters);
        System.out.println("Uppercase letters = " + countUpperCase);
        System.out.println("Lower letters = " + countLowerCase);
        System.out.println("Digits = " + countDigits);
        System.out.println("Special characters = " + countSpecials);


        System.out.println("\n-----TASK 9------\n");

        String[] schoolSupplies = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(schoolSupplies));

        int countUpper = 0, countLower = 0, countB_P = 0, countBookPen = 0;
        for (String element : schoolSupplies){
            if (Character.isUpperCase(element.charAt(0))) countUpper++;
            else if (Character.isLowerCase(element.charAt(0))) countLower++;
            if (element.toUpperCase().startsWith("B") || element.toUpperCase().startsWith("P")) countB_P++;

            if (element.toLowerCase().contains("book") || element.toLowerCase().contains("pen")) countBookPen++;
        }
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements starting with B or P = " + countB_P);
        System.out.println("Elements having \"book\" or \"pen\" = " + countBookPen);


        System.out.println("\n-----TASK 10------\n");
        int[] task10Numbers = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(task10Numbers));

        int moreThan10 = 0, lessThan10 = 0;
        for (int element : task10Numbers){
            if (element > 10) moreThan10++;
            else if (element < 10) lessThan10++;
        }

        System.out.println("Elements that are more than 10 = " + moreThan10);
        System.out.println("Elements that are less than 10 = " + lessThan10);
        System.out.println("Elements that are 10 = " + (task10Numbers.length - moreThan10 - lessThan10));


        System.out.println("\n-----TASK 11------\n");

        int[] numbers1 = {5, 8, 13, 1, 2};
        int[] numbers2 = {9, 3, 67, 1, 0};
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

        int [] numbers3 = new int[5];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = Math.max(numbers1[i], numbers2[i]);
        }
        System.out.println(Arrays.toString(numbers3));







    }
}
/*
package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println("\n==========TASK05==========\n");

        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky" };

        boolean containsPluto = false;

        for (String cartoonDog : cartoonDogs) {
            if (cartoonDog.equals("Pluto")) {
                containsPluto = true;
                break;
            }
        }
        System.out.println(Arrays.toString(cartoonDogs));
        System.out.println(containsPluto);

        System.out.println("\n==========TASK06==========\n");

        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));
        System.out.println(Arrays.binarySearch(cartoonCats,"Garfield") >= 0 &&
                Arrays.binarySearch(cartoonCats,"Felix") >= 0);

        /*
        boolean containsGarfield = false;
        boolean containsFelix = false;
        boolean containsBoth = false;
        for (String cartoonCat : cartoonCats) {


            if(cartoonCat.equals("Garfield")) containsGarfield = true;
            else if(cartoonCat.equals("Felix")) containsFelix = true;

            if(containsGarfield && containsFelix)  {
                containsBoth = true;
                break;
            }



        }
        System.out.println(Arrays.toString(cartoonCats));
        System.out.println(containsBoth);







        System.out.println("\n==========TASK07==========\n");
                double[] doubleArr = {10.5, 20.75, 70, 80, 15.75, 15, 12};

                System.out.println(Arrays.toString(doubleArr));
                for (double v : doubleArr) {
                if(v % (int)v == 0) System.out.println((int)v);
                else System.out.println(v);
                }
                System.out.println("\n==========TASK08==========\n");

                char[] charArr = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4', ' '};
                int uLetters = 0;
                int lLetters = 0;
                int digits = 0;
                int special = 0;

                for (char c : charArr) {
                if(Character.isUpperCase(c)) uLetters++;
                else if(Character.isLowerCase(c)) lLetters++;
                else if(Character.isDigit(c)) digits++;
                else if(c != ' ') special++;
                }

                System.out.println("Letter = " + (uLetters + lLetters));
                System.out.println("Uppercase letters = " + uLetters);
                System.out.println("lowercase letters = " + lLetters);
                System.out.println("digits = " + digits);
                System.out.println("Special characters = " + special);
                System.out.println("\n==========TASK09==========\n");

                String[] strArr = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
                int startsWithUpper = 0;
                int startsWithLower = 0;
                int startsWithBOrP = 0;
                int containsBookOrPen = 0;

                for (String s : strArr) {
                if (Character.isUpperCase(s.charAt(0))) startsWithUpper++;
                else startsWithLower++;

                if(s.toLowerCase().charAt(0) == 'b' || s.toLowerCase().charAt(0) == 'p') startsWithBOrP++;

                if(s.toLowerCase().contains("book") || s.toLowerCase().contains("pen")) containsBookOrPen++;
                }
                System.out.println(Arrays.toString(strArr));
                System.out.println("Elements starts with uppercase = " + startsWithUpper +
                "\nElements starts with lowercase = " + startsWithLower +
                "\nElements starting with B or P = " + startsWithBOrP +
                "\nElements having ”book” or “pen”= " + containsBookOrPen);
                System.out.println("\n==========TASK10==========\n");

                int[] numArr = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
                int moreThanTen = 0;
                int lessThanTen = 0;
                int isTen = 0;

                for (int elements : numArr) {
                if(elements > 10) moreThanTen++;
                else if(elements < 10) lessThanTen++;
        else isTen++;
        }

        System.out.println(Arrays.toString(numArr));
        System.out.println("Elements that are more than 10 = " + moreThanTen);
        System.out.println("Elements that are less than 10 = " + lessThanTen);
        System.out.println("Elements that are 10 = " + isTen);

        System.out.println("\n==========TASK11==========\n");
        int[] firstArr = {5, 8, 13, 1, 2};
        int[] secArr = {9, 3, 67, 1, 0};
        int[] thirdArr = new int[5];

        for (int i = 0; i < thirdArr.length; i++) {
        thirdArr[i] = Math.max(firstArr[i],secArr[i]);
        }
        System.out.println("1st array is = " + Arrays.toString(firstArr));
        System.out.println("2nd array is = " + Arrays.toString(secArr));
        System.out.println("3rd array is = " + Arrays.toString(thirdArr));

        }
        }
 */