import java.util.Scanner;

/**
 * Ohjelma, joka kysyy käyttäjältä yhden osakkeen nimen (merkkijono),
 * osinkotuottoprosentin yhdelle vuodelle (desimaali) ja sijoitettava rahamäärän(kokonaisluku).
 * Sitten ohjelma tulostaa alla olevaan tapaan lauseen, jossa se käyttää näitä tietoja.
 * Ohjelma saa kaatua, jos numeerinen syöte ei ole annettu oikein.
 */


public class Teht1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String osake;
        float osinkoPros, tuotto;
        int sijoitus;

        System.out.println("Anna osake : ");
        osake = sc.nextLine();
        while (true) {
            try {
                System.out.println("Anna osinkoprosentti : ");
                osinkoPros = sc.nextFloat();
            } catch (Exception e) {
                System.out.println("\tVain numerot käy.. ");
                sc.next();
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.println("Anna sijoitus : ");
                sijoitus = sc.nextInt();
            } catch (Exception e) {
                System.out.println("\tVain numerot käy.. ");
                sc.next();
                continue;
            }
            break;
        }
        tuotto = sijoitus * (osinkoPros / 100);
        sc.close();

        System.out.printf("Osakkeen %s tuotto pääomalle %d on %5.2f \n", osake, sijoitus, tuotto);
    }
}