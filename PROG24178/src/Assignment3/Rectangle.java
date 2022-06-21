package Assignment3;

public class Rectangle extends GeometricObject implements Colorable {
    private double width;
    private double height;
    private String str;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        str = toString();
        System.out.println(str);
    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return height;
    }

    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override /** Return area */
    public double getArea() {
        return width * height;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void howToColor() {

    }

    @Override
    public String toString() {
        return String.format("%s%.2f%s%.2f%s%.2f","Area of rectangle with width of: ",getWidth()," and height of ",getHeight()," is ",getArea());
    }
}

