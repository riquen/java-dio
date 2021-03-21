package basico.dev;

public class Moto {
    private final String marca, modelo;
    private final Integer ano;

    public Moto(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Integer getAno() {
        return ano;
    }
}
