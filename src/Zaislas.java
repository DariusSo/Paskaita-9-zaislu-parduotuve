public class Zaislas {
    private String pavadinimas;
    private String gamintojas;
    private String amziausRiba;
    private double kaina;

    public Zaislas(String pavadinimas, String gamintojas, String amziausRiba, double kaina) {
        this.pavadinimas = pavadinimas;
        this.gamintojas = gamintojas;
        this.amziausRiba = amziausRiba;
        this.kaina = kaina;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }

    public String getGamintojas() {
        return gamintojas;
    }

    public String getAmziausRiba() {
        return amziausRiba;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public void setGamintojas(String gamintojas) {
        this.gamintojas = gamintojas;
    }

    public void setAmziausRiba(String amziausRiba) {
        this.amziausRiba = amziausRiba;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }
}
