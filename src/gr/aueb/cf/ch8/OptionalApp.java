package gr.aueb.cf.ch8;

import java.sql.SQLOutput;
import java.util.Optional;

/**
 * Sometimes we need to return an empty avlue
 * Usually the Java community returns null but
 * from the Java docs, Optional is recommended
 *
 * @author CF
 */
public class OptionalApp {

    public static void main(String[] args) {
        String s = "AUEB";
        String copied = null;

        Optional<String> str = getStrCopy(s);

        if (str.isPresent()) {
            copied = str.get();
        }

//        System.out.println(copied);

        // Modern Lamda functions. Does the same as sout
        str.ifPresent(System.out::println);

//        String s = null;
//        String str = getCopy(s);
//
//        if (str != null && str.equals("AUEB")) {
//            System.out.println(str);
//        }
    }

    public static String getCopy(String s) {
        return s;
    }

    public static Optional<String> getStrCopy(String s) {
        if (s == null) return Optional.empty();
        return Optional.of(s);

        // Same thing, fewer lines
//        return Optional.ofNullable(s);
    }
}
