import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> henkilot = new ArrayList<>();
        char response, choice;


        while (true) {
            System.out.print("Syötetäänkö uuden henkilön tiedot (k/e)? ");
            response = sc.next().toLowerCase().charAt(0);
            if (response == 'e') {
                System.out.println("\tAsia selvä, mukavaa päivän jatkoa.");
                break;
            }
            if (response == 'k') {
                while (true) {
                    System.out.print("Onko henkilö opiskelija vai henkilökuntaa (o/h)? :");
                    choice = sc.next().toLowerCase().charAt(0);

                    if (choice == 'o') {
                        Opiskelija o = new Opiskelija();
                        o.getHenkilonTiedot();
                        henkilot.add(o);
                        System.out.println("\tOpiskelija lisätty..\n");
                        break;
                    } else if (choice == 'h') {
                        Henkilokunta henk = new Henkilokunta();
                        henk.getHenkilonTiedot();
                        henkilot.add(henk);
                        System.out.println("\tHenkilökuntaa lisätty..\n");
                        break;
                    }
                }
            }
        }
        sc.close();

        // TULOSTUS
        if (henkilot.size() > 0) {
            System.out.println("\nOpiskelijat: ");
            for (Object o : henkilot) {
                if (o instanceof Opiskelija)
                    System.out.println(o);
            }
            System.out.println("\nHenkilökunta: ");
            for (Object o : henkilot) {
                if (o instanceof Henkilokunta)
                    System.out.println(o);
            }
        }
    }
}
