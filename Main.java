import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DecimalFormat x = new DecimalFormat();
        x.setMaximumFractionDigits(2);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius for circle:  ");
        Circle circle = new Circle("Circle");
        circle.setDimensions(scan.nextDouble());

        System.out.println("\n"+circle.getName());
        circle.printDimensions();
        System.out.println("Area: "+x.format(circle.getArea()));


        System.out.println("\nEnter the length and the height for square separating by a space or enter: ");
        Square square = new Square("Square");
        square.setDimensions((scan.nextDouble()), scan.nextDouble());

        System.out.println("\n"+square.getName());
        square.printDimensions();
        System.out.println("Area: "+x.format(square.getArea()));


        System.out.println("\nEnter three sides for triangle separating by a space or enter: ");
        Triangle triangle = new Triangle("Triangle");
        triangle.setDimensions((scan.nextDouble()),scan.nextDouble(), scan.nextDouble());

        System.out.println("\n"+triangle.getName());
        triangle.printDimensions();
        System.out.println("Area: "+x.format(triangle.getArea()));


        System.out.println("\nEnter the side for equilateral triangle: ");
        EquilateralTriangle eqTriangle = new EquilateralTriangle("Equilateral Triangle");
        eqTriangle.setDimensions((scan.nextDouble()));

        System.out.println("\n"+eqTriangle.getName());
        eqTriangle.printDimensions();
        System.out.println("Area: "+x.format(eqTriangle.getArea()));


    }
}

