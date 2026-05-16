

class Report {

    void generateReport() {
        System.out.println("Generating Report...");
    }
}

class ReportPrinter {

    void printReport() {
        System.out.println("Printing Report...");
    }
}


interface Shape {
    double area();
}

class Rectangle implements Shape {

    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {

    void printArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }
}


public class Day27Example1 {

    public static void main(String[] args) {

        System.out.println("=== Single Responsibility Principle ===");

        Report report = new Report();
        report.generateReport();

        ReportPrinter printer = new ReportPrinter();
        printer.printReport();


        System.out.println("\n=== Open/Closed Principle ===");

        AreaCalculator calculator = new AreaCalculator();

        Shape rectangle = new Rectangle(5, 4);
        Shape circle = new Circle(3);

        calculator.printArea(rectangle);
        calculator.printArea(circle);
    }
}
