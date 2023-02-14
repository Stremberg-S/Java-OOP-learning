public class Saastotili extends Tili {

    public Saastotili() {
    }

    public Saastotili(String tilinumero, String omistaja, double saldoEuroa, double vuosikorkoProsentti) {
        super(tilinumero, omistaja, saldoEuroa, vuosikorkoProsentti);
    }


    @Override
    public double laskeVuosikorkoTuotto() {
        return _saldoEuroa * _vuosikorkoProsentti / 100;
    }

    @Override
    public void tulostaTilinTiedot() {
        System.out.printf("\n%s: Säästötilin saldo on %.2f €, " +
                        "korkoprosentilla %.1f " +
                        "vuosikorko on " + laskeVuosikorkoTuotto() + "€\n",
                _omistaja, _saldoEuroa, _vuosikorkoProsentti);
    }
}
