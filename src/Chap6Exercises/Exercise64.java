package Chap6Exercises;

public class Exercise64 {

    public static boolean isAlphabetical(String s) {
        // Rewrite using a while loop
        int i = 0;
        while (i < s.length() - 1) {
        //for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i+1)) {
                return false;
            }
            i++;
        }  // while

        // What is true if we made it to this point?
        return true;
    }

    public static String toLower(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('A' <= ch && ch <= 'Z')
                r = r + (char) ('a' + (ch - 'A'));
            else
                r = r + ch;
        } // for
        return r;
    }

    public static boolean isAbecedarian(String s) {
        s = s.toLowerCase();
        s = Exercise64.toLower(s);

        // Rewrite using a while loop
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i+1)) {
                return false;
            }
        }  // for

        // What is true if we made it to this point?
        return true;
    }

    public static void main(String [] args) {
        System.out.println(toLower("APPLE"));
        System.out.println(toLower("ApPlE"));
        System.out.println(toLower("Apple!@#$%"));
        System.out.println(isAbecedarian("biOPsy"));
        System.out.println(!isAbecedarian("apple"));

    }

}
