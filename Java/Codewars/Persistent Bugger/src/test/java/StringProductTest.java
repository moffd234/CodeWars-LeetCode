import org.example.Persist;
import org.junit.Assert;
import org.junit.Test;

public class StringProductTest {
    @Test
    public void stringProduct0() {
        String expected = "0";
        String actual = Persist.stringProduct("0");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringProduct10() {
        String expected = "0";
        String actual = Persist.stringProduct("10");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringProduct23() {
        String expected = "6";
        String actual = Persist.stringProduct("23");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringProduct999() {
        String expected = "729";
        String actual = Persist.stringProduct("999");
        Assert.assertEquals(expected, actual);
    }
}
