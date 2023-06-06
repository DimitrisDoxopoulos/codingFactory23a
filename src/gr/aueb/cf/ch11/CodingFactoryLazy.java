package gr.aueb.cf.ch11;

/**
 * Lazy instantiation
 * Mono-coding Factory Universe
 * Singleton Pattern
 */
public class CodingFactoryLazy {
    // lazy Instantiation: Firstly we make the INSTANCE and in the factory we instantiate
    private static CodingFactoryLazy INSTANCE = null;

    private CodingFactoryLazy() {}

    public static CodingFactoryLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CodingFactoryLazy();
        }
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello Coding Factory");
    }
}
