package ecp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C11Test {

    private C11 nomb;

    @Before
    public void before() {
        nomb = new C11();
    }

    @Test
    public void testM1() {
        assertEquals(nomb.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(nomb.m2(), "m2");
    }

}
