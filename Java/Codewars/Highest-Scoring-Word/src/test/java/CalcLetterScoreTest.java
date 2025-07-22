import org.example.Kata;
import org.junit.Assert;
import org.junit.Test;

public class CalcLetterScoreTest {

    @Test
    public void testCalcLetterScore() {
        int score = 0;

        for(char letter = 'a'; letter <='z'; letter++){
            int expected = ++score;
            int actual = Kata.calcLetterScore(letter);

            Assert.assertEquals(expected, actual);
        }
    }

}
