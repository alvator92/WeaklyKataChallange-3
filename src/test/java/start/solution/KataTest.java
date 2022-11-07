package start.solution;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Random;

import static java.math.BigInteger.ONE;
import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    private static void doTest(String str, String expected) {
        assertEquals(expected, Kata.incrementString(str), "input: <"+str+">");
    }

    @Test
    public void staticTests() {
        doTest("foobar000", "foobar001");
        doTest("foobar999", "foobar1000");
        doTest("foobar00999", "foobar01000");
        doTest("foo", "foo1");
        doTest("foobar001", "foobar002");
        doTest("foobar1", "foobar2");
        doTest("1", "2");
        doTest("009", "010");
        doTest("999", "1000");
        doTest("fo99obar99", "fo99obar100");
    }

    private static final Random rand = new Random();
    private String randomString() {
        var sb = new StringBuilder();
        var len = rand.nextInt(40);
        rand.ints(len, '!', '~'+1)
                .forEach(sb::appendCodePoint);
        if (len > 0 || rand.nextBoolean()) {
            rand.ints('!', '~'+1)
                    .filter(c -> c < '0' || c > '9')
                    .limit(1)
                    .forEach(sb::appendCodePoint);
        }
        return sb.toString();
    }

    @Test
    public void randomTests() {
        for (int trial = 1; trial <= 1000; trial++) {
            String str = randomString(), exp = str;
            if (rand.nextDouble() <= 0.9) {
                int bits = rand.nextInt(120);
                var n = new BigInteger(bits, rand);
                var len = rand.nextInt(40)+1;
                var fmt = "%0"+len+"d";
                str += String.format(fmt, n);
                exp += String.format(fmt, n.add(ONE));
            } else {
                exp += "1";
            }
            doTest(str, exp);
        }
    }
}