import org.example.NumberUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberUtilsTest {

    @Test
    public void exampleTests() {
        assertTrue(NumberUtils.isNarcissistic(153));
        assertTrue(NumberUtils.isNarcissistic(1634));
        assertFalse(NumberUtils.isNarcissistic(112));
    }

    @Test
    public void userCreatedTests() {
        assertTrue(NumberUtils.isNarcissistic(1));
        assertFalse(NumberUtils.isNarcissistic(10));
        assertTrue(NumberUtils.isNarcissistic(407));
        assertFalse(NumberUtils.isNarcissistic(100));
        assertFalse(NumberUtils.isNarcissistic(200));
        assertFalse(NumberUtils.isNarcissistic(123456));
        assertTrue(NumberUtils.isNarcissistic(9474));
        assertTrue(NumberUtils.isNarcissistic(0));
        assertFalse(NumberUtils.isNarcissistic(Integer.MAX_VALUE));
    }
}