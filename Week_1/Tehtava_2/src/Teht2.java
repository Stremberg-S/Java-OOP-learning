import java.util.Objects;
import java.util.Scanner;

/**
 * Ohjelma, joka kysyy käyttäjältä suorakaiteen leveyden, korkeuden, piirtomerkin ja sen,
 * tulostetaanko se täytettynä vai ei. Ohjelma tulostaa sitten "suorakaiteen" annetulla merkillä.
 * Tässäkin ojhjelma saa katua jos numeerinen syöte on annettu väärin.
 */

public class Teht2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna korkeus : ");
        int height = sc.nextInt();

        System.out.println("Anna leveys : ");
        int width = sc.nextInt();

        System.out.println("Anna piirtomerkki : ");
        String sign = sc.next();

        System.out.println("Taytetty vai ei (k = kylla, e = ei)");
        String choice = sc.next();
        sc.close();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // täytetty kuvio
                if (Objects.equals(choice, "k"))
                    System.out.print(sign);
                // ei täytetty kuvio
                if (Objects.equals(choice, "e")) {
                    if (i == 0 || i == height - 1)
                        System.out.print(sign);
                    else {
                        if (j == 0 || j == width - 1)
                            System.out.print(sign);
                        else
                            System.out.print(' ');
                    }
                }
            }
            System.out.print("\n\r");
        }
    }
}