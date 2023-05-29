package gr.aueb.cf;

import java.util.Scanner;

public class AddApp {
    public static void main(String[] args) {
        int i = 1;
        int result = 1;
        boolean found = false;
        int count = 0;

        do {
            result = result + i;
            if (result == 7) { found = true;}
            i++;
            count ++;
        } while ((i >= 1) && (! found));

        System.out.println(count);
    }
}
