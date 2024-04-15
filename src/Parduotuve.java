import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parduotuve {
    Scanner scanner = new Scanner(System.in);
    public List<Zaislas> parduotuvesZaislai = new ArrayList<>();
    public List<Zaislas> krepselis = new ArrayList<>();

    Lele barbe = new Lele("Barbe", "Disney", "8", 25.99, Sukuosena.TIESUS);
    Lele barbe1 = new Lele("Barbe1", "Disney", "8", 22.99, Sukuosena.TIESUS);
    Lele barbe2 = new Lele("Barbe2", "Disney", "8", 21.99, Sukuosena.TIESUS);

    Konstruktorius konstruktorius = new Konstruktorius("Erdvelaivis","Lego", "10", 49.99, 250);
    Konstruktorius konstruktorius1 = new Konstruktorius("Erdvelaivis1","Lego", "10", 55.99, 350);
    Konstruktorius konstruktorius2 = new Konstruktorius("Erdvelaivis2","Lego", "10", 58.99, 450);


    public void pridetiZaisla(){
        System.out.println("Koki zaisla pridesite? 1=Lele, 2=Konstruktorius: ");
        int pasirinkimas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Koks pavadinimas?");
        String pavadinimas = scanner.nextLine();
        System.out.println("Koks gamintojas?");
        String gamintojas = scanner.nextLine();
        System.out.println("Kokia kaina?");
        double kaina = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Kokia amziaus riba?");
        String amziausRiba = scanner.nextLine();
        if (pasirinkimas == 1){

            System.out.println("Kokia sukuosena? 1=Garbanotas, 2=Tiesus, 3=Kirpciukai");
            int sukuosenosPasiinkimas = scanner.nextInt();
            scanner.nextLine();
            Sukuosena sukuosena = Sukuosena.GARBANOTA;
            switch (sukuosenosPasiinkimas){
                case 1:
                    sukuosena = Sukuosena.GARBANOTA;
                    break;
                case 2:
                    sukuosena = Sukuosena.TIESUS;
                    break;
                case 3:
                    sukuosena = Sukuosena.KIRPCIUKAI;
                default:
                    System.out.println("Blogas pasirinkimas");
            }
            Lele lele = new Lele(pavadinimas, gamintojas, amziausRiba, kaina, sukuosena);
            parduotuvesZaislai.add(lele);
            System.out.println("Preke prideta: " + zaisloInfo(lele) + "|" + sukuosena);

        }if (pasirinkimas == 2){
            System.out.println("Kiek detaliu?");
            int detales = scanner.nextInt();
            scanner.nextLine();
            Konstruktorius konstruktorius = new Konstruktorius(pavadinimas, gamintojas, amziausRiba, kaina, detales);
            parduotuvesZaislai.add(konstruktorius);
            System.out.println("Preke prideta: " + zaisloInfo(konstruktorius) + "|" + detales);
        }


    }

    public void paimtiZaisla(){
        System.out.println("Iveskite zaislo pavadinima.");
        String koksZaislas = scanner.nextLine();
        for (Zaislas z : parduotuvesZaislai){
            if (z.getPavadinimas().equals(koksZaislas)){
                parduotuvesZaislai.remove(z);
                System.out.println("Paimta lele: " + zaisloInfo(z));
                return;
            }
        }
        System.out.println("Tokios leles nera.");

    }
    public void pridetiIKrepseli(){
        System.out.println("Iveskite zaislo pavadinima.");
        String koksZaislas = scanner.nextLine();
        for (Zaislas z : parduotuvesZaislai){
            if (z.getPavadinimas().equals(koksZaislas)){
                parduotuvesZaislai.remove(z);
                krepselis.add(z);
                System.out.println("Paimta lele: " + zaisloInfo(z));
                return;
            }


        }
        System.out.println("Tokios leles neturime.");
    }
    public void skaiciuotiKaina(){
        double kaina = 0;
        for (Zaislas z : krepselis){
            kaina = kaina + z.getKaina();
        }
        System.out.println("Jusu bendra zaislu kaina yra: " + kaina + "Eur");
    }
    public String zaisloInfo(Zaislas z){

            return z.getPavadinimas() + "|" + z.getGamintojas() + "|" + z.getKaina() + "|" + z.getAmziausRiba();


    }
    public void valdymas(){
        System.out.println("Esate parduotuves darbuotojas(1) ar klientas(2)?");
        int a = scanner.nextInt();
        scanner.nextLine();
        if (a == 1){
            System.out.println("Norite prideti(1) ar paiimt(2) zaisla?");
            int b = scanner.nextInt();
            scanner.nextLine();
            if (b == 1){
                pridetiZaisla();
            }
            else if (b == 2) {
                paimtiZaisla();
            }else{
                System.out.println("Kazkas negerai.");
            }

        } else if (a == 2) {
            pridetiIKrepseli();
            int c = 1;
            while (c == 1){
                System.out.println("Norite prideti dar(1) ar suzinoti kaina(2)?");
                c = scanner.nextInt();
                scanner.nextLine();
                if (c==1){
                    pridetiIKrepseli();
                }else{
                    skaiciuotiKaina();
                }
            }


        }

    }
}
