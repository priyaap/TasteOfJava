import org.example.JavaStringFunctions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestJavaStringFunctions {

    @Test
    public void testAreStringsAnagramTrue() {
        String s1 = "abc";
        String s2 = "cba";
        Assert.assertTrue(JavaStringFunctions.areStringsAnagram(s1, s2), s1 + " and " + s2 + " are expected to be anagrams");
    }

    @Test
    public void testAreStringsAnagramFalse() {
        String s1 = "abc";
        String s2 = "xyz";
        Assert.assertFalse(JavaStringFunctions.areStringsAnagram(s1, s2), s1 + " and " + s2 + " are not expected to be anagrams");
    }

}
