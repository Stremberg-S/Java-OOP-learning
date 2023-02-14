import java.util.Scanner;


public class Oppilas {
    private final int MAX_WEEKPOINTS = 16;
    private final int MAX_EXAMPOINTS = 20;

    private String _nimi;
    private int _weekPoints;
    private int _examPoints;
    private double _arvosana;


    public Oppilas() {
    }

    public Oppilas(String nimi, int weekPoints, int examPoints, double arvosana) {
        this();
        setNimi(nimi);
        setWeekPoints(weekPoints);
        setExamPoints(examPoints);
        setArvosana(arvosana);
    }


    public String getNimi() {
        return _nimi;
    }

    private void setNimi(String nimi) {
        this._nimi = nimi;
    }

    public int getWeekPoints() {
        return _weekPoints;
    }

    private void setWeekPoints(int weekPoints) {
        if (weekPoints <= 0)
            this._weekPoints = 0;
        else this._weekPoints = Math.min(weekPoints, MAX_WEEKPOINTS);
    }

    public int getExamPoints() {
        return _examPoints;
    }

    private void setExamPoints(int examPoints) {
        if (examPoints <= 0)
            this._examPoints = 0;
        else this._examPoints = Math.min(examPoints, MAX_EXAMPOINTS);
    }

    public double getArvosana() {
        return _arvosana;
    }

    private void setArvosana(double arvosana) {
        this._arvosana = arvosana;
    }


    public void kysyTiedot() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Anna nimi: ");
            setNimi(sc.nextLine());
        } while (getNimi().length() == 0);
        while (true) {
            try {
                System.out.print("Anna viikkotehtävien tehtäväpisteet (0-16) : ");
                setWeekPoints(sc.nextInt());
            } catch (Exception ex) {
                System.out.println("\tVain numerot käy..");
                sc.nextLine();
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.print("Anna kokeen pisteet (0-20) : ");
                setExamPoints(sc.nextInt());
            } catch (Exception ex) {
                System.out.println("\tVain numerot käy..");
                sc.nextLine();
                continue;
            }
            break;
        }
    }

    private void laskeArvosana() {
        if (getExamPoints() < 10) setArvosana(0);
        else if (getExamPoints() < 12) setArvosana(1);
        else if (getExamPoints() < 14) setArvosana(2);
        else if (getExamPoints() < 16) setArvosana(3);
        else if (getExamPoints() < 18) setArvosana(4);
        else setArvosana(5);

        if (getArvosana() > 0 && ((double) getWeekPoints() / MAX_WEEKPOINTS) >= 0.75)
            setArvosana(+1);
        if (getArvosana() > 5) setArvosana(5);
    }

    @Override
    public String toString() {
        laskeArvosana();
        return "Oppilas - " +
                "Nimi: " + getNimi() +
                ", Viikkotehtavien pisteet: " + getWeekPoints() +
                ", Kokeen pisteet: " + getExamPoints() +
                ", Arvosana: " + getArvosana();
    }
}
