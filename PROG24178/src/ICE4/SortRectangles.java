package ICE4;

import ICE4.TestGeometricObject;

public class SortRectangles {
    public static void main(String[] args) {
        TestGeometricObject.ComparableRectangle[] rectangles = {
                new TestGeometricObject.ComparableRectangle(3.4, 5.4),
                new TestGeometricObject.ComparableRectangle(13.24, 55.4),
                new TestGeometricObject.ComparableRectangle(7.4, 35.4),
                new TestGeometricObject.ComparableRectangle(1.4, 25.4)};
        java.util.Arrays.sort(rectangles);
        for (Rectangle rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}
