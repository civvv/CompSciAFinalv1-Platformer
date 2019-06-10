package PlatformFinal;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends Block implements Collidable {

    private int speed;

    public Player() {
        super(10, 10);
        speed = 5;
    }

    public Player(int x, int y) {
        super(x, y);
        speed = 5;
    }
    
    public Player(int x, int y, int wid, int ht, Color col, int s) {
        super(x, y, wid, ht, col);
        speed = s;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public void moveUpAndDraw(Graphics window) {
        draw(window, Color.white);

        setyPos(getyPos() - getSpeed());

        draw(window);
    }

    public void moveDownAndDraw(Graphics window) {
        draw(window, Color.white);

        setyPos(getyPos() + getSpeed());

        draw(window);
    }
    
    public void moveRightAndDraw(Graphics window) {
        draw(window, Color.white);

        setxPos(getxPos() + getSpeed());

        draw(window);
    }

    public void moveLeftAndDraw(Graphics window) {
        draw(window, Color.white);

        setxPos(getxPos() - getSpeed());

        draw(window);
    }

    public int getSpeed() {
        return speed;
    }
    public boolean didCollideLeft(Object obj) {
        Block other = (Block) obj;
        return getxPos() <= other.getxPos() + other.getWidth() + Math.abs(getSpeed());
    }

    public boolean didCollideRight(Object obj) {
        Block other = (Block) obj;
        return getxPos() + getWidth() >= other.getxPos() - Math.abs(getSpeed());
    }

    public boolean didCollideTop(Object obj) {
        Block other = (Block) obj;
        return getyPos() >= other.getyPos() && getyPos() <= other.getyPos() + getHeight();
    }

    public boolean didCollideBottom(Object obj) {
        Block other = (Block) obj;
        return getyPos() + getHeight() >= other.getyPos() && getyPos() + getHeight() <= other.getyPos() + other.getHeight();
    }

    public String toString() {
        return super.toString() + " " + speed;
    }
}
