package gr.aueb.cf.ch7;

/**
 * Concatenates two or more strings
 *
 * @author CF
 */
public class ConcatApp {

    public static void main(String[] args) {
        String title = "Dr.";
        String firstname = "Athan.";
        String lastname = "Androutsos";
        String titledFullName;

        titledFullName = title.concat(firstname).concat(lastname);
        System.out.println(titledFullName);
    }
}
