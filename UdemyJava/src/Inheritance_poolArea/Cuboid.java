package Inheritance_poolArea;

public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double width, double length) {
        super(width, length);
    }

    public Cuboid(double width, double length, double height) {
        super(width, length);

        if (height < 0){
            height = 0;
        }else
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

}
