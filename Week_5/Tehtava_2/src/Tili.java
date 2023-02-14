public abstract class Tili {
    protected String _tilinumero;
    protected String _omistaja;
    protected double _saldoEuroa;
    protected double _vuosikorkoProsentti;


    public Tili() {
    }

    public Tili(String tilinumero, String omistaja, double saldoEuroa, double vuosikorkoProsentti) {
        setTilinumero(tilinumero);
        setOmistaja(omistaja);
        setSaldoEuroa(saldoEuroa);
        setVuosikorkoProsentti(vuosikorkoProsentti);
    }


    public String getTilinumero() {
        return _tilinumero;
    }

    public void setTilinumero(String tilinumero) {
        this._tilinumero = tilinumero;
    }

    public String getOmistaja() {
        return _omistaja;
    }

    public void setOmistaja(String omistaja) {
        this._omistaja = omistaja;
    }

    public double getSaldoEuroa() {
        return _saldoEuroa;
    }

    public void setSaldoEuroa(double saldoEuroa) {
        this._saldoEuroa = saldoEuroa;
    }

    public double getVuosikorkoProsentti() {
        return _vuosikorkoProsentti;
    }

    public void setVuosikorkoProsentti(double vuosikorkoProsentti) {
        if (vuosikorkoProsentti < 0)
            throw new ArithmeticException("Negatiivinen vuosikorko");
        else
            this._vuosikorkoProsentti = vuosikorkoProsentti;
    }


    public abstract double laskeVuosikorkoTuotto();

    public abstract void tulostaTilinTiedot();

    @Override
    public String toString() {
        return " " + getOmistaja() +
                ", Saldo: " + getSaldoEuroa() +
                ", VuosikorkoProsentti: " + getVuosikorkoProsentti();
    }
}
