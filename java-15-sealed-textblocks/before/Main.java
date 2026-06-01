interface Shape {}

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

final class Triangle implements Shape {

    private final double a;
    private final double b;
    private final double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString() {
        return "Triangle[a=" + a + ", b=" + b + ", c=" + c + "]";
    }
}

public class Main {

    public static void main(String[] args) {

        Shape shape = new Triangle(3, 4, 5);
        System.out.println(shape);
        System.out.println("Ohne sealed bleibt die Hierarchie offen fuer weitere Typen.");
    }
}
