import org.example.FindOutlier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class isOddTests {


    @Test
    public void testIsOddTrue(){
        boolean actual = FindOutlier.isOdd(1);
        Assertions.assertTrue(actual);
    }

    @Test
    public void testIsOddFalse(){
        boolean actual = FindOutlier.isOdd(2);
        Assertions.assertFalse(actual);
    }

    @Test
    public void testIsOddNegativeTrue(){
        boolean actual = FindOutlier.isOdd(-15);
        Assertions.assertTrue(actual);
    }

    @Test
    public void testIsOddNegativeFalse(){
        boolean actual = FindOutlier.isOdd(-24);
        Assertions.assertFalse(actual);
    }

}
