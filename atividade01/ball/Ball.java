package atividade01.ball;

public class Ball {
    private float x, y;
    private int radius;
    private float xDelta, yDelta;

    public Ball(float x, float y, int radius, float xDelta, float yDelta){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // GETTERS
    public float getX() { return this.x; }
    public float getY() { return this.y; }
    public int getRadius() { return this.radius; }
    public float getXDelta() { return this.xDelta; }
    public float getYDelta() { return this.yDelta; }

    // SETTERS
    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y;  }
    public void setRadius(int radius)  { this.radius = radius; }
    public void setXDelta(float xDelta) { this.xDelta = xDelta; }
    public void setYDelta(float yDelta) { this.yDelta = yDelta; }

    // METHODS
    public void move() {
        this.x += xDelta;
        this.y += yDelta;
    }
    public void reflectHorizontal() {
        this.xDelta = -xDelta;
    }
    public void reflectVertical() {
        this.yDelta = -yDelta;
    }
    // TO STRING
    @Override
    public String toString() {
        return "Ball[(" + this.getX() + ", " + this.getY() + ", speed= " + this.getXDelta() + ", " + this.getYDelta() + "]";
    }
}
