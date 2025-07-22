import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.FindOutlier;

public class OutlierIsOddTests {
    
    @Test
    public void outlierIsOddTestFalse() {
        int[] integers = {4,1,1,1,5,7,7,9,3,3,3,3};

        boolean actual = FindOutlier.outlierIsOdd(integers);

        Assertions.assertFalse(actual);
    }

    @Test
    public void outlierIsOddTestFalse1() {
        int[] integers = {1,2,1,1,5,7,7,9,3,3,3,3};

        boolean actual = FindOutlier.outlierIsOdd(integers);

        Assertions.assertFalse(actual);
    }

    @Test
    public void outlierIsOddTestFalse2() {
        int[] integers = {1,1,6,1,5,7,7,9,3,3,3,3};

        boolean actual = FindOutlier.outlierIsOdd(integers);

        Assertions.assertFalse(actual);
    }
    @Test
    public void outlierIsOddTestFalse3() {
        int[] integers = {1,1,1,1,5,7,7,2,3,3,3,3};

        boolean actual = FindOutlier.outlierIsOdd(integers);

        Assertions.assertFalse(actual);
    }

    @Test
    public void outlierIsOddTestTrue() {
        int[] integers = {3,2,2,2,6,8,8,8,4,4,4,4};

        boolean actual = FindOutlier.outlierIsOdd(integers);

        Assertions.assertTrue(actual);
    }

    @Test
    public void outlierIsOddTestTrue1() {
        int[] integers = {2,5,2,2,6,8,8,8,4,4,4,4};

        boolean actual = FindOutlier.outlierIsOdd(integers);

        Assertions.assertTrue(actual);
    }

    @Test
    public void outlierIsOddTestTrue2() {
        int[] integers = {4,2,9,2,6,8,8,8,4,4,4,4};

        boolean actual = FindOutlier.outlierIsOdd(integers);

        Assertions.assertTrue(actual);
    }

    @Test
    public void outlierIsOddTestTrue3() {
        int[] integers = {2,2,2,2,6,8,8,8,3,4,4,4};

        boolean actual = FindOutlier.outlierIsOdd(integers);

        Assertions.assertTrue(actual);
    }
}
