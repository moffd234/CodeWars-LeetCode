import org.example.SnakesLadders;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SnakeLaddersTest {

    SnakesLadders subject;

    @Before
    public void setUp(){
        subject = new SnakesLadders();
    }

    @Test
    public void testMovePlayerBasic(){
        int expected = 5;

        subject.movePlayer(subject.getPlayer1(), 5);
        int actual = subject.getPlayer1().getPos();

        assertEquals(expected, actual);
    }

    @Test
    public void testMovePlayer2(){
        int expected = 5;

        subject.movePlayer(subject.getPlayer2(), 5);
        int actual = subject.getPlayer2().getPos();

        assertEquals(expected, actual);
    }

    @Test
    public void testMovePlayerSnake(){
        int expected = 6;

        subject.movePlayer(subject.getPlayer1(), 16); // Move to snake on 16 that moves to 6
        int actual = subject.getPlayer1().getPos();

        assertEquals(expected, actual);
    }

    @Test
    public void testMovePlayerLadder(){
        int expected = 31;

        subject.movePlayer(subject.getPlayer1(), 8); // Move to snake on 8 that moves to 31
        int actual = subject.getPlayer1().getPos();

        assertEquals(expected, actual);
    }
}
