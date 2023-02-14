public class Teht3 {
    public static void main(String[] args) {
        Opiskelija op = new Opiskelija();

        op.getAllInformation();
        if (OpiskelijaUtils.TarkastaTiedot(op) == null) {
            System.out.println("\nVirhe tietojen syötössä: ");
            OpiskelijaUtils.printVirheet(OpiskelijaUtils.virheet);
            OpiskelijaUtils.virheet.clear();
        } else
            System.out.println("\n" + op);
    }
}
