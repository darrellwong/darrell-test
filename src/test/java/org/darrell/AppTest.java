package org.darrell;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AppTest {

    private Rectangle getRect(int x1, int y1, int x2, int y2) {
        return new Rectangle(new Point(x1, y1), new Point(x2, y2));
    }

    @Test
    public void testIsOverlap01()
    {
        Rectangle reference = new Rectangle(new Point(0, 5), new Point(5, 0));

        // Assert True
        assertTrue(reference.isOverlap(getRect(1, 2, 2, 1)));
        assertTrue(reference.isOverlap(getRect(-6, 10, 10, -5)));
        assertTrue(reference.isOverlap(getRect(-1, 7, 4, 3)));
        assertTrue(reference.isOverlap(getRect(2, 1, 10, -10)));

        // Assert False
        assertFalse(reference.isOverlap(getRect(-10, 10, 0, 5)));
        assertFalse(reference.isOverlap(getRect(5, 0, 20, -10)));
        assertFalse(reference.isOverlap(getRect(6, 0, 20, -10)));
        assertFalse(reference.isOverlap(getRect(6, 4, 10, 2)));
        assertFalse(reference.isOverlap(getRect(5, 5, 10, 0)));
    }

    @Test
    public void testIsOverlap02() {
        Rectangle reference = new Rectangle(new Point(0,10), new Point(10,0));

        // Assert True
        assertTrue(reference.isOverlap(getRect(-20, 20, 5, 5)));
        assertTrue(reference.isOverlap(getRect(-20, 5, 5, -5)));
        assertTrue(reference.isOverlap(getRect(5, 20, 15, 5)));
        assertTrue(reference.isOverlap(getRect(-20, 20, 20, 5)));
        assertTrue(reference.isOverlap(getRect(-20, 5, 20 ,-5)));
        assertTrue(reference.isOverlap(getRect(-20, 20, 5, -5)));
        assertTrue(reference.isOverlap(getRect(5, 20, 20, -5)));
        assertTrue(reference.isOverlap(getRect(5, 5, 15, -5)));
        assertTrue(reference.isOverlap(getRect(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE)));

        // Asert False
        assertFalse(reference.isOverlap(getRect(-20, 20, 0, 10)));
        assertFalse(reference.isOverlap(getRect(-20, 5, 0, 5)));
    }

}
