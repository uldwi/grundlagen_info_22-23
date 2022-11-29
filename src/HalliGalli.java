public class HalliGalli {
    private int anzahl;
    private String farbe;
    private double breite = 5.5;
    private static int anzKarten = 0;

    public static int getAnzKarten() {
        return anzKarten;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setAnzahl(int anzahl) {
        if(anzahl<=5) {
            this.anzahl = anzahl;
        } else {
            System.out.println("nicht möglich");
        }
    }

    public void spiel() {
        System.out.println("Karte mit " + anzahl + " " + farbe + " gespielt");
    }

    public void gebeAn(int spieler) {
        System.out.println("An Spieler " + spieler + " gegeben.");
    }

    public HalliGalli(int anzahl, String farbe) {
        setAnzahl(anzahl);
        this.farbe = farbe;
        anzKarten++;
    }
}
