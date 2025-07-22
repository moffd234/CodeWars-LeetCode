import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GroupAnagramsTest {
    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void groupAnagramsTest() {
        String[] strings = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("act", "cat"),
                Arrays.asList("pots", "tops", "stop"),
                List.of("hat")
        );

        List<List<String>> actual = solution.groupAnagrams(strings);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void groupAnagramsTestOnlyOne() {
        String[] strings = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> expected = List.of(List.of("x"));

        List<List<String>> actual = solution.groupAnagrams(strings);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void groupAnagramsTestOnlyEmpty() {
        String[] strings = {""};
        List<List<String>> expected = List.of(List.of(""));

        List<List<String>> actual = solution.groupAnagrams(strings);

        Assert.assertEquals(expected, actual);
    }
}
