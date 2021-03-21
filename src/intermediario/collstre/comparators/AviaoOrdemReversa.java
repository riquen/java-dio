package intermediario.collstre.comparators;
import java.util.Comparator;

public class AviaoOrdemReversa implements Comparator<Aviao> {
    @Override
    public int compare(Aviao o1, Aviao o2) {
        return o2.getAutonomia() - o1.getAutonomia();
    }
}
