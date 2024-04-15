public class Lele extends Zaislas{
    public Sukuosena sukuosena;


    public Lele(String pavadinimas, String gamintojas, String amziausRiba, double kaina, Sukuosena sukuosena) {
        super(pavadinimas, gamintojas, amziausRiba, kaina);
        this.sukuosena = sukuosena;
    }

    public Sukuosena getSukuosena() {
        return sukuosena;
    }
}
