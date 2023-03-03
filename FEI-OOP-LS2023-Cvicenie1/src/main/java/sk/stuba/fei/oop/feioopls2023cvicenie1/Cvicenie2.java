package sk.stuba.fei.oop.feioopls2023cvicenie1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Cvicenie2 {
    public static void main(String[] args) {
        int x = 5;
        int[] y = new int[]{1, 2, 3};

        System.out.println(x);
        pokusRaw(x);
        System.out.println(x);

        System.out.println(Arrays.toString(y));
        pokusArray(y);
        System.out.println(Arrays.toString(y));

    }

    public static void pokusRaw(int cislo) {
        cislo = 7;
        System.out.println(cislo);
    }

    public static void pokusArray(int[] array) {
        array[0] = 10;
        System.out.println(Arrays.toString(array));
    }
}