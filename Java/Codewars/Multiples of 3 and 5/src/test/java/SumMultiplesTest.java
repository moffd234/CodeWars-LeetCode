import org.example.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SumMultiplesTest {

    Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void sumMultiples() {
        ArrayList<Integer> multiples = new ArrayList<>(Arrays.asList(3, 5, 6, 9, 10, 12));

        int expected = 45;
        int actual = solution.sumMultiples(multiples);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumMultiples1() {
        ArrayList<Integer> multiples = new ArrayList<>(Arrays.asList(3, 5, 6, 9));

        int expected = 23;
        int actual = solution.sumMultiples(multiples);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumMultiples2() {
        ArrayList<Integer> multiples = new ArrayList<>(1);

        int expected = 0;
        int actual = solution.sumMultiples(multiples);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumMultiples3() {
        ArrayList<Integer> multiples = new ArrayList<>(Arrays.asList(3, 5, 6, 9, 10, 12, 15, 18,
                20, 21, 24, 25, 27, 30, 33, 35, 36, 39, 40, 42, 45, 48, 50, 51, 54, 55, 57, 60,
                63, 65, 66, 69, 70, 72, 75, 78, 80, 81, 84, 85, 87, 90, 93, 95, 96, 99));

        int expected = 2318;
        int actual = solution.sumMultiples(multiples);

        Assert.assertEquals(expected, actual);
    }
}
