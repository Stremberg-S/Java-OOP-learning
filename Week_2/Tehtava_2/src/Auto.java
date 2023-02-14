import java.util.Calendar;
import java.util.Scanner;


public class Auto {
    private String _rekisterinumero;
    private String _merkki;
    private String _malli;
    private int _vuosimalli;

    Calendar cal = Calendar.getInstance();
    private final int currentYear = cal.get(Calendar.YEAR);


    public Auto() {
    }

    public Auto(String merkki, String malli, int vuosimalli) {
        this();
        setMerkki(merkki);
        setMalli(malli);
        setVuosimalli(vuosimalli);
    }

    public Auto(String rekisterinumero, String merkki, String malli, int vuosimalli) {
        this(merkki, malli, vuosimalli);
        setRekisterinumero(rekisterinumero);
    }


    public String getRekisterinumero() {
        return _rekisterinumero;
    }

    public void setRekisterinumero(String rekisterinumero) {
        if (rekisterinumero.length() > 7 || !rekisterinumero.contains("-"))
            this._rekisterinumero = "unknown";
        else
            this._rekisterinumero = rekisterinumero;
    }

    public String getMerkki() {
        return _merkki;
    }

    public void setMerkki(String merkki) {
        this._merkki = merkki;
    }

    public String getMalli() {
        return _malli;
    }

    public void setMalli(String malli) {
        this._malli = malli;
    }

    public int getVuosimalli() {
        return _vuosimalli;
    }

    public void setVuosimalli(int vuosimalli) {
        if (vuosimalli < 1900 || vuosimalli > currentYear)
            this._vuosimalli = 1900;
        else
            this._vuosimalli = vuosimalli;
    }


    public void kysyTiedot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Anna rekisterinumero: ");
        setRekisterinumero(sc.nextLine().toUpperCase());
        System.out.print("Anna merkki: ");
        setMerkki(sc.nextLine());
        System.out.print("Anna malli: ");
        setMalli(sc.nextLine());
        while (true) {
            System.out.print("Anna vuosimalli: ");
            try {
                setVuosimalli(sc.nextInt());
            } catch (Exception ex) {
                System.out.println("\tVain numerot käy");
                sc.nextLine();
                continue;
            }
            break;
        }
        sc.close();
    }

    @Override
    public String toString() {
        return "\nAuto - " +
                "rekisterinumero: " + getRekisterinumero() +
                ", merkki: " + getMerkki() +
                ", malli: " + getMalli() +
                ", vuosimalli: " + getVuosimalli();
    }
}
