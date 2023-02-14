public class SuperSaastotili extends Tili {

    public SuperSaastotili() {
    }

    public SuperSaastotili(String tilinumero, String omistaja, double saldoEuroa, double vuosikorkoProsentti) {
        super(tilinumero, omistaja, saldoEuroa, vuosikorkoProsentti);
    }


    @Override
    public double laskeVuosikorkoTuotto() {
        double vuosiKorkoTuotto = 0;
        if (_saldoEuroa >= 0 && _saldoEuroa <= 10000)
            vuosiKorkoTuotto = _saldoEuroa * _vuosikorkoProsentti / 100;
        else if (_saldoEuroa > 10000) {
            _vuosikorkoProsentti += 3.0;
            vuosiKorkoTuotto = _saldoEuroa * _vuosikorkoProsentti / 100;
        }
        return vuosiKorkoTuotto;
    }

    @Override
    public void tulostaTilinTiedot() {
        System.out.printf("\n%s: Supersäästötilin saldo on %.2f €, " +
                        "korkoprosentilla %.1f " +
                        "vuosikorko on " + laskeVuosikorkoTuotto() + "€\n",
                _omistaja, _saldoEuroa, _vuosikorkoProsentti);
    }
}
