package start.solution;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SecureTesterTest {
    @Test
    @DisplayName("Valid input")
    void testValidInput() {
        assertTrue(SecureTester.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }

    @DisplayName("Invalid character")
    @ParameterizedTest(name="Should return false for \"{0}\"")
    @ValueSource(strings = {"", "with space", "with_underscore", "punctuation.", "naïve", "１strangedigit", "emoji😊"})
    void testInvalidChars(String input) {
        assertFalse(SecureTester.alphanumeric(input));
    }

    @Test
    void myOwnTest() {
        assertFalse(SecureTester.alphanumeric("with space"));
        assertFalse(SecureTester.alphanumeric(""));
        assertFalse(SecureTester.alphanumeric("with_underscore"));
        assertFalse(SecureTester.alphanumeric("punctuation."));
        assertFalse(SecureTester.alphanumeric("naïve"));
        assertFalse(SecureTester.alphanumeric("１strangedigit"));
        assertFalse(SecureTester.alphanumeric("emoji😊"));
    }


}