public class Binaerdarstellung {


    /* Iterative Möglichkeit:  public static int getDezimalFromBinary(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }*/


    public static long gibWertVonBinaer(long binaerdarstellung) {
        if (binaerdarstellung == 0) {
            return 0;
        } else {
            return binaerdarstellung % 10 + 2 * gibWertVonBinaer(binaerdarstellung / 10);
        }


    }


    public static void main(String[] args) {
    }
}

