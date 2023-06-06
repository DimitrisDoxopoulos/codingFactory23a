package gr.aueb.cf.ch11;

/**
 * aggregation or Composition
 * Composition = strict Aggregation
 *
 * @author CF
 */
public class Cyrcle {
    private Point center;
    private int radius;

    public Cyrcle () {

    }

    public Cyrcle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
