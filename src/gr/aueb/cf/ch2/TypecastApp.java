package gr.aueb.cf.ch2;

public class TypecastApp {

    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;
        long result = 0L;

        num2 = (int) num2;

        result = num1 + num2;

        System.out.printf("Typecasting is to be avoided because it can " +
                "make things confusing");
    }
}
