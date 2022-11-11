package HW9;

import java.math.BigInteger;

public class HW9 {

    /*
        Compute x raised to the y power using a simple iterative process
        (i.e., a loop). Do not use BigInteger's built in pow function.
     */
    public static BigInteger bigpow(BigInteger x, int y) {
        return BigInteger.ZERO;  // shut up error message
    }

    /*
        Compute x raised to the y power using a the recusive definition
        from the programming assignment in Canvas. Do not use BigInteger's
        built in pow function.
     */
    public static BigInteger fastbigpow(BigInteger x, int y) {
        return BigInteger.ZERO;  // shut up error message
    }

    public static void main(String[] args) {

        BigInteger x = new BigInteger("1029883673");

        BigInteger xtoy = fastbigpow(x,10);
        System.out.println(xtoy.toString().equals("1342399346995612672464070989837373830965198185983932347990254056431651542191037112352025649"));

        // make sure our result agrees with BigInteger's built in pow function.
        System.out.println(fastbigpow(xtoy, 100).equals(xtoy.pow(100)));
    }
}
