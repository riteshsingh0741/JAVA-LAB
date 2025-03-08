package lab3;
import java.util.Scanner; 
class Shape {
    double length, width;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double Area() {
        return length * width;
    }

    public double Perimeter() {
        return 2 * (length + width);
    }
}


public class ShapeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of Shape 1 : ");
        double l1 = scanner.nextDouble();
        System.out.print("Enter breadth of Shape 1 : ");
        double b1 = scanner.nextDouble();
        Shape s1 = new Shape(l1, b1);

        System.out.print("\nEnter length of Shape 2 : ");
        double l2 = scanner.nextDouble();
        System.out.print("Enter breadth of Shape 2 : ");
        double b2 = scanner.nextDouble();
        Shape s2 = new Shape(l2, b2);

        System.out.println("\nShape 1:");
        System.out.println("Area: " + s1.Area());
        System.out.println("Perimeter: " + s1.Perimeter());

        System.out.println("\nShape 2:");
        System.out.println("Area: " + s2.Area());
        System.out.println("Perimeter: " + s2.Perimeter());

    }
}
