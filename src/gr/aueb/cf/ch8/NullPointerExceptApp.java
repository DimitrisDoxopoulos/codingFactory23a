package gr.aueb.cf.ch8;

public class NullPointerExceptApp {

    public static void main(String[] args) {
        String s = null;
//        String s = "Coding";

        // Because s is null, we have NullPointerException

        // By adding a breakpoint and running the debug feature,
        // we can figure out where and what error we have
        if (s != null) {
                if (s.equals("Coding")) {
                    System.out.println("Bingo");
                } else {
                    System.out.println("Not equal");
                }
        } else {
            System.out.println("s is null");
        }
    }
}
