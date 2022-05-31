package Challenge_inheritance;

public class Cylinder extends Circle{
    private double height;
    private Circle circle1;

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0){
            height = 0;
        }else
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea()*height;
    }
}
