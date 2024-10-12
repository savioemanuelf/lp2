package atividade01.rectangle;

public class Rectangle {
    // ATTRIBUTES
    private float width, length;

    // DEFAULT CONSTRUCTOR
    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    // CONSTRUCTOR
    public Rectangle(float length, float width) {
        this.width = width;
        this.length = length;
    }

    // GETTERS
    public float getWidth() {
        return this.width;
    }

    public float getLength() {
        return this.length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2*(this.width + this.length);
    }
    
    // SETTERS
    public void setWidth(float new_width) {
        this.width = new_width;
    }
    public void setLength(float new_length) {
        this.length = new_length;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Rectangle[length=" + this.getLength() + ", width=" + this.getWidth() + "]";
    }
}