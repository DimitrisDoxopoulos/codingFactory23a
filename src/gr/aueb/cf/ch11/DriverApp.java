package gr.aueb.cf.ch11;

/**
 *
 * @author CF
 * @version 1.0
 * @since 1.0
 */
public class DriverApp {

    public static void main(String[] args) {
        Teacher alice = new Teacher();
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        System.out.println("ID: " + alice.getId());
        System.out.println("First Name:" + alice.getFirstname());
        System.out.println("Last Name: " + alice.getLastname());
    }
}
