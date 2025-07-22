import org.example.Kata;
import org.junit.Assert;
import org.junit.Test;

public class CalcWordScoreTest {

    @Test
    public void calcWordScoreSingleLetter() {
        int expected = 2;
        int actual = Kata.calcWordScore("b");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calcWordScore() {
        int expected = 2;
        int actual = Kata.calcWordScore("aa");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calcWordScoreEmpty() {
        int expected = 0;
        int actual = Kata.calcWordScore("");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calcWordScoreLong() {
        int expected = 351;
        int actual = Kata.calcWordScore("abcdefghijklmnopqrstuvwxyz");
        Assert.assertEquals(expected, actual);
    }

}
