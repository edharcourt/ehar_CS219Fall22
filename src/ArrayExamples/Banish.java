package ArrayExamples;

import java.util.ArrayList;
import java.util.Arrays;

// Example from code, step by step
public class Banish {

    public static void remove(int k, int [] values) {
        int i = 0;

        while (i < values.length && values[i] != k)
            i++;

        if (i == values.length)
            return;

        for (int j = i; j < values.length - 1; j++)
            values[j] = values[j + 1];

        values[values.length - 1] = 0;
    }

    public static void main(String[] args) {

        int [] vec = { 42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1 };
        remove(23, vec);
        remove(1, vec);
        remove(42, vec);

        System.out.println(Arrays.toString(vec));
    }

}
