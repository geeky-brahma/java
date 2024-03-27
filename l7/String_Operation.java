package l7;

import java.util.Scanner;

public class String_Operation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);

        // a. Change the case of the string
        System.out.println("Changing case: " + changeCase(str1));

        // b. Reverse the string
        System.out.println("Reversed string: " + reverseString(str1));

        // c. Compare two strings
        System.out.println("Comparing strings: " + str1.equals(str2));

        // d. Insert one string into another string
        System.out.println("Inserting string2 into string1: " + insertString(str1, str2, 1)); // Example position 1

        // e. Convert the string to uppercase and lowercase
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // f. Check whether the character is present in the string and at which position
        checkCharacterPresence(str1, ch);

        // g. Check whether the string is palindrome or not.
        System.out.println("Is palindrome: " + isPalindrome(str1));

        // h. Check the number of word, vowel and consonant in the string
        checkWordsVowelsConsonants(str1);

        scanner.close();
    }

    private static String changeCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static String insertString(String original, String toInsert, int position) {
        return new StringBuilder(original).insert(position, toInsert).toString();
    }

    private static void checkCharacterPresence(String str, char ch) {
        int index = str.indexOf(ch);
        if (index != -1) {
            System.out.println("Character '" + ch + "' found at position: " + index);
        } else {
            System.out.println("Character '" + ch + "' not found in the string.");
        }
    }

    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    private static void checkWordsVowelsConsonants(String str) {
        int vowels = 0, consonants = 0, words = str.split("\\s+").length;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Words: " + words + ", Vowels: " + vowels + ", Consonants: " + consonants);
    }
}