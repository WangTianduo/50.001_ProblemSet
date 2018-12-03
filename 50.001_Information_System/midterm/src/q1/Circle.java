package q1;

public class Circle {

    private double x;
    private double y;
    private double radius;

    Circle() {
        x = 0;
        y = 0;
        radius = 1;
    }

    Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public boolean contains(double px, double py) {
        if (((px-x)*(px-x) + (py-y)*(py-y)) <= radius * radius) {
            return true;
        }else {
            return false;
        }
    }

    public boolean contains(Circle c) {
        double newX = c.getX();
        double newY = c.getY();
        double newR = c.getRadius();

        if (radius < newR) {
            return false;
        }

        if ((newX - x) * (newX - x) + (newY - y) * (newY - y) < (radius - newR) * (radius - newR)) {
            return true;
        }else {
            return false;
        }
    }

    public boolean overlaps(Circle c) {
        double newX = c.getX();
        double newY = c.getY();
        double newR = c.getRadius();

        if ((newX - x) * (newX - x) + (newY - y) * (newY - y) <= (radius + newR) * (radius + newR)) {
            return true;
        }else {
            return false;
        }
    }

}
