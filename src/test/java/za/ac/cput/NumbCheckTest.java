package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class NumbCheckTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void equalityTesting()
    {
        NumbCheck add = new NumbCheck();
        assertEquals(10, add.addNumb(5,5));
        assertNotEquals(12, add.addNumb(5,5));
    }

    @Test
    public void identityTesting()
    {
        NumbCheck add = new NumbCheck();
        assertSame(20, add.addNumb(15,5));
        assertNotSame(25, add.addNumb(15,5));
    }

    @Test
    public void failTesting()
    {
        NumbCheck add = new NumbCheck();
        assertEquals(8, add.addNumb(4,4));
        fail("Test will fail deliberately");
    }

    @Test
    @Timeout(2)
    public void timeoutTesting() throws InterruptedException
    {
        NumbCheck add = new NumbCheck();
        assertSame(5, add.addNumb(2,3));

        Thread.sleep(3000);
        System.out.println("Method not complete in time");
    }

    @Test
    @Timeout(4)
    public void timeoutPassTesting() throws InterruptedException
    {
        NumbCheck add = new NumbCheck();
        assertSame(40, add.addNumb(20,20));

        Thread.sleep(3000);
    }

    @Test
    @Disabled("Method is disabled")
    public void DisabilityTesting()
    {
        NumbCheck add = new NumbCheck();
        assertSame(30, add.addNumb(20,10));
    }

}