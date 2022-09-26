package StringPlay;

import java.util.Scanner;

public class CharacterPlay {

    public static int countVowels(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // get character at index i
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U')
                count++;
        }

        return count;
    }

    public static void main(String [] args) {

        System.out.println(countVowels("applesauce") == 5);
        System.out.println(countVowels("Hippopotomonstrosesquippedaliaphobia") == 16);
        char ch = 'a'; // 'a' is just shorthand for an integer code
                       // assigned by the Unicode Consortium
        System.out.println(ch);
        System.out.println((int) ch);
        System.out.println("Hello" + ('a' + 1));
        System.out.println((char) 8749);
        System.out.println((char) 198);
        System.out.println((char) 960);

        Scanner s  = new Scanner(System.in);
        String input = s.next();
        System.out.println("Input = " + input);

    }

}
