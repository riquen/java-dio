package intermediario.collstre;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> listaOne = new ArrayList<>();
        listaOne.add("Juliana");
        listaOne.add("Pedro");
        listaOne.add("Carlos");
        listaOne.add("Larissa");
        listaOne.add("João");

        for (String nome : listaOne) {
            System.out.println(nome);
        }

        listaOne.set(2, "Roberto");
        System.out.println(listaOne.get(2));

        listaOne.remove(3);
        System.out.println(listaOne);
        listaOne.remove("João");
        System.out.println(listaOne);
        System.out.println(listaOne.size());

        System.out.println(listaOne.contains("Juliano"));

        List<String> listaTwo = new ArrayList<>();
        listaTwo.add("Ismael");
        listaTwo.add("Rodrigo");
        System.out.println(listaTwo);

        listaOne.addAll(listaTwo);
        Collections.sort(listaOne);
        System.out.println(listaOne);

        System.out.println(listaOne.isEmpty());
    }
}
