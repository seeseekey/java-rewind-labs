sealed interface Shape permits Circle, Rectangle {}

final class Circle implements Shape {

    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

final class Rectangle implements Shape {

    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + "]";
    }
}

public class Main {

    public static void main(String[] args) {

        Shape shape = new Circle(2);
        System.out.println(shape);
    }
}
