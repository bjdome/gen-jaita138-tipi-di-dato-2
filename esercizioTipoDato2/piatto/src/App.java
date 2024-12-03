
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crea il tuo piatto personalizzato: ");

        System.out.println("Inserisci il nome: ");
        String nome = sc.nextLine();

        System.out.println("Inserisci la descrizione: ");
        String descrizione = sc.nextLine();

        System.out.println("Inserisci il prezzo: ");
        double prezzo = sc.nextDouble();

        System.out.println("Inserisci \"true\" se il piatto e' disponibile o \"false\" se non lo e': ");
        boolean disponibile = sc.nextBoolean();

        //Inserire un menu a tendina in front-end
        System.out.println("Inserisci la tipologia: ");
        byte tipologia = sc.nextByte();
        sc.nextLine();

        System.out.println("Inserisci gli allergeni: ");
        String allergeni = sc.nextLine();

        System.out.println("Inserisci il percorso file della foto: ");
        String foto = sc.nextLine();

        System.out.println("Inserisci le calorie: ");
        short calorie = sc.nextShort();
        sc.nextLine();

        System.out.println("Inserisci le variazioni: ");
        String variazioni = sc.nextLine();

        sc.close();

        System.out.println("Il piatto che hai definito e': ");
        System.out.println("Nome: " + nome + "\n" + "Descrizione: " + descrizione + "\n" + "Prezzo: " + prezzo + "\n" + "Disponibile: "
                + disponibile + "\n" + "Tipologia: " + tipologia + "\n" + "Allergeni: " + allergeni + "\n" + "Tipologia: " + tipologia
                + "\n" + "Allergeni: " + allergeni + "\n" + "Percorso file foto: " + foto + "\n" + "Calorie: " + calorie + "\n" + "Variazioni: " + variazioni);
    }
}
