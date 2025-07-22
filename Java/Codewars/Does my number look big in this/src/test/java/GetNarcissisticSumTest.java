import org.junit.Assert;
import org.junit.Test;
import org.example.NumberUtils;

public class GetNarcissisticSumTest {
    @Test
    public void test123() {
        int expected = 36;
        int actual = NumberUtils.calculateNarcissisticSum(123);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test153() {
        int expected = 153;
        int actual = NumberUtils.calculateNarcissisticSum(153);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test370() {
        int expected = 370;
        int actual = NumberUtils.calculateNarcissisticSum(370);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test9474() {
        int expected = 9474;
        int actual = NumberUtils.calculateNarcissisticSum(9474);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        int expected = 0;
        int actual = NumberUtils.calculateNarcissisticSum(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        int expected = 5;
        int actual = NumberUtils.calculateNarcissisticSum(5);
        Assert.assertEquals(expected, actual);
    }
}
