class Circle {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    void circumference() {
        System.out.println("Circumference of the Circle: " + (2 * 3.14 * radius));
    }

    void area() {
        System.out.println("Area of the Circle: " + (3.14 * radius * radius));
    }
}

public class prg3 {
    public static void main(String [] args) {
        Circle obj1 = new Circle(5);

        obj1.circumference();
        obj1.area();
    }
}