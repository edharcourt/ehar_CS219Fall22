package RecursionExamples;

public class Recursion {

    // sum of the digits
    // sod(1234) ==  10
    public static int sod(int n) {
        if (n == 0)
            return 0;
        else
            return sod(n/10) + n % 10;
    }

    // count7s(7132771) == 3
    public static int count7s(int n) {
        if (n == 0)
            return 0;
        else if (n % 10 == 7)
            return count7s(n / 10) + 1;
        else
            return count7s(n / 10);
    }

    // pow(2, 10) == 1024
    public static int pow(int x, int y) {
        if (y == 0)
            return 1;
        else
            return x * pow(x, y-1);
    }

    // reverse("hello").equals("olleh")
    public static String reverse(String s) {
        if (s.length() == 0)
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);
    }

    // removeSpaces("  h   e ll    o  ").equals("hello")
    public static String removeSpaces(String s) {
        if (s.length() == 0)
            return "";
        else if (s.charAt(0) == ' ')
            return removeSpaces(s.substring(1));
        else
            return s.charAt(0) + removeSpaces(s.substring(1));
    }

    // Don't write recursively, use previous functions
    // Go hang a salami I'm a lasagna hog
    // Eva, can I see bees in a cave?
    // racecar, repaper, rotator, detartrated
    // saippuakivikauppias (Finnish for a dealer in lye)
    public static boolean isPalindrome(String s) {
        s = removeSpaces(s);
        return s.equals(reverse(s));// shut up error message
    }

    // write recursively not using functions we wrote. Just string
    // function CharAt
    public static boolean isPalindrome2(String s) {
        if (s.length() < 2)
            return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1) &&
                 isPalindrome2(s.substring(1,s.length() - 1)))
            return true;
        else
            return false;
    }

    // printBinary(23) should print 010111.
    public static void printBinary(int n) {

    }

    // toBinary(23).equals("010111")
    public static String toBinary(int n) {
        return null;
    }

    // sum(new int []{1,2,3,4}) == 10
    // Do for exam study
    // i is the current position in the array
    public static int sum(int[] a, int i) {
        return -1;  // shut up error message
    }


    // Swap items at position i and j in aos.
    public static void swap(int [] aos, int i, int j) {
        int temp = aos[i];
        aos[i] = aos[j];
        aos[j] = temp;
    }

    // Arrays.equals(new int [] {1,2,3,4},
    //               new int [] {4,3,2,1})
    // Do for exam study
    // i and j are the left and right bounds of the array
    // use function swap above.
    public static void reverse(int [] a, int i, int j) {

    }

    // main
    public static void main(String[] args) {
        System.out.println(sod(4192) == 16);
        System.out.println(count7s(7142771) == 3);
        System.out.println(pow(2,10) == 1024);
        System.out.println(reverse("hello").equals("olleh"));
        System.out.println((isPalindrome("go hang a salami im a lasagna hog")));
        System.out.println(removeSpaces(
                "go hang a salami im a lasagna hog").
                equals("gohangasalamiimalasagnahog"));
        System.out.println(isPalindrome2("racecar"));
    }

}  // class Recursion