import java.util.Scanner;


public class Oppilas {
    private final int MAX_WEEKPOINTS = 16;
    private final int MAX_EXAMPOINTS = 20;

    public String nimi;
    public int weekPoints;
    public int examPoints;
    private double arvosana;


    public Oppilas() {
    }


    public String getNimi() {
        return nimi;
    }

    private void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getWeekPoints() {
        return weekPoints;
    }

    private void setWeekPoints(int weekPoints) {
        if (weekPoints <= 0)
            this.weekPoints = 0;
        else this.weekPoints = Math.min(weekPoints, MAX_WEEKPOINTS);
    }

    public int getExamPoints() {
        return examPoints;
    }

    private void setExamPoints(int examPoints) {
        if (examPoints <= 0)
            this.examPoints = 0;
        else this.examPoints = Math.min(examPoints, MAX_EXAMPOINTS);
    }

    public double getArvosana() {
        return arvosana;
    }

    private void setArvosana(double arvosana) {
        this.arvosana = arvosana;
    }


    public void kysyTiedot() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Anna nimi: ");
            setNimi(sc.nextLine());
        } while (nimi.length() == 0);
        while (true) {
            try {
                System.out.println("Anna viikkotehtävien tehtäväpisteet (0-16) : ");
                setWeekPoints(sc.nextInt());
            } catch (Exception ex) {
                System.out.println("Vain numerot kelpaa, kiitos!");
                sc.nextLine();
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.println("Anna kokeen pisteet (0-20) : ");
                setExamPoints(sc.nextInt());
            } catch (Exception ex) {
                System.out.println("Vain numerot kelpaa, kiitos!");
                sc.nextLine();
                continue;
            }
            break;
        }
    }

    private void laskeArvosana() {
        if (examPoints < 10) arvosana = 0;
        else if (examPoints < 12) arvosana = 1;
        else if (examPoints < 14) arvosana = 2;
        else if (examPoints < 16) arvosana = 3;
        else if (examPoints < 18) arvosana = 4;
        else arvosana = 5;

        if (arvosana > 0 && ((double) weekPoints / MAX_WEEKPOINTS) >= 0.75)
            arvosana++;
        if (arvosana > 5) arvosana = 5;
    }


    @Override
    public String toString() {
        laskeArvosana();
        return "Oppilas: {" +
                "Nimi = '" + nimi + '\'' +
                ", Viikkotehtavien pisteet = " + weekPoints +
                ", Kokeen pisteet = " + examPoints +
                ", Arvosana = " + arvosana +
                '}';
    }
}