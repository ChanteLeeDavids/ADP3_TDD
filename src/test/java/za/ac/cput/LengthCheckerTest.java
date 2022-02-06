/*
    LengthCheckerTest.java
    Tests whether LengthChecker.java checks the length of a string
    Chante Lee Davids [220246688]
    5/02/2022
 */

package za.ac.cput;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LengthCheckerTest {

    @BeforeAll
    static void beforeAll() {
        
    }

    @Test
    public void testEquality() {
        // This method tests object equality
        LengthChecker check = new LengthChecker();
        assertEquals(6, check.countLength("Person"));
        assertNotEquals(8, check.countLength("Person"));

    }

    @Test
    public void testIdentity() {
        // This method tests object identity
        LengthChecker check = new LengthChecker();
        assertNotSame(14, check.countLength("Snickers"));
        assertSame(8, check.countLength("Snickers"));
    }

    @Test
    public void testFail() {
        // This test makes the method fail deliberately
        LengthChecker check = new LengthChecker();
        assertEquals(10, check.countLength("Compliment"));
        fail("This test will deliberately fail");
    }

    @Test
    @Timeout(2)
    public void testTimeout() throws InterruptedException {
        // Time exceeds timeout value so the test fails
        LengthChecker check = new LengthChecker();
        assertSame(13, check.countLength("Perfectionist"));

        Thread.sleep(3000); // 3000 miliseconds = 3 seconds
        System.out.println("Method taking too long to complete");
    }

    @Test
    @Timeout(4)
    public void testTimeoutPass() throws InterruptedException {
        // Time does not exceed timeout value so the test passes
        LengthChecker check = new LengthChecker();
        assertSame(8, check.countLength("Insecure"));

        Thread.sleep(3000);
    }

    @Test
    @Disabled("this is disabled for now")
    public void testDisability() {
        // Disables the test
        LengthChecker check = new LengthChecker();
        assertEquals(10, check.countLength("Psuedocode"));
    }
}