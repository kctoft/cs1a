/**
 Define an ArrayList of Point objects.
 Create three new Point objects with the following (x, y) values:
 (0,6), (4,10), (7,1).
 Add these three new Point objects to the ArrayList.
 After all three Point objects are in the ArrayList,
 print the ArrayList to show that the Points are in the list.
 */
import java.util.ArrayList;
import java.awt.Point;

public class FinalWork {
    public static void main(String[] args) {
        ArrayList<Point> pointList = new ArrayList<Point>();
        pointList.add(new java.awt.Point(0,6));
        pointList.add(new java.awt.Point(4,10));
        pointList.add(new java.awt.Point(7,1));

        pointList.stream().forEach((p)-> System.out.print("(" + p.x +"," + p.y + ")"));
    }
}

