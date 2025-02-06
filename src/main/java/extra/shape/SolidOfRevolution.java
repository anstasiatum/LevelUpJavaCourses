package extra.shape;

public abstract class SolidOfRevolution extends Shape {
    protected final double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
