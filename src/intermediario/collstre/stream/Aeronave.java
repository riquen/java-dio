package intermediario.collstre.stream;

public class Aeronave {
    private final String marca;
    private final String modelo;

    public Aeronave(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return marca + " - " + modelo;
    }

    public String toLowerCase() {
        return marca + " - " + modelo;
    }
}
