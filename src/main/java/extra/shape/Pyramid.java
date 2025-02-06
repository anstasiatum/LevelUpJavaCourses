package extra.shape;

public class Pyramid extends Shape {
    private final double s;
    private final double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        volume = (1d / 3d) * s * h;
        return super.getVolume();
    }
}
