public class BMW {


    private int ps;
    private final int tueren;
    private String farbe;

    public static final int MAX_PS = 1000;

    public BMW(int ps, int tueren, String farbe) {
        this.ps = ps;
        this.tueren = tueren;
        this.farbe = farbe;
    }

    public BMW() {
        tueren = 0;
    }

    public BMW(int ps, int tueren) {
        this.ps = ps;
        this.tueren = tueren;
        farbe = "rot";
    }

    public static void motorStarten() {
        System.out.println("Motor startet");
    }


    public static void main(String[] args) {
        var x1 = new BMW(100, 4, "rot");
        var x2 = new BMW(130, 2, "türkies");
        var x3 = new BMW();

        x1.equals(x2);

        x1.motorStarten();

    }

}
