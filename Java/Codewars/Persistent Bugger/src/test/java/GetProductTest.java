import org.example.Persist;
import org.junit.Assert;
import org.junit.Test;

public class GetProductTest {

    @Test
    public void getProductOfDigits0() {
        long expected = 0;
        long actual = Persist.getProductOfDigits(new String[]{});

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getProductOfDigits1() {
        long expected = 1;
        long actual = Persist.getProductOfDigits(new String[]{"1"});

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getProductOfDigits123() {
        long expected = 6;
        long actual = Persist.getProductOfDigits(new String[]{"1", "2", "3"});

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getProductOfDigits999() {
        long expected = 729;
        long actual = Persist.getProductOfDigits(new String[]{"9", "9", "9"});

        Assert.assertEquals(expected, actual);
    }


}
