package gr.aueb.cf.ch11;

/**
 * Immutable 3D Point
 *
 * @author CF
 */
public final class Point3D {
    private final Point point;
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public Point getPoint() {
        return new Point(point.getX(), point.getY());
    }
}