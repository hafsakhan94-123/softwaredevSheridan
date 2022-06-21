package ICE4;

public class TestGeometricObject {
    /** Main method */
    public static void main(String[] args) {
        // Declare and initialize two geometric objects
        GeometricObject geoObject1 = new ICE4.Circle(5); // we are only creating a type of GeometricObject, not instance
        GeometricObject geoObject2 = new ICE4.Rectangle(5, 3);

        System.out.println("The two objects have the same area and perimeter? " +
                equalAreaAndPerimeter(geoObject1, geoObject2));
        System.out.println("The two objects have the same area ? " + equalAreaAndPerimeter(geoObject1,new ICE4.Circle(5)));
        System.out.println();


        // Display circle
        displayGeometricObject(geoObject1);
        displayGeometricObject(new ICE4.Circle(5)); // same as displayGeometricObject(geoObject1);

        // Display rectangle
        displayGeometricObject(geoObject2);
    }

    /** A method for comparing the areas of two geometric objects */
    public static boolean equalAreaAndPerimeter(GeometricObject object1,
                                                GeometricObject object2) {

        return (object1.getArea() == object2.getArea() && object1.getPerimeter() == object2.getPerimeter());
    }


    /** A method for displaying a geometric object */
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }

    public static class ComparableRectangle extends Rectangle
            implements Comparable<ComparableRectangle> {
        /** Construct a ICE4.TestGeometricObject.ComparableRectangle with specified properties */
        public ComparableRectangle(double width, double height) {
            super(width, height);
        }

        @Override // Implement the compareTo method defined in Comparable
        public int compareTo(ComparableRectangle o) {
            if (getArea() > o.getArea())
                return 1;
            else if (getArea() < o.getArea())
                return -1;
            else
                return 0;
        }

        @Override // Implement the toString method in GeometricObject
        public String toString() {
            return "Width: " + getWidth() + " Height: " + getHeight() +
                    " Area: " + getArea();
        }
    }
}


