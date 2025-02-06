package extra.shape;

public class Ball extends SolidOfRevolution{
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        volume = (4d / 3d) * Math.PI * radius * radius * radius;
        return super.getVolume();
    }
}
