package start.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongToIPTest {
    @Test
    public void sampleTest() {
        assertEquals("128.32.10.1", LongToIP.longToIP(2149583361L));
        assertEquals("128.114.17.104", LongToIP.longToIP(2154959208L));
        assertEquals("0.0.0.0", LongToIP.longToIP(0));
        assertEquals("128.32.10.1", LongToIP.longToIP(2149583361L));
    }
}