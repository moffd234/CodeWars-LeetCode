import org.example.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player subject;

    @Before
    public void setUp(){
        subject = new Player();
    }

    @Test
    public void testMoveBasic(){
        int expected = 5;

        int actual = subject.move(5);

        assertEquals(expected, actual);
    }

    @Test
    public void testMoveBounce(){
        int expected = 95;

        subject.setPos(95);
        int actual = subject.move(10);

        assertEquals(expected, actual);
    }

    @Test
    public void testMoveLandOn100(){
        int expected = 100;

        subject.setPos(99);
        int actual = subject.move(1);

        assertEquals(expected, actual);
    }
}
