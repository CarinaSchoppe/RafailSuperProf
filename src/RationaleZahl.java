public class RationaleZahl {

    private long zaeler;
    private long nenner;


    public RationaleZahl(long zahl) {
        this.zaeler = zahl;
        this.nenner = 1;
    }

    public RationaleZahl(long zaeler, long nenner) {
        this.zaeler = zaeler;
        this.nenner = nenner;
    }

    public RationaleZahl addiere(RationaleZahl zahl) {
        var z = this.zaeler * zahl.nenner + zahl.zaeler * this.nenner;
        var n = this.nenner * zahl.nenner;
        return new RationaleZahl(z, n);
    }


    public String gibAlsText() {
        if (nenner == 1) {
            return "" + zaeler;
        }
        return zaeler + "/" + nenner;
    }
}
