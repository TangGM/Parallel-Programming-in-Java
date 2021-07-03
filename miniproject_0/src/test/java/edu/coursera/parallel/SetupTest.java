package edu.coursera.parallel;

import java.util.Random;

import junit.framework.TestCase;

public class SetupTest extends TestCase {

    /*
     * A simple test case.
     */
    public void testSetup() {
        final int result = Setup.setup(42);
        assertEquals(42, result);
    }

    public void testSetup2() {
        final int result = Setup.setup(7);
        assertEquals(7, result);
        assertEquals(2, 1 + 1);
    }
}
