import org.w3c.dom.ls.LSOutput;

public class TestRectangle {

    public static void main(String[] args) {
        try {
            Rectangle Rectangle1 = new Rectangle(4, 40);
            System.out.println("Width & height of Rectangle1: " + Rectangle1.getWidth() + " " + Rectangle1.getHeight());
            System.out.println("Area and parameter of Rectangle1: " + Rectangle1.getArea() + " " + Rectangle1.getParameter());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        try {
            Rectangle Rectangle2 = new Rectangle(3.5, 35.9);
            System.out.println("Width & height of Rectangle2: " + Rectangle2.getWidth() + " " + Rectangle2.getHeight());
            System.out.println("Area and parameter of Rectangle2: " + Rectangle2.getArea() + " " + Rectangle2.getParameter());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        try {
            Rectangle Rectangle3 = new Rectangle(-2, 20);
            System.out.println("Width & height of Rectangle3: " + Rectangle3.getWidth() + " " + Rectangle3.getHeight());
            System.out.println("Area and parameter of Rectangle3: " + Rectangle3.getArea() + " " + Rectangle3.getParameter());
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
        System.out.println("Number of Objects created: " + Rectangle.getNumberOfObjects());
    }
}
