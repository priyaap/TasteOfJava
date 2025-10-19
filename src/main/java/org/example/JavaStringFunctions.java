package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaStringFunctions {

    public static boolean areStringsAnagram(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1, array2)) {
            return true;
        }
        return false;

    }







}
