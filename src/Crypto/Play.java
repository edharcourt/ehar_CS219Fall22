package Crypto;

public class Play {

    public static void main(String [] args) {
        System.out.println("They\\said\\\"hurray\"");
        System.out.println(Math.floorMod(5 - 12, 26));
        System.out.println("apple".compareTo("banana") > 0);
        System.out.println(77 % -9);
        System.out.println(Math.floorMod(-77,9));
        System.out.println(3/2);                  // 1
        System.out.println(-3/2);                 // -1
        System.out.println(Math.floor(-1.25));    // -2.0
        System.out.println(Math.floor(-33.1));    // -34.0
        System.out.println(Math.floor(33.1));     // 33.0
        System.out.println(-5/2);                 // -2
        System.out.println(Math.floor(-5/2));     // -2.0
        System.out.println(Math.floor(-5/2.0));   // -3.0
        System.out.println(Math.floorDiv(-3, 2));  // -2

        // remainder play
        System.out.println(-15 % 12);
        System.out.println(-93 % 13);
        System.out.println(Math.floorMod(-15,12));
        System.out.println(Math.floorMod(-93, 13));

    }
}
