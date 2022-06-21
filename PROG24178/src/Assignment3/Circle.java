package Assignment3;

public class Circle extends GeometricObject implements Colorable {
    private double radius;
    private String str;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        str = toString();
        System.out.println(str);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    @Override
    public void howToColor() {

    }

    @Override
    public String toString() {
        return String.format("%s%.2f%s%.2f","Area of Circle with radius: ",getRadius()," is ",getArea());
    }
}