package org.darrell;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void testIsOverap()
    {
        Rectangle reference = new Rectangle(new Point(0,5), new Point(5,0));

        // Assert True
        assertTrue(reference.isOverlap(new Rectangle(new Point(1,2), new Point(2,1))));
        assertTrue(reference.isOverlap(new Rectangle(new Point(-6,10), new Point(10,-5))));
        assertTrue(reference.isOverlap(new Rectangle(new Point(-1,7), new Point(4,3))));
        assertTrue(reference.isOverlap(new Rectangle(new Point(2,1), new Point(10,-10))));

        // Assert False
        assertFalse(reference.isOverlap(new Rectangle(new Point(-10,10), new Point(0,5))));
        assertFalse(reference.isOverlap(new Rectangle(new Point(5,0), new Point(20,-10))));
        assertFalse(reference.isOverlap(new Rectangle(new Point(6,0), new Point(20,-10))));
        assertFalse(reference.isOverlap(new Rectangle(new Point(6,4), new Point(10,2))));
        assertFalse(reference.isOverlap(new Rectangle(new Point(5,5), new Point(10,0))));
        assertFalse(reference.isOverlap(new Rectangle(new Point(15,15), new Point(20,30))));
    }
}
