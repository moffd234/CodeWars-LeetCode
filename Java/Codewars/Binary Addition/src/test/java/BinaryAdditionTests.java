import org.example.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryAdditionTests {
    @Test
    public void testBinaryAddition() {
        String expected = "10";
        String actual = Kata.binaryAddition(1, 1);

       assertEquals(expected, actual);
    }

    @Test
    public void testBinaryAddition1() {
        String expected = "1";
        String actual = Kata.binaryAddition(0, 1);

        assertEquals(expected, actual);
    }

    @Test
    public void testBinaryAddition2() {
        String expected = "100";
        String actual = Kata.binaryAddition(2, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testBinaryAddition3(){
        String expected = "111111";
        String actual = Kata.binaryAddition(51, 12);

        assertEquals(expected, actual);
    }
}
