public class Konstruktorius extends Zaislas{
    public int detaliuSkaicius;

    public Konstruktorius(String pavadinimas, String gamintojas, String amziausRiba, double kaina, int detalesSkaicius) {
        super(pavadinimas, gamintojas, amziausRiba, kaina);
        this.detaliuSkaicius = detalesSkaicius;
    }
}
