public class Rechteck {


    private int breite;
    private int hoehe;

    public Rechteck(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public static void main(String[] args) {
        double seitenverhaeltnis = new Rechteck(2, 1).drehe90Grad().gibSeitenverhaeltnis();
        System.out.println(seitenverhaeltnis);
    }

    public double gibSeitenverhaeltnis() {
        return (double) breite / hoehe;
    }

    public boolean istGroesser(Rechteck rechteck) {
        return this.breite * this.hoehe > rechteck.breite * rechteck.hoehe;
    }

    public Rechteck drehe90Grad() {
        return new Rechteck(hoehe, breite);
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }
}
