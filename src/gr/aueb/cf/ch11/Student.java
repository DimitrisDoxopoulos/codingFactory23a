package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * definition of a simple Student class
 * POJO (Plain Old Java Object
 *
 * Student Java Bean (private fields, default constructor, setters, getters)
 */
public class Student {
    private int id;
    private String firstname;
    private String lastname;
    static Scanner in = new Scanner(System.in);

    // Static fields are not used by the class instances
    private static int studentsCount;
    // static initializer of Java: a better way to declare static variables
    // It is refered becasue we can include code in it
    // If a static variable is final, it can be initialized either by
    // specifying it when we declare it or in the static block

    static {
        int num = in.nextInt();
        studentsCount =  (num == 1) ? 1 : 0;
    }
    /**
     * Constructor
     * If the constructor does not have any parameters,
     * it is called a Default constructor
     * JVM gives us the constructor automatically so we do not need to
     * create it manually
     */
//    public Student() {
//        id = 0;
//        firstname = null;
//        lastname = null;
//    }

    public Student() {
        studentsCount++;
    }

    /**
     * Overloaded Constructor
     * Reminder: Overloaded means that we have a method
     * that has the same name with an existing one of our class
     * but has different parameters
     *
     * If we specify an overloaded constructor, then JVM stops providing
     * one and we use ours. Java beans always have a specified constructor
     * so we need to create an overloaded one to keep the convension going
     */
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;

        studentsCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Static methods can only use static methods and static variables
     * @return
     */
    public static int getStudentsCount() {
        return studentsCount;
    }
}
