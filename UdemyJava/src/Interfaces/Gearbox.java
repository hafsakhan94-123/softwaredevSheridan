package Interfaces;

public class Gearbox {
    private boolean clutchIsIn;

    public void operationClutch(boolean inOrOut){
        this.clutchIsIn = inOrOut;
    }
}
