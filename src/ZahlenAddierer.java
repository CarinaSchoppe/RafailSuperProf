public class ZahlenAddierer {


    //3+2+2+1

    public static long addiere(int zahlenreihe) {
        //1234567 = 1+2+2+3+3+4+4+5+5+6+7+7 = 34568101111314

        var string = String.valueOf(zahlenreihe);
        var result = "";
        for (int i = 0; i <= string.length() - 1; i++) {
            result += Integer.toString(Integer.parseInt(String.valueOf(string.charAt(i))) + Integer.parseInt(String.valueOf(string.charAt(i + 1))));
        }
        return Integer.parseInt(result);
    }

    /*
     * var = 12345999999999999999999999999999999999999999999999999
     * if länge = 1 -> var (weil wir dann nur eine einzige zahl haben als eingabe)
     * var -> text -> value = addiere die erste und 2te zahl -> (1+2)
     * wenn text-länge == 2
     * sonst -> wandle in zahl um -> wiederhole_alles mit -> text (1->n)
     *
     * */
    public static long addiereRekursiv(int zahlenreihe) {
        //kurzform: zahlenreihe = Math.abs(zahlenreihe);
        if (zahlenreihe < 10) {
            if (zahlenreihe >= 0)
                return zahlenreihe;
            return addiereRekursiv(zahlenreihe * -1);
        } else {
            var reihe = String.valueOf(zahlenreihe);
            long valueOfTwo = Long.parseLong(reihe.substring(0, 1)) + Long.parseLong(reihe.substring(1, 2));
            if (reihe.length() == 2) {
                return valueOfTwo;
            } else {
                return Long.parseLong("" + valueOfTwo + addiereRekursiv(Integer.parseInt(reihe.substring(1))));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(-99999);
    }
}
