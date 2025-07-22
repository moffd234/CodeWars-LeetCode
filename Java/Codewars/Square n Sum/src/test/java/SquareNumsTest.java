import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareNumsTest {

    @Test
    public void testBasic(){
        assertEquals(9, Main.squareSum(new int[] {1, 2, 2}));
        assertEquals(5, Main.squareSum(new int[] {1, 2}));
        assertEquals(50, Main.squareSum(new int[] {5, -3, 4}));
        assertEquals(0, Main.squareSum(new int[] {}));
    }
}