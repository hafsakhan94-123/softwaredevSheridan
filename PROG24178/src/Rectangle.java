public class Rectangle {
    private double width;
    private double height;
    private static int numberOfObjects = 0;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double Height, double Width) {
        if (Height > 0)
            this.height = Height;
        else
            height = 1;
        if (Width > 0)
            this.width = Width;
        else
            Width = 1;
        numberOfObjects++;

    }

    public void setHeight(double newHeight) throws IllegalArgumentException {
        if (newHeight > 0)
            this.height = newHeight;
        else
            throw new IllegalArgumentException("Height is assigned: " + newHeight + " Radius cannot be negative or zero");
    }

    public void setWidth(double newWidth) throws IllegalArgumentException {
        if (newWidth > 0)
            this.width = newWidth;
        else
            throw new IllegalArgumentException("Width is assigned: " + newWidth + " Width cannot be negative or zero");
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {

        return width * height;
    }

    public double getParameter() {
        return 2 * (width + height);
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }


}
