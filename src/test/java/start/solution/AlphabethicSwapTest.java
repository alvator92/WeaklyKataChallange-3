package start.solution;

import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

class AlphabethicSwapTest {

    @Test
    public void sampleTests() {
        assertEquals("For input: Zero", null, AlphaSwap.reverseAlphabetInString(""));
        assertEquals("For input: Maks", "aMsk", AlphaSwap.reverseAlphabetInString("Maks"));
        assertEquals("For input: Maks!", "aMsk!", AlphaSwap.reverseAlphabetInString("Maks!"));
        assertEquals("For input: Мальчик!", "аМьлич!к", AlphaSwap.reverseAlphabetInString("Мальчик!"));

    }
}