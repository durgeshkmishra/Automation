package cgiInterviewquestions;

//2. String Manipulation
//String manipulation is a common task in automation testing, especially when dealing with input/output data.
//
//Question: Write a Java program to remove duplicate characters from a string.
//        Question: Write a Java program to check if two strings are anagrams.
//Question: Write a Java program to find the first non-repeated character in a string.
//        Question: Write a Java program to capitalize the first letter of each word in a sentence.
//19. Write a Java program to remove all whitespace from a string.


import java.util.Arrays;
import java.util.HashMap;

//import static jdk.internal.org.jline.utils.Colors.s;

public class StringManupulation {
    public static void main(String[] args) {
        String str = "Programming language";
        //Use String.replaceAll() method with the regular expression \\s+ to remove all white spaces from the string.
        System.out.println(str.replaceAll("\\s+", ""));
        // logic to reverse the string
        StringBuilder sb = new StringBuilder(str);
        String reversestr = sb.reverse().toString();
        System.out.println(reversestr);
        //capitalize the first letter of each word in a sentence.
        String str1 = capitalizeFirstLetter(str);
        System.out.println(str1);
        //remove all whitespace from a string
        String str2 = removeWhiteSpace(str);
        System.out.println(str2);
        //the method to find the first non-repeated character
        char chr3 = nonRepatedCharacter(str);
        System.out.println("This is the non repeated character " + chr3);
        //check if two strings are anagrams
        String str4 = "listen";
        String str5 = "silent";
        checkAnagrams(str4,str5);
      // Check the string is palidrome

        String str6 = "madam";
        checkPalidorme(str6);
    }

    public static String capitalizeFirstLetter(String str) {
        //split the sentence in word
        String[] words = str.split(" ");
        StringBuilder capetalizedSentence = new StringBuilder();
        //iterate through each word
        for (String word : words) {
            String capetalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            capetalizedSentence.append(capetalizedWord).append(" ");
        }
        return capetalizedSentence.toString().trim();

    }

    public static String removeWhiteSpace(String str) {
        String[] words = str.split(" ");
        StringBuilder removeSpace = new StringBuilder();
        //iterate through each word
        for (String word : words) {
            removeSpace.append(word);
        }
        return removeSpace.toString().trim();
    }

    public static char nonRepatedCharacter(String str) {
        //create a has map to restore the character and their frequency
        HashMap<Character, Integer> charCount = new HashMap<>();
        //Iterate over the string and count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

        }
        // Iterate over the string again to find the first character with count 1
        for (int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if (charCount.get(findChar) == 1) {
                return findChar;
            }
        }
        return 0;
    }
    public static void checkAnagrams(String str4, String str5)
    {
        // If the lengths of the strings are different, they cannot be anagrams
        if (str4.length() != str5.length())
        {
            System.out.println("String are not Anagrams");
        }
        else
        {
            // Convert both strings to char arrays and sort them
            char[] c1 = str4.toCharArray();
            char[] c2 = str5.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            Boolean b = Arrays.equals(c1,c2);
            if( b = true)
            System.out.println("Syring are Anagrams");

        }

    }
    public static void checkPalidorme(String str6) {
        int left = 0;
        int right = str6.length() - 1;
        while (left < right) {
            if (str6.charAt(left) != str6.charAt(right)) {
                System.out.println("string is not palidrome");
            }
            left++;
            right--;


        }

        System.out.println("string is palidrome");
    }


    }


