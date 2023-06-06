package gr.aueb.cf.ch11;

/**
 * Eager instantiation
 * Mono-coding Factory Universe
 * Singleton Pattern
 */
public class CodingFactory {
    // Eager Instantiation: The class is instantiated when the class is loaded
    private static final CodingFactory INSTANCE = new CodingFactory();

    private CodingFactory() {}

    public static CodingFactory getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello Coding Factory");
    }
}
