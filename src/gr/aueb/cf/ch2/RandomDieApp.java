package gr.aueb.cf.ch2;

public class RandomDieApp {

    public static void main(String[] args) {
        int min = 1;
        int max = 20;

        int random = (int) ((Math.random() * max) + min);

        System.out.printf("The result of the %d die is: %d", max, random);
    }
}
