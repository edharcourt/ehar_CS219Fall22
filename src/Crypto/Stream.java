package Crypto;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Stream {

    public static String E(String clear, int key, boolean encrypt) {
        String cipher = "";
        final int alpha_length = ('~' - ' ') + 1;  // this should not change
        final char base_char = ' ';  // the starting character of the alphabet

        SecureRandom rng = null;
        try {
            rng = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        rng.setSeed(key);  // seeding the random number generator

        for (int i = 0; i < clear.length(); i++) {
            char clear_char = clear.charAt(i);
            int clear_char_pos = clear_char - base_char;  // space is the starting character
            int shift = rng.nextInt(100);
            if (!encrypt)
                shift = -shift;
            int cipher_char_pos = Math.floorMod(clear_char_pos + shift, alpha_length);
            char cipher_char = (char) (cipher_char_pos + base_char);
            cipher += cipher_char;
        }

        return cipher;
    }

    public static void main (String [] args) {
        System.out.println(E("java", 10, true));
        System.out.println(E("j\\?v", 10, false));
    }

}
