package PlatformFinal;
import java.awt.Color;
import java.awt.Graphics;

public class Enemy1 extends Block implements Collidable {

    private int xSpeed;
    private int ySpeed;

    public Enemy1() {
        super(200, 200);
        xSpeed = 3;
        ySpeed = 1;
    }

    public Enemy1(int x, int y) {
        super(x, y);
        xSpeed = 3;
        ySpeed = 1;
    }

    public Enemy1(int x, int y, int wid, int ht) {
        super(x, y, wid, ht);
        xSpeed = 3;
        ySpeed = 1;
    }

    public Enemy1(int x, int y, int wid, int ht, Color col) {
        super(x, y, wid, ht, col);
        xSpeed = 0;
        ySpeed = 0;
    }

    public Enemy1(int x, int y, int wid, int ht, int xSpd, int ySpd) {
        super(x, y, wid, ht);
        xSpeed = xSpd;
        ySpeed = ySpd;
    }

    public Enemy1(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
        super(x, y, wid, ht, col);
        xSpeed = xSpd;
        ySpeed = ySpd;
    }

    public void setXSpeed(int xSpd) {
        xSpeed = xSpd;
    }

    public void setYSpeed(int ySpd) {
        ySpeed = ySpd;
    }

    public void moveAndDraw(Graphics window) {
        //draws over the old ball with a white ball
        draw(window, Color.white);

        //draw(window,Color.red); //draws over the old ball with whichever color you want
        //in case you want to have a trail
        
        setxPos(getxPos() + xSpeed);
        setyPos(getyPos() + ySpeed);

        draw(window);   //draws the Ball
    }
    
    public void squarePattern(int x1, int y1, int x2, int y2, int s)
    {
        //x1 = 50, y1 = 300, x2 = 200, y2 = 450
        if(getxPos() == x1 && getyPos() == y1)
        {
            setXSpeed(s);
            setYSpeed(0);
        }
        if(getxPos() == x2 && getyPos() == y1)
        {
            setXSpeed(0);
            setYSpeed(s);
        }
        if(getxPos() == x2 && getyPos() == y2)
        {
            setXSpeed(-s);
            setYSpeed(0);
        }
        if(getxPos() == x1 && getyPos() == y2)
        {
            setXSpeed(0);
            setYSpeed(-s);
        }
    }
    
    public void horizontalLinePattern(int x1, int x2, int y, int s)
    {
        if(getxPos() == x1 && getyPos() == y)
        {
            setXSpeed(s);
            //setYSpeed(0);
        }
        if(getxPos() == x2 && getyPos() == y)
        {
            setXSpeed(-s);
            //setYSpeed(s);
        }
    }

    public boolean didCollideLeft(Object obj) {
        Block other = (Block) obj;
        return getxPos() <= other.getxPos() + other.getWidth() + Math.abs(getXSpeed());
    }

    public boolean didCollideRight(Object obj) {
        Block other = (Block) obj;
        return getxPos() + getWidth() >= other.getxPos() - Math.abs(getXSpeed());
    }

    public boolean didCollideTop(Object obj) {
        Block other = (Block) obj;
        return getyPos() >= other.getyPos() && getyPos() <= other.getyPos() + getHeight();
    }

    public boolean didCollideBottom(Object obj) {
        Block other = (Block) obj;
        return getyPos() + getHeight() >= other.getyPos() && getyPos() + getHeight() <= other.getyPos() + other.getHeight();
    }

    public boolean equals(Object obj) {
        Enemy1 other = (Enemy1) obj;
        if (super.equals(other) && getXSpeed() == other.getXSpeed() && getYSpeed() == other.getYSpeed()) {
            return true;
        }
        return false;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public String toString() {
        return super.toString() + " " + xSpeed + " " + ySpeed;
    }
}
