package sk.stuba.fei.oop.feioopls2023cvicenie1;

public class App {
    public static void main(String[] args) {
        int [] pole = new int[10];

        for (int i = 0; i < pole.length; i++) {
            pole[i] = i;
        }

        for (int i = 0; i < pole.length; i++) {
            vypis(pole[i]);
            // System.out.println("Cislo v poli je " + pole[i]);
        }
    }

    public static void vypis(int a) {
        System.out.println(String.format("Funkcia bola zavolana %d. krat", a+1));
    }
}

