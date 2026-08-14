// Circle.java: The circle class that extends GeometricObject
public class Circle extends GeometricObject
{
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this(radius, "white", false);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public boolean equals(Circle circle) {
        return this.radius == circle.getRadius();
    }

    @Override
    public String toString() {
        return "[Circle] radius = " + radius;
    }

    public int compareTo(GeometricObject g) {

        if(this.getClass().equals(g.getClass())) {
            Circle c = (Circle)g;

            if (this.getArea() == c.getArea())
                return 0;
            else {
                if (this.getArea() < c.getArea())
                    return -1;
                else
                    return 1;
            }
        } else 
            return this.getClass().getName().compareTo(g.getClass().getName());
    }
}