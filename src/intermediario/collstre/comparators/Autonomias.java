package intermediario.collstre.comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Autonomias {
    public static void main(String[] args) {
        List<Aviao> avioes = new ArrayList<>();
        avioes.add(new Aviao("B787", 7305));
        avioes.add(new Aviao("A380", 8207));
        avioes.add(new Aviao("B747", 7262));
        avioes.add(new Aviao("A350", 8261));
        avioes.add(new Aviao("G700", 7500));
        avioes.add(new Aviao("Global 8000", 7900));
        avioes.add(new Aviao("7X", 5949));

        avioes.sort((first, second) -> second.getAutonomia() - first.getAutonomia());
        System.out.println("Reversa");
        System.out.println(avioes);

        avioes.sort(Comparator.comparingInt(Aviao::getAutonomia));
        System.out.println("Natural - mf");
        System.out.println(avioes);

        avioes.sort(Comparator.comparingInt(Aviao::getAutonomia).reversed());
        System.out.println("Reversa - mf");
        System.out.println(avioes);

        Collections.sort(avioes);
        System.out.println("Natural - Comparable");
        System.out.println(avioes);

        avioes.sort(new AviaoOrdemReversa());
        System.out.println("Reversa - Comparator");
        System.out.println(avioes);
    }
}
