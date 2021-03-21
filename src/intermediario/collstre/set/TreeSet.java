package intermediario.collstre.set;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new java.util.TreeSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);

        for (int numero : numeros) {
            System.out.println(numero);
        }
        numeros.remove(3);
        numeros.add(23);
        System.out.println(numeros);

        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());
    }
}
