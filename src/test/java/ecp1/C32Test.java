package ecp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C32Test {

    private C32 nomb;

    @Before
    public void before() {
        nomb = new C32();
    }

    @Test
    public void testMA() {
        assertEquals(nomb.mA(), "mA");
    }

}
