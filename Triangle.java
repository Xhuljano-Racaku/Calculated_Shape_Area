public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(String name) {
        super(name);
    }

    public void setDimensions(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;


    }

    @Override
    public void printDimensions() {
        System.out.println("Side 1: "+a+" side 2: "+b+" side 3: "+c);
    }

    @Override
    public double getArea() {
        double s =(a * b * c)/2;
        return Math.sqrt((s) * (s-a) * (s-b) * (s-c));
    }
}
