package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 *  How to add integers bigger than the MAX_VALUE  of int
 *
 * @author Dimitris
 */
public class AddBigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("21474836488765");
        BigInteger bigNum2 = new BigInteger("21474836498757");
        BigInteger bigResult = new BigInteger("0");

        bigResult = bigNum1.add(bigNum2);

        System.out.printf("The big result from the big add is %d", bigResult);
    }
}
