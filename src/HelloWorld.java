import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Karte karte1 = new HalliGalli(3, 5, "rot");
        Karte karte2 = new Uno("blau", "+2");
        Karte[] karten = {karte1, karte2};
        for (int i = 0; i < karten.length; i++) {
            karten[i].spielen();
        }
    }
}