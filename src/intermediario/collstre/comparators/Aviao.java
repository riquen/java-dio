package intermediario.collstre.comparators;

public class Aviao implements Comparable<Aviao> {
    private final String modelo;
    private final Integer autonomia;

    public Aviao(String modelo, Integer autonomia) {
        this.modelo = modelo;
        this.autonomia = autonomia;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    @Override
    public String toString() {
        return modelo + " -> " + autonomia + "nm";
    }
    @Override
    public int compareTo(Aviao o) {
        return this.getAutonomia() - o.getAutonomia();
    }
}
