package switchPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CountVandC {
    private static String word;
    public static void main(String[] args) {
        getInput();
        countLetters(word);
        countLetterswithSwitch(word);
    }
    static void getInput()
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Ente trhe word ");
       // word = input.next().toLowerCase();
        word = input.nextLine();
      // System.out.println(word);
        System.out.println(word);
        System.out.println(word.length());

    }
    static void countLetters(String word){

        char[]a = word.toCharArray();
        int vowel = 0;  // Initialize vowel counter
        int consonent = 0;  // Initialize consonant counter
        System.out.println(Arrays.toString(a));
        for (int i = 0 ; i< a.length; i++)
        {
            if (a[i]=='a'||a[i] == 'e'||a[i] == 'i'||a[i] == 'o'||a[i] == 'u')
            {
                vowel++;
            }
            else
               consonent++;


        }
        System.out.println("No of vowel are - "+vowel);
        System.out.println("No Of consonent are - - " +consonent);
    }
static void countLetterswithSwitch(String word)
{
    char[]b = word.toCharArray();
    int vowel = 0;  // Initialize vowel counter
    int consonent = 0;  // Initialize consonant counter
    System.out.println(Arrays.toString(b));
    for (int i = 0; i < b.length; i++) {
        char currentChar = b[i];
        switch (currentChar){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                vowel++;
                break;
            default:
                consonent++;
                break;
        }

    }
    System.out.println("No of vowel are - " +vowel);
    System.out.println("No of consonet are - "+consonent);

}

}
