import org.junit.Assert;
import org.junit.Test;
import org.example.Max;


public class FindSumTest {

    @Test
    public void findSumEmpty() {
        Integer[] arr = {};

        int expected = 0;
        int actual = Max.findSum(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findSum() {
        Integer[] arr = {1,-2,-3,-4,5,-6,7,-8,9};

        int expected = -1;
        int actual = Max.findSum(arr);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void findSum2() {
        Integer[] arr = {1,-2,-3,-4,5,-6,7,8,9,10,-11,12,13,14,15,-16,-17,-18,19};

        int expected = 36;
        int actual = Max.findSum(arr);

        Assert.assertEquals(expected, actual);
    }
}
