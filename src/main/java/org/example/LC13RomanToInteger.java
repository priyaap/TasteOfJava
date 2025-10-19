package org.example;

import java.util.*;



public class LC13RomanToInteger {

    public static int convertRomanToInt(String s) {

        // Step 1: Create a map for Roman numerals and their values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Step 2: Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanMap.get(s.charAt(i));

            // Step 3: Subtract if smaller value comes before larger one
            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }

            prevValue = value;
        }

        return total;
    }
}





