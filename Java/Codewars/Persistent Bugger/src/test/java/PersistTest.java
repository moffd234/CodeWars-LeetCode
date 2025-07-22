import org.example.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersistTest {

    @Test
    public void basicTests() {
        assertEquals("Incorrect answer for n=39", 3, Persist.persistence( 39));
        assertEquals("Incorrect answer for n=4", 0, Persist.persistence(  4));
        assertEquals("Incorrect answer for n=25", 2, Persist.persistence( 25));
        assertEquals("Incorrect answer for n=999",4, Persist.persistence(999));
    }
}
