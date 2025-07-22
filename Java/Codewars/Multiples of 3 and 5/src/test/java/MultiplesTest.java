import org.junit.Before;
import org.junit.Test;
import org.example.Solution;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MultiplesTest {
    Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void test10() {

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 5, 6, 9));
        ArrayList<Integer> actual = solution.getMultiples(10);

        assertEquals(expected, actual);
    }

    @Test
    public void test15() {

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 5, 6, 9, 10, 12));
        ArrayList<Integer> actual = solution.getMultiples(15);

        assertEquals(expected, actual);
    }

    @Test
    public void test0() {

        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> actual = solution.getMultiples(0);

        assertEquals(expected, actual);
    }

    @Test
    public void test100() {

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 5, 6, 9, 10, 12, 15, 18,
                20, 21, 24, 25, 27, 30, 33, 35, 36, 39, 40, 42, 45, 48, 50, 51, 54, 55, 57, 60,
                63, 65, 66, 69, 70, 72, 75, 78, 80, 81, 84, 85, 87, 90, 93, 95, 96, 99));
        ArrayList<Integer> actual = solution.getMultiples(100);

        assertEquals(expected, actual);
    }

}
