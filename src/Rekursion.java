public class Rekursion {


    public static void main(String[] args) {


        var rechteck = new Rechteck();

        rechteck.start();


        System.out.println(zahlMinus1MitFragezeichen(432));
    }



















    public static int zahlMinus1MitFragezeichen(int zahl) {
        return zahl == 0 ?
                0 : zahl < 10 ?
                //                                      54321 -> 43210
                zahl - 1 : Integer.parseInt(zahlMinus1MitFragezeichen(zahl / 10) + String.valueOf(zahlMinus1MitFragezeichen(zahl % 10)));

    }

    //abc -> a-1b-1c-1

    public static int zahlMinus1(int zahl) {

        var resText = String.valueOf(zahl);

        var current = Integer.parseInt(resText.substring(0, 1)) - 1;
        var next = resText.substring(1);
        if (next.length() == 0) {
            return current;
        }

        return Integer.parseInt("" + current + zahlMinus1(Integer.parseInt(next)));
    }
}
