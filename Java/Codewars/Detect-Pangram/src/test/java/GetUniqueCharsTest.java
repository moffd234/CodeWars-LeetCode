import org.example.PangramChecker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GetUniqueCharsTest {
    PangramChecker pc;

    @Before
    public void setUp() {
        pc = new PangramChecker();
    }

    @Test
    public void getUniqueCharsEmpty() {
        String str = "";
        Set<Character> expected = new HashSet<>();
        Set<Character> actual = pc.getUniqueChars(str);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUniqueCharsNumbers() {
        String str = "ab2c4d2e4";
        Set<Character> expected = new HashSet<>();

        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('d');
        expected.add('e');

        Set<Character> actual = pc.getUniqueChars(str);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUniqueCharsDuplicates() {
        String str = "aabbccddeeabcedcabde";
        Set<Character> expected = new HashSet<>();

        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('d');
        expected.add('e');

        Set<Character> actual = pc.getUniqueChars(str);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUniqueCharsSpecials() {
        String str = "a!b#c@d%e^";
        Set<Character> expected = new HashSet<>();

        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('d');
        expected.add('e');

        Set<Character> actual = pc.getUniqueChars(str);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUniqueCharsMixedCase() {
        String str = "AbCdE";
        Set<Character> expected = new HashSet<>();

        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('d');
        expected.add('e');

        Set<Character> actual = pc.getUniqueChars(str);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUniqueCharsDuplicatesMixedCase() {
        String str = "aAabBbcCcdDdeEeBaCbAcEeDdcabde";
        Set<Character> expected = new HashSet<>();

        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('d');
        expected.add('e');

        Set<Character> actual = pc.getUniqueChars(str);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUniqueCharsMixedCaseNumbers() {
        String str = "A4b3C1d16E";
        Set<Character> expected = new HashSet<>();

        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('d');
        expected.add('e');

        Set<Character> actual = pc.getUniqueChars(str);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUniqueCharsMixedCaseSpecial() {
        String str = "A!b#Cd$$^%$E";
        Set<Character> expected = new HashSet<>();

        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('d');
        expected.add('e');

        Set<Character> actual = pc.getUniqueChars(str);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUniqueCharsMixedCaseSpecialsNumbers() {
        String str = "()*@#_!#A23443264b1C#dE@)()&@71";
        Set<Character> expected = new HashSet<>();

        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('d');
        expected.add('e');

        Set<Character> actual = pc.getUniqueChars(str);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUniqueCharsSpecialNumbers() {
        String str = "a412b21c421d5!e";
        Set<Character> expected = new HashSet<>();

        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('d');
        expected.add('e');

        Set<Character> actual = pc.getUniqueChars(str);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUniqueCharsMixedCaseSpecialsNumbersDuplicates() {
        String str = "()*@#_!#A23443264Eb1cC#dE@D)(E)A&@B71c";
        Set<Character> expected = new HashSet<>();

        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('d');
        expected.add('e');

        Set<Character> actual = pc.getUniqueChars(str);

        Assert.assertEquals(expected, actual);
    }
}
