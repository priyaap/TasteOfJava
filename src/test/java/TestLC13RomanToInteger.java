import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.Set;

import static org.example.LC13RomanToInteger.convertRomanToInt;

public class TestLC13RomanToInteger {

    @Test
    public void testLC13RomanToInteger() {
        Map<String, Integer> romanNumberMapping;
        romanNumberMapping = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000);

        Set<String> romanNumbers = romanNumberMapping.keySet();

        for (String romanNumber : romanNumbers) {
            System.out.println("Int equivalent of " + romanNumber + " = " + convertRomanToInt(romanNumber));
            //Assert.assertEquals(convertRomanToInt(romanNumber), romanNumberMapping.get(romanNumber));

        }
    }


    @Test
    public void testLC13(){
        System.out.println(convertRomanToInt("VX"));      // 3
        System.out.println(convertRomanToInt("IV"));       // 4
        System.out.println(convertRomanToInt("IX"));       // 9
        System.out.println(convertRomanToInt("LVIII"));    // 58
        System.out.println(convertRomanToInt("MCMXCIV"));
    }

}
