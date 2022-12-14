package start.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountIPAddressesTest {

    @Test
    public void fixedTests() throws Exception {
        assertEquals( 50, CountIPAddresses.ipsBetween( "10.0.0.0", "10.0.0.50" ) );
        assertEquals( 246, CountIPAddresses.ipsBetween( "20.0.0.10", "20.0.1.0" ) );
        assertEquals( (1l << 32l) - 1l, CountIPAddresses.ipsBetween( "0.0.0.0", "255.255.255.255" ) );
        assertEquals( 1, CountIPAddresses.ipsBetween( "150.0.0.0", "150.0.0.1" ) );
        assertEquals( 50, CountIPAddresses.ipsBetween( "10.0.0.0", "10.0.0.50" ) );
        assertEquals( 246, CountIPAddresses.ipsBetween( "20.0.0.10", "20.0.1.0" ) );
        assertEquals( 243, CountIPAddresses.ipsBetween( "10.11.12.13", "10.11.13.0" ) );
        assertEquals( 256, CountIPAddresses.ipsBetween( "160.0.0.0", "160.0.1.0" ) );
        assertEquals( 65536, CountIPAddresses.ipsBetween( "170.0.0.0", "170.1.0.0" ) );
        assertEquals( 65793, CountIPAddresses.ipsBetween( "50.0.0.0", "50.1.1.1" ) );
        assertEquals( 16777216, CountIPAddresses.ipsBetween( "180.0.0.0", "181.0.0.0" ) );
        assertEquals( 67372036, CountIPAddresses.ipsBetween( "1.2.3.4", "5.6.7.8" ) );
    }
}