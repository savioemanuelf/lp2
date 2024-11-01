/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {  // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() {  // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) {  // 2nd constructor
        radius = r;
        color = "red";
    }

    public Circle(double r, String color) {
        this.radius = r;
        this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        double r = this.getRadius();
        return r*r*Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        String s = "Este círculo tem raio = " + this.getRadius() +
                ", cor = " + this.color +
                ", area = " + this.getArea();
        return s;
    }
}