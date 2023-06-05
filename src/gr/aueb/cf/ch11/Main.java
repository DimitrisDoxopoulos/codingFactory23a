package gr.aueb.cf.ch11;

/**
 * Driver class.
 */
public class Main {

    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "D.");

        /**
         * To use a public static method, we use the name of the class
         * then .
         * and then the name of the public method
         */
        System.out.println(Student.getStudentsCount());

        // Set values
//        alice.id = 1;
        alice.setId(1);
//        alice.firstname = "Alice";
        alice.setFirstname("Alice");
//        alice.lastname = "Wonderland";
        alice.setLastname("Wonderland");


        // Get values and print them
        System.out.println("Id: " + alice.getId());
        System.out.println("First Name: " + alice.getFirstname());
        System.out.println("Last Name: " + alice.getLastname());

        System.out.println("Bob Id: " + bob.getId());
        System.out.println("Bob First Name: " + bob.getFirstname());
        System.out.println("Bob Last Name: " + bob.getLastname());
    }
}
