import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        BroadcomMikrofoni broadcomSpeac = new BroadcomMikrofoni();
        SamsungMikrofoni samsungSpeac = new SamsungMikrofoni();

        BroadcomKaiutin broadcomMic = new BroadcomKaiutin();
        QualcommKaiutin qualcommMic = new QualcommKaiutin();

        Puhelin phone = new Puhelin();
        System.out.println(phone);


        // VALITAAN MIKROFONI:
        while (true) {
            System.out.println("\nValitse mikrofoni: ");
            System.out.println("1 = Broadcom\n2 = Samsung");
            choice = sc.next().toLowerCase().charAt(0);

            if (choice == '1') {
                phone.setMikrofoni(broadcomSpeac);
                break;
            } else if (choice == '2') {
                phone.setMikrofoni(samsungSpeac);
                break;
            }
        }

        // VALITAAN KAIUTIN:
        while (true) {
            System.out.println("Valitse kaiutin: ");
            System.out.println("1 = Broadcom\n2 = Qualcomm");
            choice = sc.next().toLowerCase().charAt(0);

            if (choice == '1') {
                phone.setKaiutin(broadcomMic);
                break;
            } else if (choice == '2') {
                phone.setKaiutin(qualcommMic);
                break;
            }
        }
        System.out.println(phone);

        // VOLUMEN SÄÄTÖ
        while (true) {
            while (true) {
                try {
                    phone.getMikrofoni().micOn();
                    System.out.print("\nmikin volume: ");
                    phone.getMikrofoni().setVolume(sc.nextInt());
                } catch (Exception e) {
                    System.out.println("\tVain numerot käy..");
                    sc.next();
                    continue;
                }
                break;
            }
            while (true) {
                try {
                    phone.getKaiutin().unMute();
                    System.out.print("kaiuttimen volume: ");
                    phone.getKaiutin().setVolume(sc.nextInt());
                } catch (Exception e) {
                    System.out.println("\tVain numerot käy..");
                    sc.next();
                    continue;
                }
                break;
            }
            if (phone.getKaiutin().getVolume() == 0 && phone.getMikrofoni().getVolume() == 0)
                break;
            System.out.println(phone);
        }
        sc.close();
        System.out.println("_________________________________________________");
        System.out.println(phone);
    }
}
