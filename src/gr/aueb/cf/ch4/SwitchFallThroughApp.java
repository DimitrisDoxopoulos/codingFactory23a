package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * User insets a grade and prints feedback
 * (Excellent, very good, good, not passed yet)
 * 10 <= Excellent <= 9
 * 9 <= Very Good <= 7
 * 6 <= Good <= 5
 * 5 < not passed yet
 * @author CF
 */
public class SwitchFallThroughApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade;

        System.out.println("Please insert the grade");
        grade = in.nextInt();
        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Not passed yet");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Error in grade");
                break;
        }
    }
}
