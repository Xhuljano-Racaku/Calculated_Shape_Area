public class EquilateralTriangle extends Triangle {

    private double d1;

    public EquilateralTriangle(String name) {
        super(name);
    }

    public void setDimensions(double d1) {
        super.setDimensions(d1, d1, d1);
        this.d1=d1;


    }
}
