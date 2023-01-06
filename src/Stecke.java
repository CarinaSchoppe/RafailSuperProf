public class Stecke {

    private final Punkt start;
    private final Punkt ziel;

    public Stecke(Punkt start, Punkt ziel) {
        this.start = start;
        this.ziel = ziel;
    }

    public boolean fuertAufwaerts() {
        return ziel.gibY() > start.gibY();
    }

    public Punkt getStart() {
        return start;
    }

    public Punkt getZiel() {
        return ziel;
    }

    public Stecke drehe90() {
        //turn the strecke in a 90 degrees angle to to start point
        return new Stecke(start,
                new Punkt(start.gibX() + ziel.gibY() - start.gibY(),
                        start.gibY() + start.gibX() - ziel.gibX()));
    }
}
