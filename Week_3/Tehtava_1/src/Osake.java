import java.util.Scanner;


public class Osake {
    private String _nimi;
    private double _ostohinta;

    public static final Scanner sc = new Scanner(System.in);

    public Osake() {
    }

    public Osake(String nimi, double ostohinta) {
        this();
        setNimi(nimi);
        setOstohinta(ostohinta);
    }


    public String getNimi() {
        return _nimi;
    }

    public void setNimi(String nimi) {
        this._nimi = nimi;
    }

    public double getOstohinta() {
        return _ostohinta;
    }

    public void setOstohinta(double ostohinta) {
        this._ostohinta = ostohinta;
    }


    public void getTiedot() {
        System.out.print("Osakkeen nimi: ");
        setNimi(sc.nextLine());
        while (true) {
            try {
                System.out.print("Osakkeen ostohinta: ");
                setOstohinta(sc.nextDouble());
                sc.nextLine();
            } catch (Exception ex) {
                System.out.println("Vain numerot käy!");
                sc.nextLine();
                continue;
            }
            break;
        }
    }

    public double TulostaArvo(double vuosiKasvuProsentti, int ajanjakso) {
        double arvo = getOstohinta();

        if (ajanjakso < 0)
            return 0;
        for (int i = 0; i < ajanjakso; i++) {
            arvo += LaskeTuottoYhdelleVuodelle(arvo, vuosiKasvuProsentti);
        }
        System.out.printf("\nOsakken %s arvo: %5.2f ", getNimi(), arvo);
        return arvo;
    }

    private double LaskeTuottoYhdelleVuodelle(double arvo, double kasvu) {
        return (arvo * kasvu) / 100.0;
    }

    @Override
    public String toString() {
        return "Osake - " + getNimi() +
                ", ostohinta: " + getOstohinta();
    }
}
