public class ZahlenAddierer {

    public static void main(String[] args) {
        System.out.println(addiere(9637));
    }

    //3+2+2+1

    public static int addiere(int zahlenreihe) {
        //1234567 = 1+2+2+3+3+4+4+5+5+6+7+7 = 34568101111314

        var string = String.valueOf(zahlenreihe);
        var result = "";
for (int i = 0; i <= string.length()-1; i++) {
            result += Integer.toString(Integer.parseInt(String.valueOf(string.charAt(i)))+Integer.parseInt(String.valueOf(string.charAt(i+1))));
        }
        return Integer.parseInt(result);



    }
}
