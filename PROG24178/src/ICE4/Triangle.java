package ICE4;

public class Triangle extends GeometricObject {
    private double s1;
    private double s2;
    private double s3;

    public Triangle() {

    }

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double getArea() {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    @Override
    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    @Override
    public String toString() {

        return String.format("%s%n%s%.2f%s%.2f%s%.2f%s%.2f%s%.2f", super.toString(), "\nTriangle: side1 = ", s1, " side2 = ", s2, "side3 = ", s3, "\nThe area is: ", getArea(), "\nThe perimeter is: ", getPerimeter());
    }
}
