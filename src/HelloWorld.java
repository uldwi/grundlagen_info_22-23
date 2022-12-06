import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Karte karte1 = new HalliGalli(3, 5, "rot");
        Karte karte2 = new Uno("blau", "+2");
        Karte[] karten = {karte1, karte2};
        for (int i = 0; i < karten.length; i++) {
            karten[i].spielen();
        }
        System.out.println(add(1.5,2.3));
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, int b, int c) {
        return a+b+c;
    }

    public static double add(double a, double b) {
        return a+b;
    }
}