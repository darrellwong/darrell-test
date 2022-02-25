package org.darrell;
/**
 * Determines if two rectangles overlap
 *
 * @param r Rectangle
 * @return True if this rectangle overlaps rectangle r with positive area
 */
public class Rectangle {
    private Point p1;
    private Point p2;
    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public boolean isOverlap(Rectangle r) {
        // FIXME: Implement this
        boolean exitCheck = true;
        int p1x = p1.getX(), p1y = p1.getY(), p2x = p2.getX(), p2y = p2.getY();
        int r1x = r.p1.getX(), r1y = r.p1.getY(), r2x = r.p2.getX(), r2y = r.p2.getY();

        // Exception checking
        if((p1x == p2x && p1y == p2y && p1x == p2y)  ||  (r1x == r2x && r1y == r2y && r1x == r2y)) {
            System.out.println("One of the input values is a point and not a rectangle. \nExiting the test.");
            exitCheck = false;
        }
        else if((p1x == p2x || p1y == p2y)  ||  (r1x == r2x || r1y == r2y)) {
            System.out.println("One of the input values is a line and not a rectangle. \nExiting the test.");
            exitCheck = false;
        }
        // overlap checks
        // check if they have the same starting point at the top left
        else if(p1x == r1x) {
            exitCheck = true;
        }
        // check if any of the points on the rectangle are in the area of the other rectangle
        else if((p1x < r1x && r1x < p2x) || (p1x < r2x && r2x < p2x)) {
            if((p1y < r1y && r1y < p2y) || (p1y < r2y && r2y < p2y) || (p2y < r1y && r1y < p1y) || (p2y < r2y && r2y < p1y)
                    || (r1y < p1y && p1y < r2y) || (r1y < p2y && p2y < r2y) || (r2y < p1y && p1y < r1y) || (r2y < p2y && p2y < r1y)) {
                exitCheck = true;
            }
            else {
                exitCheck = false;
            }
        }
        else if((r1x < p1x && p1x < r2x) || (r1x < p2x && p2x < r2x)) {
            if((r1y < p1y && p1y < r2y) || (r1y < p2y && p2y < r2y) || (r2y < p1y && p1y < r1y) || (r2y < p2y && p2y < r1y)
                    || (p1y < r1y && r1y < p2y) || (p1y < r2y && r2y < p2y) || (p2y < r1y && r1y < p1y) || (p2y < r2y && r2y < p1y)) {
                exitCheck = true;
            }
            else {
                exitCheck = false;
            }
        }
        else {
            exitCheck = false;
        }
        return exitCheck;
    }
}
