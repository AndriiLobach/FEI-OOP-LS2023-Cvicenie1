package sk.stuba.fei.oop.feioopls2023cvicenie1;

import java.util.Objects;
import java.util.Scanner;

public class Cvicenie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "a";
        String b = "a";
        System.out.println("zadajte text");
        String c = sc.nextLine();

        System.out.println("a == a " + (a == a));
        System.out.println("a == b " + (a == b));
        System.out.println("a == c " + (a == c));
        System.out.println("Objects.equals(a, c) " + Objects.equals(a, c));
        System.out.println("Objects.equals(b, c) " + Objects.equals(b, c));
        System.out.println("a.equals(c) " + a.equals(c));
    }
}