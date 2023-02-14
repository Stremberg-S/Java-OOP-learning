public class Tietokone extends Tuote {
    private String _merkki;
    private String _malli;


    public Tietokone() {
    }

    public Tietokone(final String merkki, final String malli) {
        setMerkki(merkki);
        setMalli(malli);
    }

    public Tietokone(final String tuotenro, final String merkki, final String malli) {
        super(tuotenro);
        setMerkki(merkki);
        setMalli(malli);
    }

    public Tietokone(final String tuotenro, final int tuotepaikka, final int maara,
                     final String merkki, final String malli) {
        super(tuotenro, tuotepaikka, maara);
        setMerkki(merkki);
        setMalli(malli);
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


    @Override
    public int getTuotepaikka() {
        return super.getTuotepaikka();
    }


    @Override
    public String toString() {
        return "Tuote - " +
                getMerkki() + " " + getMalli() + " " + super.toString();
    }
}
