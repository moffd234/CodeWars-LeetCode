import org.example.NumberUtils;
import org.junit.Assert;
import org.junit.Test;

public class GetSumTests {

    @Test
    public void test0() {
        int expected = 0;
        int actual = NumberUtils.getSum(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test100() {
        int expected = 1;
        int actual = NumberUtils.getSum(100);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1000() {

        int expected = 1;
        int actual = NumberUtils.getSum(1000);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test12345() {
        int expected = 15;
        int actual = NumberUtils.getSum(12345);
        Assert.assertEquals(expected, actual);
    }
}
