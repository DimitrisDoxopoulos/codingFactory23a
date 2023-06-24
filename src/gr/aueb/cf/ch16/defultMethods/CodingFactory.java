package gr.aueb.cf.ch16.defultMethods;

import org.w3c.dom.ls.LSOutput;

public class CodingFactory implements IWelcome {
    @Override
    public void saySomething(String message) {
        System.out.println("Please get the message: " + message);
    }

    @Override
    public void sayHelloCodingFactory() {
        IWelcome.super.sayHelloCodingFactory();
        System.out.println("\u2764".repeat(5));
    }
}
