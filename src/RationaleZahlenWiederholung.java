public class RationaleZahlenWiederholung {


    private long zaeler;
    private long nenner = 1;


    public RationaleZahlenWiederholung(long zahl) {
        this.zaeler = zahl;
    }

    public RationaleZahlenWiederholung(long zaeler, long nenner) {
        this.zaeler = zaeler;
        this.nenner = nenner;
    }

    public static void main(String[] args) {/*
        System.out.println(new RationaleZahlenWiederholung(15, 3).gibAlsText());*/
        System.out.println(new RationaleZahlenWiederholung(2, 8).gibAlsText().equals("1/4"));
        System.out.println(new RationaleZahlenWiederholung(5, 6).addiere(new RationaleZahlenWiederholung(2, 8)).gibAlsText().equals("13/12"));
    }

    public RationaleZahlenWiederholung addiere(RationaleZahlenWiederholung zahl) {
        var zaehler = this.zaeler * zahl.nenner + zahl.zaeler * this.nenner;
        var nenner = this.nenner * zahl.nenner;
        return new RationaleZahlenWiederholung(zaehler, nenner);
    }

    public long gcd(long zaehler, long nenner) {
        if (nenner == 0) {
            return zaehler;
        }
        return gcd(nenner, zaehler % nenner);
    }

    public String gibAlsText() {
        //shorten the fraction if possible
        var gcd = gcd(zaeler, nenner);
        zaeler /= gcd;
        nenner /= gcd;


        return nenner == 1 ?
                "" + zaeler : zaeler + "/" + nenner;
    }
}

