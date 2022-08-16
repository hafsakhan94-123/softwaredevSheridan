/**
 * This short program tests the Robots package installation.
 * It should compile and run, producing a graphical Robots
 * world on your screen.
 */

import java.awt.Color;

import becker.robots.icons.Icon;
import becker.robots.*;

public class SpellingRobot extends Robot {
    public static void main(String[] arg) {
        // Problem setup
        City brampton = new City();
        SpellingRobot speller = new SpellingRobot(brampton, 7, 3, Direction.EAST);

        speller.spell(brampton, "HELLO");

    }

    public SpellingRobot(City cty, int st, int av, Direction dir) {
        super(cty, st, av, dir);
    }

    public void spell(City cty, String message) {
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            switch (c) {
                case 'A':
                    this.drawA(cty);
                    break;
                case 'B':
                    this.drawB(cty);
                    break;
                case 'C':
                    this.drawC(cty);
                    break;
                case 'D':
                    this.drawD(cty);
                    break;
                case 'E':
                    this.drawE(cty);
                    break;
                case 'F':
                    this.drawF(cty);
                    break;
                case 'G':
                    this.drawG(cty);
                    break;
                case 'H':
                    this.drawH(cty);
                    break;
                case 'I':
                    this.drawI(cty);
                    break;
                case 'J':
                    this.drawJ(cty);
                    break;
                case 'K':
                    this.drawK(cty);
                    break;
                case 'L':
                    this.drawL(cty);
                    break;
                case 'M':
                    this.drawM(cty);
                    break;
                case 'N':
                    this.drawN(cty);
                    break;
                case 'O':
                    this.drawO(cty);
                    break;
                case 'P':
                    this.drawP(cty);
                    break;
                case 'Q':
                    this.drawQ(cty);
                    break;
                case 'R':
                    this.drawR(cty);
                    break;
                case 'S':
                    this.drawS(cty);
                    break;
                case 'T':
                    this.drawT(cty);
                    break;
                case 'U':
                    this.drawU(cty);
                    break;
                case 'V':
                    this.drawV(cty);
                    break;
                case 'W':
                    this.drawW(cty);
                    break;
                case 'X':
                    this.drawX(cty);
                    break;
                case 'Y':
                    this.drawY(cty);
                    break;
                case 'Z':
                    this.drawZ(cty);
                    break;
                default:
                    System.out.println("Unrecognized character.");
            }
        }
    }

    public void drawA(City cty) {/* TODO */}

    public void drawB(City cty) {/* TODO */}

    public void drawC(City cty) {/* TODO */}

    public void drawD(City cty) {/* TODO */}

    public void drawE(City cty) {
        // Gather sufficient things for this letter
        this.loadWithThings(11);

        this.move(2);
        this.turnAround();
        this.moveAndPutThings(2);
        this.turnRight();
        this.moveAndPutThings(5);
        this.turnAround();
        this.move(1);
        this.turnLeft();
        this.move();
        this.moveAndPutThings(2);
        this.turnRight();
        this.move(2);
        this.turnRight();
        this.move();
        this.moveAndPutThings(2);

        this.turnAround();
        this.move(4);
        this.turnRight();
        this.move(2);
        this.turnLeft();

    }

    public void drawF(City cty) {/* TODO */}

    public void drawG(City cty) {/* TODO */}

    public void drawH(City cty) {
        // Gather sufficient things for this letter
        this.loadWithThings(11);

        // Draw left vertical
        this.turnLeft();
        this.moveAndPutThings(5);

        // turn right
        this.turnRight();

        // Move to the right vertical
        this.move();
        this.move();

        // Turn right
        this.turnRight();

        // Draw right vertical
        for (int i = 0; i < 5; i++) {
            this.move();
            this.putThing();
        }

        // Go to crossbar and draw it
        this.turnAround();
        this.move(2);
        this.turnLeft();
        this.move();
        this.putThing();

        //Go to start of next letter facing EAST
        this.turnLeft();
        this.move(2);
        this.turnLeft();
        this.move(3);
    }

    public void drawI(City cty) {/* TODO */}

    public void drawJ(City cty) {/* TODO */}

    public void drawK(City cty) {/* TODO */}

    public void drawL(City cty) {
        // Gather sufficient things for this letter
        this.loadWithThings(7);


        this.move(2);
        this.turnAround();
        this.moveAndPutThings(2);
        this.turnRight();
        this.moveAndPutThings(5);
        this.turnAround();
        this.move(5);
        this.turnLeft();
        this.move(4);
    }

    public void drawM(City cty) {/* TODO */}

    public void drawN(City cty) {/* TODO */}

    public void drawO(City cty) {
        // Gather sufficient things for this letter
        this.loadWithThings(12);

        this.moveAndPutThings(2);
        this.turnLeft();
        this.moveAndPutThings(4);
        this.turnLeft();
        this.moveAndPutThings(2);
        this.turnLeft();
        this.moveAndPutThings(4);
        this.turnLeft();
        this.move(4);
    }

    public void drawP(City cty) {/* TODO */}

    public void drawQ(City cty) {/* TODO */}

    public void drawR(City cty) {/* TODO */}

    public void drawS(City cty) {/* TODO */}

    public void drawT(City cty) {/* TODO */}

    public void drawU(City cty) {/* TODO */}

    public void drawV(City cty) {/* TODO */}

    public void drawW(City cty) {/* TODO */}

    public void drawX(City cty) {/* TODO */}

    public void drawY(City cty) {/* TODO */}

    public void drawZ(City cty) {/* TODO */}

    public void turnRight() {
        for (int i = 0; i < 3; i++)
            this.turnLeft();
    }

    public void turnAround() {
        for (int i = 0; i < 2; i++)
            this.turnLeft();
    }

    public void move(int moves) {
        for (int i = 0; i < moves; i++) {
            this.move();
        }
    }

    public void moveAndPutThings(int moves) {
        for (int i = 0; i < moves; i++) {
            this.putThing();
            this.move();
        }
    }

    private void loadWithThings(int numThings) {
        System.out.println("Number of things: " + numThings);
        for (int i = 0; i < numThings; i++) {
            Thing f = new Thing(this);
            Icon icon = f.getIcon();
            icon.setColor(Color.BLACK);
            icon.setSize(1.0);
            f.setIcon(icon);
            //this.pickThing();
        }
    }
}