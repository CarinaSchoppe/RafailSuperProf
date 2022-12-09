public class ProzedualeErhoehung {


    public static float erhoehe(float betrag, int prozent) {
        if (prozent == 0) {
            return betrag;
        } else {
            //round to 2 dezimal digits
            /*
            * 1000.123456 | *100 < 2 kommastellen
            * 100012.6456 | round ab 5 round up
            * 100013 | /100 > 2 kommastellen
            * 1000.13
            * */

            return (float) (Math.round((betrag + betrag * prozent / 100.0) * 100.0) / 100.0);
        }
    }

    public static void main(String[] args) {
        System.out.println(erhoehe(113.4563F,32 ));

        System.out.println(12345%10);
    }
}
