import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ohjelma, joka kysyy n:än kuukauden tulot ja laskee sekä tulostaa näytölle tuloista yhteenlasketun tulon,
 * keskitulon kuukautta kohti, sekä suurimman kuukausikohtaisen tulon.
 * Jos syötetty kuukausitulo on negatiivinen, ohjelma tulostaa kysytyt arvot ja päättää toimintansa.
 */

public class Teht3 {
    public static void main(String[] args) {
        int counter = 1;
        double kuukaudenTulo, kokoTulo, keskiarvo, maxTulo;
        ArrayList<Double> tulot = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Anna kuukausikohtaiset tulot: ");
        System.out.println("(Negatiivinen luku lopettaa ohjelman)\n");

        while (true) {
            System.out.println("Anna " + counter + " kuukauden tulo : ");
            kuukaudenTulo = sc.nextDouble();

            if (kuukaudenTulo < 0)
                break;
            else {
                tulot.add(kuukaudenTulo);
                counter++;
            }
        }
        sc.close();

        kokoTulo = tulot.stream()
                .mapToDouble(a -> a)
                .sum();
        maxTulo = Collections.max(tulot);
        keskiarvo = kokoTulo / tulot.size();

        System.out.printf("\nKokonaistulot ovat %5.1f \n", kokoTulo);
        System.out.printf("Keskiarvoinen kuukausikohtainen tulo on %5.1f \n", keskiarvo);
        System.out.printf("Suurin kuukausikohtainen tulo on %5.1f \n", maxTulo);
    }
}