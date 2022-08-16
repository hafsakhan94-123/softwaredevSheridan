package CompositionChallenge;

public class Bed {
    private String color;
    private String height;

    public String getColor() {
        return color;
    }

    public void make() {
        System.out.println("Making the bed now!!!");
    }

    public String getHeight() {
        return height;
    }

    public Bed(String color, String height) {
        this.color = color;
        this.height = height;
    }
}
