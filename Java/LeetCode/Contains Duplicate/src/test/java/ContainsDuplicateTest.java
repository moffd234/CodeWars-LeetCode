import org.example.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainsDuplicateTest {
    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void containsDuplicateTestTrue() {
        int[] nums = {1,2,3,3};

        boolean actual = solution.hasDuplicate(nums);

        Assert.assertTrue(actual);
    }

    @Test
    public void containsDuplicateTestFalse() {
        int[] nums = {1,2,3,4};

        boolean actual = solution.hasDuplicate(nums);

        Assert.assertFalse(actual);
    }

}
