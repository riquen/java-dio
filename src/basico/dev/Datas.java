package basico.dev;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {
        Date nasc = new Date(798111617000L);
        Date dio = new Date(1273935600000L);

        if (nasc.after(dio)) {
            System.out.println("A data de nascimento é depois da data informada.");
        }
        System.out.println("A data de nascimento é antes da data informada.");
    }
}
