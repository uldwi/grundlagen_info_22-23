import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String zahl = sc.nextLine();

        try {
            int z = Integer.parseInt(zahl);
            System.out.println(z);
        } catch (NumberFormatException e) {
            System.out.println("Bitte eine Zahl eingeben!");
        }

    }
}