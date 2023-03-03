package sk.stuba.fei.oop.feioopls2023cvicenie1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Cvicenie2 {
    public static void main(String[] args) {
        vypis("text", 5, 34, 6, 7);
    }

    public static void vypis(String text, int... pole) {
        System.out.println(text);
        System.out.println(Arrays.toString(pole));
    }
}