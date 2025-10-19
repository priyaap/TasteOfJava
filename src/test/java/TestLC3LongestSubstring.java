import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.example.LC3LongestSubstring.findLongestSubstring;

public class TestLC3LongestSubstring {

    @Test
    public void testLC3LongestSubstring1(){
        String testString = "aaaaaaaaaaaaaaabbbbbbbbbbbbcccccccccddddddddd";
        Assert.assertEquals(findLongestSubstring(testString), "abcd");
    }

    @Test
    public void testLC3LongestSubstring2(){
        String testString = "abcd";
        Assert.assertEquals(findLongestSubstring(testString), "abcd");
    }

    @Test
    public void testLC3LongestSubstring3(){
        String testString = "a";
        Assert.assertEquals(findLongestSubstring(testString), "a");
    }

    @Test
    public void testLC3LongestSubstring4(){
        String testString = "null";
        Assert.assertEquals(findLongestSubstring(testString), "nul");
    }

    @Test
    public void testLC3LongestSubstring5(){
        String testString = "111111222222333333444444";
        Assert.assertEquals(findLongestSubstring(testString), "1234");
    }

    //@TODO
    @Ignore
    @Test
    public void testLC3LongestSubstring6(){
        String testString = "";
        Assert.assertEquals(findLongestSubstring(testString), "");
    }
}
