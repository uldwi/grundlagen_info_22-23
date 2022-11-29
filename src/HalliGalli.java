public class HalliGalli extends Karte{
    private int zahl;
    private static int anzKarten = 0;

    public static int getAnzKarten() {
        return anzKarten;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        if(zahl<=5) {
            this.zahl = zahl;
        } else {
            System.out.println("nicht möglich");
        }
    }

    public void spielen() {
        System.out.println("HalliGalli Karte mit Farbe " + getFarbe() + " und zahl " + zahl + " gespielt");
    }

    public HalliGalli(int zahl, int breite, String farbe) {
        super(breite, farbe);
        setZahl(zahl);
        anzKarten ++;
    }
}
