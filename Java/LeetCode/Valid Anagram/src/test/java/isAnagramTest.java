import org.example.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class isAnagramTest {
    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testIsAnagramTrue() {
        String s = "racecar";
        String t = "carrace";

        boolean actual = solution.isAnagram(s, t);

        Assert.assertTrue(actual);
    }

    @Test
    public void testIsAnagramFalse() {
        String s = "jar";
        String t = "jam";

        boolean actual = solution.isAnagram(s, t);

        Assert.assertFalse(actual);
    }

    @Test
    public void testIsAnagramTrueRepeatingLetters() {
        String s = "bbcc";
        String t = "ccbc";

        boolean actual = solution.isAnagram(s, t);

        Assert.assertFalse(actual);
    }
}
