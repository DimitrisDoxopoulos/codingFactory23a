package gr.aueb.cf.ch16.shapes;

@FunctionalInterface
public interface IShape {

    /**
     * Returns the id of the {@link IShape}
     * @return
     *          the shape id
     */
    long getId();
}
