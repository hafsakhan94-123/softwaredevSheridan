package Assignment3;

public class Square extends GeometricObject implements Colorable {


    //public double side;
    private double side;
    private String str;

    public Square() {
        this.side = 0;

    }

    public Square(double side) {

        this.side = side;
        str = toString();
        System.out.println(str);
        howToColor();

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;

    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return (side + side + side + side);
    }

    @Override
    public String toString() {
        return String.format("%s%.2f%s%.2f", "Area of Square with side: ", getSide(), " is: ", getArea());
    }
}
