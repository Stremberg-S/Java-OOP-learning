import java.util.ArrayList;
import java.util.Objects;

public class Opiskelijat {
    public ArrayList<Opiskelija> opiskelijat = new ArrayList<>();


    public void addOpiskelijaToList(Opiskelija o) {
        opiskelijat.add(o);
    }

    public void removeOpiskelijaFromList(Opiskelija o) {
        opiskelijat.remove(o);
    }

    // Tulostaa konsoliin listan opiskelijat tietystä kaupungista
    public void tulostaAsukkaat(String kaupunki) {
        System.out.println("\nKaupungissa olevat opiskelijat:");
        for (Opiskelija o : opiskelijat) {
            if (Objects.equals(o.osoiteTiedot.getPostitoimipaikka(), kaupunki)) {
                System.out.println(o);
            }
        }
    }

    // Tulostaa konsoliin kaikki listassa olevat opiskelijat
    public void tulostaOpiskelijat() {
        System.out.println("Kaikki opiskelijat: ");
        for (Opiskelija o : opiskelijat) {
            System.out.println(o);
        }
    }
}

