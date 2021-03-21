package basico.dev;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {
        LocalDateTime momento = LocalDateTime.of(2010, 5, 15, 10, 0);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime futuro = momento.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println("Momento = " + formato.format(momento));
        System.out.println("Futuro = " + formato.format(futuro));
    }
}
