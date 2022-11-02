package homeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("\n----Task-1----\n");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n----Task-2----\n");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println("\n----Task-3----\n");
        ArrayList<Integer> numbersT3 = new ArrayList<>();
        numbersT3.add(23);
        numbersT3.add(-34);
        numbersT3.add(-56);
        numbersT3.add(0);
        numbersT3.add(89);
        numbersT3.add(100);
        System.out.println(numbersT3);
        Collections.sort(numbersT3);
        System.out.println(numbersT3);


        System.out.println("\n----Task-4----\n");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);


        System.out.println("\n----Task-5----\n");
        ArrayList<String> marvelCharacters = new ArrayList<>();
        marvelCharacters.add("Spider Man");
        marvelCharacters.add("Iron Man");
        marvelCharacters.add("Black Panther");
        marvelCharacters.add("Deadpool");
        marvelCharacters.add("Captain America");
        System.out.println(marvelCharacters);
        boolean hasWolverine = false;
        for (String marvelCharacter : marvelCharacters) {
            if(marvelCharacter.equalsIgnoreCase("Wolverine")) hasWolverine = true;

        }
        System.out.println(hasWolverine);


        System.out.println("\n----Task-6----\n");
        ArrayList<String> avengersCharacters = new ArrayList<>();
        avengersCharacters.add("Hulk");
        avengersCharacters.add("Black Widow");
        avengersCharacters.add("Captain America");
        avengersCharacters.add("Iron Man");

        Collections.sort(avengersCharacters);
        System.out.println(avengersCharacters);
        boolean hasHulk = false;
        boolean hasIronMan = false;
        for (String avengersCharacter : avengersCharacters) {
            if (avengersCharacter.equalsIgnoreCase("Hulk"))       hasHulk = true;
            if (avengersCharacter.equalsIgnoreCase("iron man"))   hasIronMan = true;
        }
        if (hasHulk && hasIronMan)System.out.println(true);
        else System.out.println(false);


        System.out.println("\n----Task-7----\n");
        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('x');
        characters.add('$');
        characters.add('%');
        characters.add('9');
        characters.add('*');
        characters.add('+');
        characters.add('F');
        characters.add('G');

        System.out.println(characters);
        for (Character character : characters) {
            System.out.println(character);
        }


        System.out.println("\n----Task-8----\n");
        ArrayList<String> computerObjects = new ArrayList<>();

        computerObjects.add("Desk");
        computerObjects.add("Laptop");
        computerObjects.add("Mouse");
        computerObjects.add("Monitor");
        computerObjects.add("Mouse-Pad");
        computerObjects.add("Adapter");

        System.out.println(computerObjects);
        Collections.sort(computerObjects);
        System.out.println(computerObjects);

        int containsM_m = 0;
        int containsA_E = 0;

        for (String computerObject : computerObjects) {
            if (computerObject.toLowerCase().startsWith("m")) containsM_m++;
            if (!computerObject.toLowerCase().contains("a")){
                if (!computerObject.toLowerCase().contains("e")) containsA_E++;
            }
        }
        System.out.println(containsM_m);
        System.out.println(containsA_E);


        System.out.println("\n----Task-9----\n");
        ArrayList<String> kitchenObjects = new ArrayList<>();
        kitchenObjects.add("Plate");
        kitchenObjects.add("spoon");
        kitchenObjects.add("fork");
        kitchenObjects.add("Knife");
        kitchenObjects.add("cup");
        kitchenObjects.add("Mixer");

        System.out.println(kitchenObjects);

        int countUpper = 0;
        int countLower = 0;
        int hasP = 0;
        int startEndsP = 0;

        for (String kitchenObject : kitchenObjects) {
            if (kitchenObject.charAt(0) >= 65 && kitchenObject.charAt(0) <= 90 ) countUpper++;
            else if (kitchenObject.charAt(0) >= 97 && kitchenObject.charAt(0) <= 122) countLower++;
            if (kitchenObject.toLowerCase().contains("p")) hasP++;
            if (kitchenObject.toLowerCase().startsWith("p") || kitchenObject.toLowerCase().endsWith("p")) startEndsP++;
        }
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements having P or p = " + hasP);
        System.out.println("Elements starting or ending P or p = " + startEndsP);


        System.out.println("\n----Task-10----\n");

        ArrayList<Integer> numbersT10 = new ArrayList<>();

        numbersT10.add(3);
        numbersT10.add(5);
        numbersT10.add(7);
        numbersT10.add(10);
        numbersT10.add(0);
        numbersT10.add(20);
        numbersT10.add(17);
        numbersT10.add(10);
        numbersT10.add(23);
        numbersT10.add(56);
        numbersT10.add(78);

        System.out.println(numbersT10);

        int divideBy10 = 0;
        int evenAndGreaterThan15 = 0;
        int oddAndLessThan20 = 0;
        int lessThan15OrGreaterThan50 = 0;

        for (Integer num : numbersT10) {

            if (num % 10 == 0) divideBy10++;
            if (num % 2 == 0 && num > 15) evenAndGreaterThan15++;
            if (num % 2 == 1 && num < 20) oddAndLessThan20++;
            if (num < 15 || num > 50) lessThan15OrGreaterThan50++;
        }
        System.out.println("Elements that can be divided by 10 = " + divideBy10);
        System.out.println("Elements that are even and greater than 15 = " + evenAndGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddAndLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + lessThan15OrGreaterThan50);

    }
}
