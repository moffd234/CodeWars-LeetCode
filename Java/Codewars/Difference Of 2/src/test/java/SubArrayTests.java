import org.example.Kata;
import org.junit.Assert;
import org.junit.Test;

public class SubArrayTests {

    @Test
    public void findSubArray() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[][] expected = new int[][]
                {{1, 2}, {1, 3}, {1, 4}, {1, 5},
                        {2, 3}, {2, 4}, {2, 5},
                        {3, 4}, {3, 5},
                        {4, 5}};

        int[][] actual = Kata.findSubArrays(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findSubArray1() {
        int[] input = new int[]{1, 2, 3, 4};
        int[][] expected = new int[][]
                {{1, 2}, {1, 3}, {1, 4},
                        {2, 3}, {2, 4},
                        {3, 4}};

        int[][] actual = Kata.findSubArrays(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findSubArrayEmpty() {
        int[] input = new int[]{};
        int[][] expected = new int[][]{};

        int[][] actual = Kata.findSubArrays(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findSubArrayEmpty1() {

        int[] input = new int[]{1};
        int[][] expected = new int[][]{}; // < 2 elements means there are no subArrays of length 2

        int[][] actual = Kata.findSubArrays(input);
        Assert.assertArrayEquals(expected, actual);
    }
}
