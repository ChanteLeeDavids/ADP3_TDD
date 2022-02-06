package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product identity1;
    private Product identity2;
    private Product imports1;
    private Product imports2;

    @BeforeEach
    void setUp() {
        identity1 = new Product();
        identity2 = new Product();
        imports1 = imports2;
    }

    @Test
    void testIdentity(){
        assertNotSame(identity1, identity2);

    }

    @Test
    void testEquality(){
        assertNotEquals(identity1,identity2);

    }

    @Test
    void testFail(){
    assertSame(identity1, identity2);
    }

    @Timeout(5)
    @Test
    void testTimeouts() throws InterruptedException{
        assertEquals(identity1,identity1);
        Thread.sleep(4000);
    }

    @Disabled
    @Test
    void testDisabled(){
        assertEquals(identity1,identity1);
    }
}
