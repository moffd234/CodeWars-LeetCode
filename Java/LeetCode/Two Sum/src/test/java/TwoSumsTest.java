import org.example.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumsTest {
    Solution subject;

    @Before
    public void setUp() throws Exception {
        subject = new Solution();
    }

    @Test
    public void testTwoSum(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {0, 1};
        int[] actual = subject.twoSum(nums, target);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSum1(){
        int[] nums = {3,2,4};
        int target = 6;

        int[] expected = {1, 2};
        int[] actual = subject.twoSum(nums, target);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testTwoSum2(){
        int[] nums = {3,3};
        int target = 6;

        int[] expected = {0, 1};
        int[] actual = subject.twoSum(nums, target);

        Assert.assertArrayEquals(expected, actual);
    }
}
