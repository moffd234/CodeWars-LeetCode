import org.junit.Assert;
import org.junit.Test;
import org.example.Kata;
import java.util.ArrayList;

public class ArrayListConversionTest {
    @Test
    public void convertToArray() {
        ArrayList<int[]> input = new ArrayList<>();
        input.add(new int[]{1, 2});
        input.add(new int[]{3, 4});
        input.add(new int[]{5, 6});
        input.add(new int[]{7, 8});

        int[][] expected = new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] actual = Kata.convertTo2DArray(input);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void convertToArrayEmpty() {
        ArrayList<int[]> input = new ArrayList<>();
        int[][] expected = new int[0][];
        int[][] actual = Kata.convertTo2DArray(input);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void convertToArrayLengthOne() {
        ArrayList<int[]> input = new ArrayList<>();
        input.add(new int[]{1, 2});
        int[][] expected = new int[][]{{1, 2}};
        int[][] actual = Kata.convertTo2DArray(input);

        Assert.assertArrayEquals(expected, actual);
    }
}
