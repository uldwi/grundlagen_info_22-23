import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        HalliGalli karte1 = new HalliGalli(3,"rot");
        System.out.println("AnzKarten: " + karte1.getAnzKarten());
        HalliGalli karte2 = new HalliGalli(5, "gelb");
        System.out.println("AnzKarten: " + karte2.getAnzKarten());
    }
}