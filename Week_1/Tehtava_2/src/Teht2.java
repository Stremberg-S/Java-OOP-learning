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
        int height, width;
        String sign, choice;

        while (true) {
            try {
                System.out.println("Anna korkeus : ");
                height = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Vain numerot käy..");
                sc.next();
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.println("Anna leveys : ");
                width = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Vain numerot käy..");
                sc.next();
                continue;
            }
            break;
        }
        System.out.println("Anna piirtomerkki : ");
        sign = sc.next();

        System.out.println("Taytetty vai ei (k = kylla, e = ei)");
        choice = sc.next();
        sc.close();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // FILLED
                if (Objects.equals(choice, "k"))
                    System.out.print(sign);
                // NOT FILLED
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