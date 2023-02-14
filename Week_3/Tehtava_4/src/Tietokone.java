import java.util.Scanner;


public class Tietokone {
    private String _merkki;
    private String _malli;
    private String _sarjanumero;

    public Tietokone() {
    }

    public Tietokone(String merkki, String malli) {
        this();
        setMerkki(merkki);
        setMalli(malli);
    }

    public Tietokone(String merkki, String malli, String sarjanumero) {
        this(merkki, malli);
        setSarjanumero(sarjanumero);
    }

    public Tietokone(Tietokone tietokone) {
        this._merkki = tietokone._merkki;
        this._malli = tietokone._malli;
        this._sarjanumero = tietokone._sarjanumero;
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

    public String getSarjanumero() {
        return _sarjanumero;
    }

    public void setSarjanumero(String sarjanumero) {
        this._sarjanumero = sarjanumero;
    }

    public void getTietokoneTiedot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tietokonen merkki: ");
        setMerkki(sc.nextLine());
        System.out.print("Tietokonen malli: ");
        setMalli(sc.nextLine());
        System.out.print("Tietokonen sarjanumero: ");
        setSarjanumero(sc.nextLine());
    }

    @Override
    public String toString() {
        return " Tietokone: {" + getMerkki() + " " + getMalli() +
                ", sarjanum = " + getSarjanumero() +
                "} ";
    }
}
