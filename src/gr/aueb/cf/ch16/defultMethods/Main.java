package gr.aueb.cf.ch16.defultMethods;

public class Main {
    public static void main(String[] args) {
        IWelcome welcome = new CodingFactory();
        welcome.sayHelloCodingFactory();
    }
}
