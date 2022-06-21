package CompositionChallenge;

public class Room {
    private Sofa theSofa;
    private Wall theWall;
    private Bed theBed;

    public Room(Sofa theSofa, Wall theWall, Bed theBed) {
        this.theSofa = theSofa;
        this.theWall = theWall;
        this.theBed = theBed;
    }

    public void makingBed(){
        System.out.println("Going to sleep --> making bed");
        theBed.make();
    }
    public Sofa getTheSofa() {
        return this.theSofa;
    }

    public Wall getTheWall() {
        return theWall;
    }

    public Bed getTheBed() {
        return theBed;
    }
}
