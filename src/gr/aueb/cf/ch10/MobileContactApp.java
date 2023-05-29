package gr.aueb.cf.ch10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class MobileContactApp {

    final static String[][] contacts = new String[500][3];
    static int pivot = -1;
    final static Path path = Paths.get("C:\\Users\\Dimitris\\IdeaProjects\\CodingFactory22\\src\\gr\\aueb\\cf\\ch10\\logs\\log-mobile.txt");
    final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        String s;
        int choice;
        String phoneNumber;

        do {
            printMenu();
            s = getChoice();
            if (s.matches("[qQ]")) {
                quit = true;
            } else {
                try {
                    choice = Integer.parseInt(s);
                    if(!isValidChoice(choice))
                        throw new IllegalArgumentException("Choice out of bounds");

                    switch (choice) {
                        // Insert
                        case 1:
                            printContactMenu();
                            insertController(getFirstName(), getLastName(), getPhoneNumber());
                            System.out.println("Inserted successfully");
                            break;
                        // Delete
                        case 2:
                            phoneNumber = getPhoneNumber();
                            deleteController(phoneNumber);
                            System.out.println("Deleted successfully");
                            break;
                        // Update
                        case 3:
                            phoneNumber = getOldPhoneNumber();
                            updateController(getFirstName(), getLastName(), phoneNumber, getNewPhoneNumber());
                            System.out.println("Updated successfully");
                            break;
                        // View one contact
                        case 4:
                            phoneNumber = getPhoneNumber();
                            String[] contact = getOneController(phoneNumber);
                            printContact(contact);
                            break;
                        // Print all contacts
                        case 5:
                            String[][] allContacts = getAllContacts();
                            printAllContacts(allContacts);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid choice");

                    }
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } while (!quit);
    }

    public static boolean isValidChoice(int choice) {
        return (choice >= 1 && choice <= 5);
    }

    public static void printMenu() {
        System.out.println("Choose what you want to do");
        System.out.println("1. Insert contact");
        System.out.println("2. Delete contact");
        System.out.println("3. Update contact");
        System.out.println("4. Search contact by using the number");
        System.out.println("5. View all contacts");
        System.out.println("Q/q Exit");
    }

    public static String getChoice() {
        System.out.println("Make your choice");
        return in.nextLine();
    }

    public static void printContactMenu() {
        System.out.println("Please insert first name, last name and phone number");
    }

    public static String getFirstName() {
        System.out.println("Please insert the first name");
        return in.nextLine().trim();
    }

    public static String getLastName() {
        System.out.println("Please insert the last name");
        return in.nextLine().trim();
    }

    public static String getPhoneNumber() {
        System.out.println("Please insert the phone number");
        return in.nextLine().trim();
    }

    public static String getOldPhoneNumber() {
        System.out.println("Please insert currently saved the phone number");
        return in.nextLine().trim();
    }

    public static String getNewPhoneNumber() {
        System.out.println("Please insert the new phone number");
        return in.nextLine().trim();
    }

    public static void printContact(String[] contact) {
        for (String item : contact) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void printAllContacts(String[][] allContacts){
        for (String[] contact : allContacts) {
//            System.out.printf("%s\t%s\t%s\n", contact[0], contact[1], contact[2]);
            printContact(contact);
        }
    }

    /*
     * Controllers
     */
    public static void insertController(String firstname, String lastname, String phoneNumber) {
        try {
            // Input data validations
            if (firstname == null || lastname == null || phoneNumber == null)
                throw new IllegalArgumentException("Nulls are not allowed");
            if (firstname.length() < 2 || firstname.length() > 50)
                throw new IllegalArgumentException("First name is not valid");
            if (lastname.length() < 2 || lastname.length() > 50)
                throw new IllegalArgumentException("Last name is not valid");
            if (phoneNumber.length() != 10)
                throw new IllegalArgumentException("Phone number is not valid");

            // Calling insert service
            insertContactService(firstname.trim(), lastname.trim(), phoneNumber.trim());
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    public static void updateController(String firstname, String lastname, String oldPhoneNumber, String newPhoneNumber) {
        try {
            // Update data validations
            if (firstname == null || lastname == null || oldPhoneNumber == null || newPhoneNumber == null)
                throw new IllegalArgumentException("Nulls are not allowed");
            if (firstname.length() < 2 || firstname.length() > 50)
                throw new IllegalArgumentException("First name is not valid");
            if (lastname.length() < 2 || lastname.length() > 50)
                throw new IllegalArgumentException("Last name is not valid");
            if (oldPhoneNumber.length() != 10)
                throw new IllegalArgumentException("Old phone number is not valid");
            if (newPhoneNumber.length() != 10)
                throw new IllegalArgumentException("New phone number is not valid");

            // Calling update service
            updateContactService(firstname.trim(), lastname.trim(), oldPhoneNumber.trim(), newPhoneNumber.trim());
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    public static String[] deleteController(String phoneNumber) {
        try {
            if (phoneNumber == null)
                throw new IllegalArgumentException("No nulls, please");
            if (phoneNumber.length() != 10)
                throw new IllegalArgumentException("Phone number is not valid");
            return deleteContactService(phoneNumber);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    public static String[] getOneController(String phoneNumber) {
        try {
            if (phoneNumber == null)
                throw new IllegalArgumentException("No nulls, please");
            if (phoneNumber.length() != 10)
                throw new IllegalArgumentException("Phone number is not valid");
            return getOneContactService(phoneNumber);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    public static String[][] getAllContactsController() {
        try {
            return getAllContactsService();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    /*
     * Service Layer
     */

    public static String[] getOneContactService(String phoneNumber) {
        try {
            String[] contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new IllegalArgumentException("Contact not found");
            }
            return contact;
        } catch (IllegalArgumentException ex) {
            log(ex);
            throw ex;
        }
    }

    public static String[][] getAllContactsService() {
        String[][] allContacts = getAllContacts();
        try {
            if (allContacts.length == 0) throw new IllegalArgumentException("List is empty");
            return allContacts;
        } catch (IllegalArgumentException ex) {
            log(ex);
            throw ex;
        }
    }

    public static void insertContactService(String firstname, String lastname, String phoneNumber) {
        try {
            if (!(insert(firstname, lastname, phoneNumber))) throw new IllegalArgumentException("Error in insert");
        } catch (IllegalArgumentException ex) {
            log(ex);
            throw ex;
        }
    }

    public static void updateContactService(String firstname, String lastname, String oldPhoneNumber, String newPhoneNumber) {
        try {
            if (!(update(oldPhoneNumber, firstname, lastname, newPhoneNumber))) throw new IllegalArgumentException("Error in update");
        } catch (IllegalArgumentException ex) {
            log(ex);
            throw ex;
        }
    }

    public static String[] deleteContactService(String phoneNumber) {
        String[] contact;
        try {
            contact = delete(phoneNumber);
            if (contact.length == 0) throw new IllegalArgumentException("Error in delete");
            return contact;
        } catch (IllegalArgumentException ex) {
            log(ex);
            throw ex;
        }
    }

    /*
     *   CRUD services that add provided to service layer
     */
    public static int getIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }
        return -1; // if the phoneNUmber is not found in contacts
    }

    public static boolean insert(String firstname, String lastname, String phoneNumber) {
        boolean inserted = false;

        if (isFull(contacts)) {
            return false;
        }

        if (getIndexByPhoneNumber(phoneNumber) != -1) {
            return false;
        }

        pivot++;
        contacts[pivot][0] = firstname;
        contacts[pivot][1] = lastname;
        contacts[pivot][2] = phoneNumber;
        return true;
    }

    public static boolean update(String oldPhoneNumber, String firstname, String lastname, String newPhoneNumber) {
        int positionToUpdate = getIndexByPhoneNumber(oldPhoneNumber);
//        String[] contact = new String[3];

        if (positionToUpdate == -1) {
//            return new String[] {};
            return false;
        }

//        contact[0] = contacts[positionToUpdate][0]f;
//        contact[1] = contacts[positionToUpdate][1];
//        contact[2] = contacts[positionToUpdate][2];

        contacts[positionToUpdate][0] = firstname;
        contacts[positionToUpdate][1] = lastname;
        contacts[positionToUpdate][2] = newPhoneNumber;
//        return contact;
        return true;
     }

    public static String[] delete(String phoneNumber) {
        int positionToDelete = getIndexByPhoneNumber(phoneNumber);
        String[] contact = new String[3];

        if (positionToDelete == -1) return new String[] {};

        for (int i = 0; i < contacts.length; i++) {
            contact[i] = contacts[positionToDelete][i];
        }

        if (!(positionToDelete == contacts.length - 1)) {
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        }

        pivot--;
        return contact;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber) {
        int positionToReturn = getIndexByPhoneNumber(phoneNumber);
        if (positionToReturn == -1) return new String[] {};

        return contacts[positionToReturn];
    }

    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot + 1);
    }

    public static boolean isFull(String[][] arr) {
        return pivot == arr.length-1;
    }

    /**
     * Custom Logger
     * Varargs String[] message
     *
     * @param e
     * @param message
     */
    public static void log(Exception e, String... message) {

        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))) {
            ps.println(LocalDateTime.now() + "\n" + e.toString());
            ps.printf("%s", (message.length == 1) ? message[0] : "");
        } catch (FileNotFoundException ex) {
            e.printStackTrace();
        }
    }
}
