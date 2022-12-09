public class WurzelTest {


    public static boolean isWurzel(int wurzel, long quadrat){

        if (quadrat == 0) {
            return true;
        } else {
            return (long) wurzel*wurzel == Math.abs(quadrat);
        }
    }

    public static void main(String[] args) {
        System.out.println(isWurzel(3, -9));
    }
}
