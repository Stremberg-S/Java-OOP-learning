public class Main {
    public static void main(String[] args) {
        Saastotili st = new Saastotili(
                "1234567",
                "Henkilo X",
                500,
                3.5);
        SuperSaastotili sst = new SuperSaastotili(
                "1234568",
                "Henkilo Y",
                10001,
                3.6);
        st.tulostaTilinTiedot();
        sst.tulostaTilinTiedot();


        OmatJaYhteisetTilit tilit = new OmatJaYhteisetTilit();
        tilit.getTiedot();
        System.out.println(tilit);
    }
}