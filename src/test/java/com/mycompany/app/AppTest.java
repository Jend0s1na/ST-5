package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest
{
    @Test
    void testAverage1()
    {
        Sqrt s = new Sqrt(4);
        assertEquals(3.0, s.average(2, 4), 0.0001);
    }

    @Test
    void testAverage2()
    {
        Sqrt s = new Sqrt(9);
        assertEquals(5.0, s.average(4, 6), 0.0001);
    }

    @Test
    void testGoodTrue()
    {
        Sqrt s = new Sqrt(4);
        assertTrue(s.good(2.0, 4.0));
    }

    @Test
    void testGoodFalse()
    {
        Sqrt s = new Sqrt(4);
        assertFalse(s.good(1.0, 4.0));
    }

    @Test
    void testImprove1()
    {
        Sqrt s = new Sqrt(4);
        assertEquals(2.5, s.improve(1.0, 4.0), 0.0001);
    }

    @Test
    void testImprove2()
    {
        Sqrt s = new Sqrt(9);
        assertEquals(5.0, s.improve(1.0, 9.0), 0.0001);
    }

    @Test
    void testIter4()
    {
        Sqrt s = new Sqrt(4);
        assertEquals(2.0, s.iter(1.0, 4.0), 0.0001);
    }

    @Test
    void testIter9()
    {
        Sqrt s = new Sqrt(9);
        assertEquals(3.0, s.iter(1.0, 9.0), 0.0001);
    }

    @Test
    void testCalc2()
    {
        Sqrt s = new Sqrt(2);
        assertEquals(Math.sqrt(2), s.calc(), 0.0001);
    }

    @Test
    void testCalc4()
    {
        Sqrt s = new Sqrt(4);
        assertEquals(2.0, s.calc(), 0.0001);
    }

    @Test
    void testCalc16()
    {
        Sqrt s = new Sqrt(16);
        assertEquals(4.0, s.calc(), 0.0001);
    }

    @Test
    void testCalc25()
    {
        Sqrt s = new Sqrt(25);
        assertEquals(5.0, s.calc(), 0.0001);
    }
}
