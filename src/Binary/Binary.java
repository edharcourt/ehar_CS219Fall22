package Binary;

public class Binary {

    public static void printBinary(int n) {
        if (n == 0)
            System.out.print(0);
        else {
            printBinary(n/2);
            System.out.print(n % 2);
        }
    }


    public static String toBinary(int n) {
        String r = "";

        while (n > 0) {
            r = (n % 2) + r;
            n = n / 2;
        }
        return r;
    }

    public static int parseInt(String bits) {

        int curr_pow_2 = 1;
        int r = 0;

        for (int i = bits.length() - 1; i >= 0; i--) {
            if (bits.charAt(i) == '1') {
                r += curr_pow_2;
            }
            curr_pow_2 *= 2;
        }
        return r;
    }

    public static void main(String[] args) {
        printBinary(43);  // 101011
        System.out.println();
        System.out.println(toBinary(43));
        System.out.println(parseInt("101011") == 43);
        System.out.println(Integer.parseInt("100011111", 2));
        System.out.println(Integer.toBinaryString(43));
        System.out.println(Integer.toHexString(4023));
        System.out.println(0b11111111111111111111111111111111);
        System.out.println(0xFFFFFFFF);
    }

}
