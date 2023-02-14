public class Teht1 {
    public static void main(String[] args) {
        Opiskelija o1 = new Opiskelija("Sergei Stremberg", "Kuopiontie 7 A 7",
                "01.03.89", 12345, "11.08.2021");
        Opiskelija o2 = new Opiskelija("Toinen Henkilö", "Randomkatu x",
                "00.00.11", 77, "01.02.2003");
//
        Henkilokunta henk1 = new Henkilokunta("Ensimmäinen Jäsen", "Koulutie 1",
                "11.12.1970", "T1234", "Kuopio", "Opettaja");
        Henkilokunta henk2 = new Henkilokunta("Toinen Jäsen", "Koulutie 7",
                "22.11.1985", "T1235", "Kuopio", "Apu-Opettaja");


        System.out.println("\nOpiskelijat: ");
        o1.tulostaOpiskelija();
        o2.tulostaOpiskelija();
//
        System.out.println("\nHenkilökunta: ");
        henk1.tulostaHenkilokunta();
        henk2.tulostaHenkilokunta();

    }
}