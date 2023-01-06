public class Laenge {

    private final int m;
    private final int cm;

    public Laenge(int m, int cm) {
        this.m = m;
        if (cm >= 0 && cm < 100) {
            this.cm = cm;
        } else {
            this.cm = 0;
        }
    }

    public static void main(String[] args) {
        boolean istGlatt = new Laenge(2, 140).
                addiere(260).
                istGlatt();
    }

    public boolean istLaenger(Laenge laenge) {
        return this.m * 100 + this.cm > laenge.m * 100 + laenge.cm;
    }

    public int getM() {
        return m;
    }

    public boolean istGlatt() {
        return (cm + m * 100) % 100 == 0;
    }

    //530cm -> 530 / 100 = 5m (lösche die 30cm raus) -> 530 % 100 = 30cm (die 30cm bleiben)
    public Laenge addiere(int laenge) {
        return new Laenge(m + laenge / 100, cm + laenge % 100);
    }

    public int getCm() {
        return cm;
    }
}
