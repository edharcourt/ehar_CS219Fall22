package ArrayExamples;

import java.util.Arrays;

public class CardDeck {

    public static String [] build_deck() {
        String [] suits = { "\u2660", "\u2665", "\u2666", "\u2663"};
        String [] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                            "Jack", "Queen", "King", "Ace"};
        String [] deck = new String[suits.length * ranks.length];
        int i = 0;

        for (String suit : suits)    // for each suit in the suits array
            for (String rank : ranks)
                deck[i++] = suit + rank;
        return deck;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(build_deck()));
    }
}
