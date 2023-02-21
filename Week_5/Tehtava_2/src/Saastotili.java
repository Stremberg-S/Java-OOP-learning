public class Saastotili extends Tili {

    public Saastotili() {
    }

    public Saastotili(String tilinumero, String omistaja, double saldoEuroa, double vuosikorkoProsentti) {
        super(tilinumero, omistaja, saldoEuroa, vuosikorkoProsentti);
    }


    @Override
    public double laskeVuosikorkoTuotto() {
        return getSaldoEuroa() * getVuosikorkoProsentti() / 100;
    }

    @Override
    public void tulostaTilinTiedot() {
        System.out.printf("\n%s: Säästötilin saldo on %.2f €, " +
                        "korkoprosentilla %.1f " +
                        "vuosikorko on " + laskeVuosikorkoTuotto() + "€\n",
                getOmistaja(), getSaldoEuroa(), getVuosikorkoProsentti());
    }
}
