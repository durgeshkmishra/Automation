package cgiInterviewquestions;

import java.util.LinkedHashSet;

public class RemovetheduplicateCharacterFromString {
    public static void main(String[] args) {

        String str = "Programming";
                String result = removeDuplicateString(str);
        System.out.println("original String :-" + str);
        System.out.println("After removal of duplicate :-" + result);
    }
    public static  String removeDuplicateString(String str)
    {
        //use linkhashset
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // add character to link has set
        for (int i = 0;i<str.length();i++)
        {
            set.add(str.charAt(i));

        }
        //Build the string from the hashset
        StringBuilder sb = new StringBuilder();
        for (Character c : set)
        {
            sb.append(c);

        }
        return sb.toString();
    }
}

