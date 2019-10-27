package me.raddatz.strangesort;

import java.util.Arrays;
import java.util.Comparator;

public class StrangeSort {

    public static void main(String[] args) {
        Arrays.stream((new Integer[]{123, 9, 81, 5, 99}))
                .sorted(((Comparator<Integer>) (i1, i2) -> ("" + i2 + i1).compareTo("" + i1 + i2)).reversed())
                .forEach(System.out::print);
    }
}
