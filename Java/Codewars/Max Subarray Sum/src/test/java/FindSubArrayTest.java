import org.junit.Assert;
import org.junit.Test;
import org.example.Max;
import java.util.ArrayList;

public class FindSubArrayTest {

    @Test
    public void findSubArraysTest() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer[]> expected = new ArrayList<>();

        expected.add(new Integer[]{});
        expected.add(new Integer[]{1});
        expected.add(new Integer[]{1, 2});
        expected.add(new Integer[]{1, 2, 3});
        expected.add(new Integer[]{1, 2, 3, 4});
        expected.add(new Integer[]{1, 2, 3, 4, 5});
        expected.add(new Integer[]{1, 2, 3, 4, 5, 6});
        expected.add(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        expected.add(new Integer[]{2});
        expected.add(new Integer[]{2, 3});
        expected.add(new Integer[]{2, 3, 4});
        expected.add(new Integer[]{2, 3, 4, 5});
        expected.add(new Integer[]{2, 3, 4, 5, 6});
        expected.add(new Integer[]{2, 3, 4, 5, 6, 7});
        expected.add(new Integer[]{3});
        expected.add(new Integer[]{3, 4});
        expected.add(new Integer[]{3, 4, 5});
        expected.add(new Integer[]{3, 4, 5, 6});
        expected.add(new Integer[]{3, 4, 5, 6, 7});
        expected.add(new Integer[]{4});
        expected.add(new Integer[]{4, 5});
        expected.add(new Integer[]{4, 5, 6});
        expected.add(new Integer[]{4, 5, 6, 7});
        expected.add(new Integer[]{5});
        expected.add(new Integer[]{5, 6});
        expected.add(new Integer[]{5, 6, 7});
        expected.add(new Integer[]{6});
        expected.add(new Integer[]{6, 7});
        expected.add(new Integer[]{7});

        ArrayList<Integer[]> actual = Max.findSubArrays(nums);

        // Convert to array for comparison
        Assert.assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void findSubArraysEmptyTest() {
        int[] nums = {};
        ArrayList<Integer[]> expected = new ArrayList<>();

        expected.add(new Integer[]{});
        ArrayList<Integer[]> actual = Max.findSubArrays(nums);

        Assert.assertEquals(1, actual.size());
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void findSubArrayTest2() {
        int[] nums = {1, -2, 3, -4, -5, -6, 7};
        ArrayList<Integer[]> expected = new ArrayList<>();

        expected.add(new Integer[]{});
        expected.add(new Integer[]{1});
        expected.add(new Integer[]{1, -2});
        expected.add(new Integer[]{1, -2, 3});
        expected.add(new Integer[]{1, -2, 3, -4});
        expected.add(new Integer[]{1, -2, 3, -4, -5});
        expected.add(new Integer[]{1, -2, 3, -4, -5, -6});
        expected.add(new Integer[]{1, -2, 3, -4, -5, -6, 7});
        expected.add(new Integer[]{-2});
        expected.add(new Integer[]{-2, 3});
        expected.add(new Integer[]{-2, 3, -4});
        expected.add(new Integer[]{-2, 3, -4, -5});
        expected.add(new Integer[]{-2, 3, -4, -5, -6});
        expected.add(new Integer[]{-2, 3, -4, -5, -6, 7});
        expected.add(new Integer[]{3});
        expected.add(new Integer[]{3, -4});
        expected.add(new Integer[]{3, -4, -5});
        expected.add(new Integer[]{3, -4, -5, -6});
        expected.add(new Integer[]{3, -4, -5, -6, 7});
        expected.add(new Integer[]{-4});
        expected.add(new Integer[]{-4, -5});
        expected.add(new Integer[]{-4, -5, -6});
        expected.add(new Integer[]{-4, -5, -6, 7});
        expected.add(new Integer[]{-5});
        expected.add(new Integer[]{-5, -6});
        expected.add(new Integer[]{-5, -6, 7});
        expected.add(new Integer[]{-6});
        expected.add(new Integer[]{-6, 7});
        expected.add(new Integer[]{7});

        ArrayList<Integer[]> actual = Max.findSubArrays(nums);

        // Convert to array for comparison
        Assert.assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i), actual.get(i));
        }
    }
}
