public class Uno extends Karte{
    private String zahl;

    public Uno(String farbe, String zahl) {
        super(15, farbe);
        this.zahl = zahl;
    }

    public String getZahl() {
        return zahl;
    }

    public void setZahl(String zahl) {
        this.zahl = zahl;
    }

    public void spielen() {
        System.out.println("Uno Karte mit Farbe " + getFarbe() + " und zahl " + zahl + " gespielt");
    }
}
