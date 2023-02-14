import java.util.Scanner;

public class OmatJaYhteisetTilit {
    public Saastotili omaTili;
    public SuperSaastotili yhteinenTili;


    public OmatJaYhteisetTilit() {
    }

    public OmatJaYhteisetTilit(Saastotili omaTili, SuperSaastotili yhteinenTili) {
        setOmaTili(omaTili);
        setYhteinenTili(yhteinenTili);
    }


    public Saastotili getOmaTili() {
        return omaTili;
    }

    public void setOmaTili(Saastotili omaTili) {
        this.omaTili = omaTili;
    }

    public SuperSaastotili getYhteinenTili() {
        return yhteinenTili;
    }

    public void setYhteinenTili(SuperSaastotili yhteinenTili) {
        this.yhteinenTili = yhteinenTili;
    }


    public void getTiedot() {
        Scanner sc = new Scanner(System.in);

        // OMA TILI:
        if (this.omaTili == null)
            this.omaTili = new Saastotili();

        System.out.print("\nAnna oman tilin tilinumero: ");
        this.omaTili.setTilinumero(sc.nextLine());
        System.out.print("Oman tilin omistaja: ");
        this.omaTili.setOmistaja(sc.nextLine());
        while (true) {
            try {
                System.out.print("Oman tilin saldo: ");
                this.omaTili.setSaldoEuroa(sc.nextDouble());
            } catch (Exception e) {
                System.out.println("\tVain numerot käy..");
                sc.nextLine();
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.print("Oman tilin korkoprosentti: ");
                this.omaTili.setVuosikorkoProsentti(sc.nextDouble());
            } catch (Exception e) {
                System.out.println("\tKoron pitää olla positiivinen numero..");
                sc.nextLine();
                continue;
            }
            break;
        }

        // YHTEINEN TILI:
        sc.nextLine();
        if (this.yhteinenTili == null)
            this.yhteinenTili = new SuperSaastotili();

        System.out.print("\nAnna yhteisen tilin tilinumero: ");
        this.yhteinenTili.setTilinumero(sc.nextLine());
        System.out.print("Yhteisen tilin omistaja: ");
        this.yhteinenTili.setOmistaja(sc.nextLine());
        while (true) {
            try {
                System.out.print("Yhteisen tilin saldo: ");
                this.yhteinenTili.setSaldoEuroa(sc.nextDouble());
            } catch (Exception e) {
                System.out.println("\tVain numerot käy..");
                sc.nextLine();
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.print("Yhteisen tilin korkoprosentti: ");
                this.yhteinenTili.setVuosikorkoProsentti(sc.nextDouble());
            } catch (Exception e) {
                System.out.println("\tKoron pitää olla positiivinen numero..");
                sc.nextLine();
                continue;
            }
            break;
        }
    }

    @Override
    public String toString() {
        return "\nOmat Ja Yhteiset Tilit : " +
                "\n\tOma: " + this.omaTili.getTilinumero() + " |" + getOmaTili() +
                "\n\tYhteinen: " + this.yhteinenTili.getTilinumero() + " |" + getYhteinenTili();
    }
}
