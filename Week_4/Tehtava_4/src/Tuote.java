public class Tuote {
    private String _tuotenumero;
    private int _tuotepaikka;
    private int _maara;


    public Tuote() {
    }

    public Tuote(final String tuotenro) {
        setTuotenumero(tuotenro);
    }

    public Tuote(String tuotenro, final int tuotepaikka, final int maara) {
        this(tuotenro);
        setTuotepaikka(tuotepaikka);
        setMaara(maara);
    }


    public String getTuotenumero() {
        return _tuotenumero;
    }

    public void setTuotenumero(String tuotenro) {
        this._tuotenumero = tuotenro;
    }

    public int getTuotepaikka() {
        return _tuotepaikka;
    }

    public void setTuotepaikka(int tuotepaikka) {
        this._tuotepaikka = tuotepaikka;
    }

    public int getMaara() {
        return _maara;
    }

    public void setMaara(int maara) {
        this._maara = maara;
    }


    @Override
    public String toString() {
        return "| tuotenumero: " + getTuotenumero() +
                ", tuotepaikka: " + getTuotepaikka() +
                ", maara: " + getMaara();
    }
}
