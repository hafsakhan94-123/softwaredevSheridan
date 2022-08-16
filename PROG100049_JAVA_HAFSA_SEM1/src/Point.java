public class Point {

    private double x;
    private double y;

    public Point() {
        x = -1;
        y = -1;
    }

    public Point(double xArg, double yArg) {
        x = xArg;
        y = yArg;
    }

    public void setX(double xArg) {
        x = xArg;
    }

    public void setY(double yArg) {
        y = yArg;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void printPoint() {
        System.out.printf("Point: (%.2f, %.2f)\n", x, y);
    }

    //Distance method
    public double calcDistance(double x2, double y2) {
        // Compute the sides of a right triangle
        double side1 = x2 - x;
        double side2 = y2 - y;

        // Compute the distance
        double distance = Math.sqrt(side1 * side1 + side2 * side2);

        return distance;
    }

    //Another version of the distance method
    public double calcDistance(Point p2) {
        // Compute the sides of a right triangle
        double side1 = p2.getX() - x;
        double side2 = p2.getY() - y;

        // Compute the distance
        double distance = Math.sqrt(side1 * side1 + side2 * side2);

        return distance;
    }

    //A static version of the distance method
    public static double calcDistance(Point p1, Point p2) {
        // Compute the sides of a right triangle
        double side1 = p2.getX() - p1.getX();
        double side2 = p2.getY() - p1.getY();

        // Compute the distance
        double distance = Math.sqrt(side1 * side1 + side2 * side2);

        return distance;
    }

    public boolean equals(Point p) {
        if ((p.getX() == x) && (p.getY() == y))
            return true;
        return false;
    }

    public String toString() {
        String newString = "";
        newString += "x: " + getX() + "\ny: " + getY();
        return newString;
    }

}