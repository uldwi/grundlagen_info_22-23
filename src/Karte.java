public class Karte {
    private int breite;
    private String farbe;

    public void spielen() {
        System.out.println("Karte mit Farbe " + farbe + " gespielt");
    }

    public void aufnehmen() {
        System.out.println("Karte aufgenommen");
    }

    public Karte(int breite, String farbe) {
        setBreite(breite);
        setFarbe(farbe);
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
