package start.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {
    @Test
    public void exampleTests() {
        assertEquals("", Solution3.lcs("a", "b"));
        assertEquals("abc", Solution3.lcs("abcdef", "abc"));
        assertEquals("12356", Solution3.lcs("132535365", "123456789"));

    }
}