package ecp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C52Test {

    private C52 nomb;

    @Before
    public void before() {
        nomb = new C52();
    }

    @Test
    public void testMA() {
        assertEquals(nomb.mA(), "mA");
    }

}
