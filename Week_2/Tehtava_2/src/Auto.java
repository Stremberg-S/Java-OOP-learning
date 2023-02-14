import java.util.Calendar;
import java.util.Scanner;


public class Auto {
    private String rekisterinumero;
    private String merkki;
    private String malli;
    private int vuosimalli;

    Calendar cal = Calendar.getInstance();
    private final int currentYear = cal.get(Calendar.YEAR);


    public Auto() {
    }

    public Auto(String merkki, String malli, int vuosimalli) {
        this.merkki = merkki;
        this.malli = malli;
        this.vuosimalli = vuosimalli;
    }

    public Auto(String rekisterinumero, String merkki, String malli, int vuosimalli) {
        this.rekisterinumero = rekisterinumero;
        this.merkki = merkki;
        this.malli = malli;
        this.vuosimalli = vuosimalli;
    }


    public String getRekisterinumero() {
        return rekisterinumero;
    }

    public void setRekisterinumero(String rekisterinumero) {
        if (rekisterinumero.length() > 7 || !rekisterinumero.contains("-"))
            this.rekisterinumero = "unknown";
        else
            this.rekisterinumero = rekisterinumero;
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public String getMalli() {
        return malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    public int getVuosimalli() {
        return vuosimalli;
    }

    public void setVuosimalli(int vuosimalli) {
        if (vuosimalli < 1900 || vuosimalli > currentYear)
            this.vuosimalli = 1900;
        else
            this.vuosimalli = vuosimalli;
    }


    public void kysyTiedot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna rekisterinumero: ");
        setRekisterinumero(sc.nextLine().toUpperCase());
        System.out.println("Anna merkki: ");
        setMerkki(sc.nextLine());
        System.out.println("Anna malli: ");
        setMalli(sc.nextLine());
        while (true) {
            System.out.println("Anna vuosimalli: ");
            try {
                setVuosimalli(sc.nextInt());
            } catch (Exception ex) {
                System.out.println("Vain numerot käy");
                sc.nextLine();
                continue;
            }
            break;
        }
        sc.close();
    }


    @Override
    public String toString() {
        return "\nAuto: " +
                "rekisterinumero='" + rekisterinumero + '\'' +
                ", merkki='" + merkki + '\'' +
                ", malli='" + malli + '\'' +
                ", vuosimalli=" + vuosimalli;
    }
}
