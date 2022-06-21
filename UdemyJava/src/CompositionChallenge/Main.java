package CompositionChallenge;

public class Main {
    public static void main(String[] args) {
        Wall theWall = new Wall("East");
        Bed theBed = new Bed("Sleepwell","1 foot");
        Sofa theSofa = new Sofa("Recliner",4,2);

        Room room = new Room(theSofa,theWall,theBed);
        room.makingBed();
        room.getTheBed().make();
        room.getTheSofa().sit();
    }
}
