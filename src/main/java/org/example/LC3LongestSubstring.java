package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class LC3LongestSubstring {

    public static String findLongestSubstring(String str) {


        char[] strArray = str.toCharArray();
        String strLetter = valueOf(strArray[0]);
        String longestSubstring = strLetter;

        for (char strChar: strArray){
            strLetter = valueOf(strChar);
            if(!longestSubstring.contains(strLetter)) {
                longestSubstring = longestSubstring.concat(strLetter);
            }

        }

        return longestSubstring;
    }
}
