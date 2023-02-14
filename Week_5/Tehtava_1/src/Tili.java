public abstract class Tili {
    protected String _tilinumero = "123 456 789";
    protected String _omistaja = "Sergei Stremberg";
    protected double _saldoEuroa = 10001;
    protected double _vuosikorkoProsentti = 4.5;


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
        this._vuosikorkoProsentti = vuosikorkoProsentti;
    }


    public abstract double laskeVuosikorkoTuotto();

    public abstract void tulostaTilinTiedot();

    @Override
    public String toString() {
        return "Tili - " + getOmistaja() +
                "Saldo: " + getSaldoEuroa() +
                ", VuosikorkoProsentti: " + getVuosikorkoProsentti();
    }
}
