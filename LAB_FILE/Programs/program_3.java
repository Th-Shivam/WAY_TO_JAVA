class Circle {
    double r;

    Circle(double radius) {
        r = radius;
    }

    void area() {
        System.out.println("Area = " + (3.14 * r * r));
    }

    void perimeter() {
        System.out.println("Perimeter = " + (2 * 3.14 * r));
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.area();
        c.perimeter();
    }
}