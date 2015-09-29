package ecp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {

    private C12 nomb;

    @Before
    public void before() {
        nomb = new C12();
    }

    @Test
    public void testMA() {
        assertEquals(nomb.mA(), "mA");
        ;
    }

}
