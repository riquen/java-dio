package basico.dev;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Vencimento {
    public static void main(String[] args) {
        Calendar vencimento = Calendar.getInstance();
        vencimento.set(2021, Calendar.MARCH, 25);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        if (vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            vencimento.add(Calendar.DATE, 2);
        } else if (vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            vencimento.add(Calendar.DATE, 1);
        }
        System.out.println("A data de vencimento é " + formato.format(vencimento.getTime()));

        vencimento.add(Calendar.DATE, 10);
        if (vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            vencimento.add(Calendar.DATE, 2);
        } else if (vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            vencimento.add(Calendar.DATE, 1);
        }
        System.out.println("O limite para pagamento é " + formato.format(vencimento.getTime()));
    }
}
