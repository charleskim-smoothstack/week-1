package com.charleskim.dayfour.line;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LineTest {
    // Covers x0 = x1.
    @Test
    public void testLineEqualXCoordinates() {
        Line line = new Line(0, 0, 0, 1);
        assertEquals(1, line.getDistance(), 0.0001);
        assertThrows(ArithmeticException.class, () -> {
            line.getSlope();
        });
    }

    // Covers y1 = y0.
    @Test
    public void testLineEqualYCoordinates() {
        Line line = new Line(0, 0, 1, 0);
        assertEquals(0, line.getSlope(), 0.0001);
        assertEquals(1, line.getDistance(), 0.0001);
    }

    // Covers y1 > y0 and x1 > x0.
    @Test
    public void testLineY1BiggerX1Bigger() {
        Line line = new Line(0, 0, 1, 1);
        assertEquals(1, line.getSlope(), 0.0001);
        assertEquals(Math.sqrt(2), line.getDistance(), 0.0001);
    }

    // Covers y1 < y0 and x1 < x0.
    @Test
    public void testLineY1SmallerX1Smaller() {
        Line line = new Line(0, 0, -1, -1);
        double slope = 1;
        assertEquals(slope, line.getSlope(), 0.0001);
        assertEquals(Math.sqrt(2), line.getDistance(), 0.0001);
    }

    // Covers y1 < y0 and x1 > x0.
    @Test
    public void testLineY1SmallerX1Bigger() {
        Line line = new Line(0, 0, 1, -1);
        assertEquals(-1, line.getSlope(), 0.0001);
        assertEquals(Math.sqrt(2), line.getDistance(), 0.0001);
    }

    // Covers y1 > y0 and x1 < x0.
    @Test
    public void testLineY1BiggerX1Smaller() {
        Line line = new Line(0, 0, -1, 1);
        assertEquals(-1, line.getSlope(), 0.001);
        assertEquals(Math.sqrt(2), line.getDistance(), 0.0001);
    }

    // Covers line1.getSlope() = line2.getSlope().
    @Test
    public void testParallelToLinesWithSameSlope() {
        Line line1 = new Line(0, 0, 1, 1);
        Line line2 = new Line(0, 0, 1, 1);
        assertTrue(line1.parallelTo(line2));
    }

    // Covers line1.getSlope() != line2.getSlope().
    @Test
    public void testParallelToLinesWithDifferentSlopes() {
        Line line1 = new Line(0, 0, 1, 0);
        Line line2 = new Line(0, 0, 1, 1);
        assertFalse(line1.parallelTo(line2));
    }
}
