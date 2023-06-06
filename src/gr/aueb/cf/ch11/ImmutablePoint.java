package gr.aueb.cf.ch11;

public class ImmutablePoint {
    private final int x;
    private final int y;

    ImmutablePoint() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
