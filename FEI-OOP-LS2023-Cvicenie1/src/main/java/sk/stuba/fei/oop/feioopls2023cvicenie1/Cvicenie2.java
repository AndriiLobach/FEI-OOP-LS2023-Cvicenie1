package sk.stuba.fei.oop.feioopls2023cvicenie1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Cvicenie2 {
    public static void main(String[] args) {
        int[][] pole = new int[10][];

        for (int i = 0; i < pole.length; i++) {
            pole[i] = new int[i + 1];
            for (int j = 0; j < pole[i].length; j++) {
                pole[i][j] = j;
            }
        }

        for (int i = 0; i < pole.length; i++) {
            System.out.println(Arrays.toString(pole[i]));
        }
    }
}