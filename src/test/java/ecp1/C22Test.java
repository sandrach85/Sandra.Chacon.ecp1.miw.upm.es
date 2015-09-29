package ecp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C22Test {

    private C22 nomb;

    @Before
    public void before() {
        nomb = new C22();
    }

    @Test
    public void testMA() {
        assertEquals(nomb.mA(), "mA");
    }

}
