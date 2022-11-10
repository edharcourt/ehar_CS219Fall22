package Chap9ImmutableObjects;

import java.math.BigInteger;

public class BigIntegerPlay {

    // rewrite using BigInteger
    public static int pow(int x, int y) {
        int prod = 1;
        for (int i = 0; i < y; i++) {
            prod = prod * x;
        }
        return prod;
    }


    public static int fact(int n) {
        int prod = 1;

        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }
        return prod;
    }

    public static BigInteger bigfact(int n) {
        BigInteger prod = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            prod = prod.multiply(BigInteger.valueOf(i));
            //prod = prod.multiply(new BigInteger(Integer.toString(i)));
        }
        return prod;
    }


    public static void main(String[] args) {

        System.out.println(bigfact(2000));

        /*
        System.out.println(fact(5) == 120);

        // print the first 15 factorials
        for (int i = 1; i < 30; i++) {
            System.out.printf("%d : %d\n", i, fact(i));
        }

        // BigInteger
        BigInteger x = new BigInteger("1234567890987654321234567890");
        System.out.println(x.multiply(x).pow(20000));
        */
    }

}
