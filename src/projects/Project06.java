package projects;


import java.util.ArrayList;

public class Project06 {
    public static int countMultipleWords(String[] arrays) {
        int count = 0;
        for (String word : arrays) {
            if (word.trim().contains(" ")) count++;
        }
        return count;
    }

    public static ArrayList removeNegatives(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number < 0);
        return numbers;
    }


    public static boolean validatePassword(String pw){
        boolean validLength = false;
        boolean pContainsDigit = false;
        boolean pContainsUppercase = false;
        boolean pContainsLowercase = false;
        boolean pContainsSpecial = false;
        boolean pNoSpaces = false;
        for (int i = 0; i < pw.length(); i++) {
            if (pw.length() >= 8 && pw.length() <= 16) validLength = true;
            if (pw.charAt(i) >= 48 && pw.charAt(i)<= 57) pContainsDigit = true;
            if (pw.charAt(i) >= 65 && pw.charAt(i)<= 90) pContainsUppercase = true;
            if (pw.charAt(i) >= 97 && pw.charAt(i)<= 122) pContainsLowercase = true;
            if (!Character.isWhitespace(i)) pNoSpaces = true;
            if ((pw.charAt(i) >= 33 && pw.charAt(i) <= 47) ||
                    (pw.charAt(i) >= 91 && pw.charAt(i) <= 96) ||
                    (pw.charAt(i) >= 123 && pw.charAt(i) <= 126))
                pContainsSpecial = true;
        }
        if (validLength && pContainsDigit && pContainsUppercase &&
                pContainsLowercase && pNoSpaces &&
                pContainsSpecial) return true;
        else return false;
    }

    public static boolean validateEmailAddress(String email){
        boolean noSpaces = false;
        int count = 0;
        boolean contains1Special= false;
        boolean emailFormat = false;
        for (int i = 0; i < email.length(); i++) {
            if (!Character.isWhitespace(i)) noSpaces = true;
            if (email.charAt(i) == '@') count++;
            if ((email.substring(0, email.indexOf('@')).length() >= 2) &&
                    (email.substring(email.indexOf('@')+1, email.indexOf('.')).length() >= 2)
                    && (email.substring(email.indexOf('.') +1).length() >= 2)) emailFormat = true;
        }
        if (count == 1) contains1Special = true;
        if (noSpaces && emailFormat && contains1Special) return true;
        else return false;
    }

    public static void main(String[] args) {
        String [] arr = {"foo", "", " ", "foo bar", "java is fun", "ruby"};
        System.out.println(countMultipleWords(arr));
        int [] numbers = {2, -5, 6, 7, -10, -78, 0, 15};
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(2);
        numbersList.add(-5);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(-10);
        numbersList.add(-78);
        numbersList.add(0);
        numbersList.add(15);
        System.out.println(removeNegatives(numbersList));
        System.out.println(validatePassword("abcd"));
        System.out.println(validateEmailAddress("a@gmail.com"));

    }
}
