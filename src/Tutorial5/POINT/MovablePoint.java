package Tutorial5.POINT;

import java.awt.*;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint() {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    
    MovablePoint(float xSpeed, float ySpeed) {
        // superclass constructor is called automatically
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        // float[] speed = { xSpeed, ySpeed };
        // return speed;
        return new float[]{xSpeed, ySpeed};
    }

    public String toString(){
        return super.toString() + " ,speed=(" + xSpeed + " ," + ySpeed + ")";
    }

    public MovablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
    
}
