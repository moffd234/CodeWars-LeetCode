import org.junit.Test;
import org.example.Solution;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test10() {
        assertEquals(23, new Solution().solution(10));
    }

    @Test
    public void test100() {
        assertEquals(2318, new Solution().solution(100));
    }

    @Test
    public void test15() {
        assertEquals(45, new Solution().solution(15));
    }

    @Test
    public void test2() {
        assertEquals(0, new Solution().solution(2));
    }

}
