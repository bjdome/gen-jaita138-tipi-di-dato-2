
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crea il tuo cliente personalizzato: ");

        System.out.println("Inserisci il nome: ");
        String nome = sc.nextLine();

        System.out.println("Inserisci il cognome: ");
        String cognome = sc.nextLine();

        System.out.println("Inserisci la data di nascita (dd/MM/yyyy): ");
        String dataNascitaStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascita = LocalDate.parse(dataNascitaStr, formatter);

        System.out.println("Inserisci il numero di telefono: ");
        String numeroTelefono = sc.nextLine();

        System.out.println("Inserisci l'email: ");
        String email = sc.nextLine();

        System.out.println("Inserisci un username: ");
        String username = sc.nextLine();

        System.out.println("Inserisci la password: ");
        String password = sc.nextLine();

        System.out.println("Inserisci la data e l'ora di iscrizione (dd/MM/yyyy HH:mm): ");
        String dataIscrizioneStr = sc.nextLine();
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataIscrizione = LocalDateTime.parse(dataIscrizioneStr, formatterTime);

        System.out.println("Inserisci le note: ");
        String note = sc.nextLine();

        sc.close();

        System.out.println("Il piatto che hai definito e': ");
        System.out.println("Nome: " + nome + "\n" + "Cognome: " + cognome + "\n" + "Data di nascita: " + dataNascita + "\n" + "Numero di telefono: "
                + numeroTelefono + "\n" + "Email: " + email + "\n" + "username: " + username + "\n" + "password: " + password + "\n"
                + "Data iscrizione: " + dataIscrizione + "\n" + "Note: " + note);
    }
}
