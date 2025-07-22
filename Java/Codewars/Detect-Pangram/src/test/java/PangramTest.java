import org.example.PangramChecker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PangramTest {
    PangramChecker pc;

    @Before
    public void setUp(){
        pc = new PangramChecker();
    }

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog";
        assertTrue(pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass";
        assertFalse(pc.check(pangram2));
    }

    @Test
    public void testNumbers() {
        String pangram = "The quick2 brown fox3 jum56ps over the lazy dog";
        assertTrue(pc.check(pangram));
    }

    @Test
    public void testNumbersFalse() {
        String pangram = "The quick2 brown fox jumps over the laz";
        assertFalse(pc.check(pangram));
    }

    @Test
    public void testSpecial() {
        String pangram = "The quic$k b&row^n f*ox ju!mps over the lazy dog";
        assertTrue(pc.check(pangram));
    }

    @Test
    public void testSpecialFalse() {
        String pangram = "The quic$k b&row^n f*ox ju!mps over";
        assertFalse(pc.check(pangram));
    }

    @Test
    public void testSpecialAndNumbers() {
        String pangram = "1The qu!ick brow7n fo&x ju^7mps o*7ver th89e lazy !dog.!";
        assertTrue(pc.check(pangram));
    }

    @Test
    public void testSpecialAndNumbersFalse() {
        String pangram = "1The qu!ick brow7n fo&x ju^7mps o*7ver th89e.!";
        assertFalse(pc.check(pangram));
    }

    @Test
    public void testEmpty() {
        String pangram = "";
        assertFalse(pc.check(pangram));
    }
}
