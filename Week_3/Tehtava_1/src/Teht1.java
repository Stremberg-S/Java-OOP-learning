import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Teht1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Osake> osakkeet = new ArrayList<>();

        String choice = Utils.getChoice(sc);
        double kasvuProsentti = 0.0, kokoTuotto = 0;
        int ajanjakso = 0;

        while (!Objects.equals(choice, "e")) {
            Osake o = new Osake();
            o.getTiedot();
            osakkeet.add(o);

            while (kasvuProsentti == 0.0) {
                System.out.print("Anna kasvuprosentti: ");
                kasvuProsentti = Utils.parsedDoubleFromSC(sc);
            }
            while (ajanjakso == 0) {
                System.out.print("Anna ajanjakso vuosina: ");
                ajanjakso = Utils.parsedIntFromSC(sc);
            }

            for (Osake osake : osakkeet) {
                kokoTuotto += osake.TulostaArvo(kasvuProsentti, ajanjakso);
                System.out.println();
            }
            System.out.println(kokoTuotto);
            choice = Utils.getChoice(sc);
        }
        sc.close();
        System.out.println("\nKiitos ja hei hei!");
    }
}