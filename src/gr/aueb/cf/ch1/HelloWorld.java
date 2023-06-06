package gr.aueb.cf.ch1;

import gr.aueb.cf.ch1.model.Point;
import gr.aueb.cf.ch11.HelloUtil;

import java.util.Scanner;

/**
 * Prints <b>Hello World</b>
 * Defines a {@link HelloWorld} type
 *
 * @author CF
 * @version 1.0
 * @since 1.0
 */
public class HelloWorld {
    private Scanner in = new Scanner(System.in);
    private Point point;
    private String s;

    public static void main(String[] args) {
        System.out.println("Hello World");
        HelloUtil.sayHello();
    }
}
