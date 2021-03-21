package basico.dev;

public class DadosMoto {
    public static void main(String[] args) {
        Moto moto = new Moto("BMW", "S1000RR", 2021);
        System.out.println("Qual moto devo comprar?");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
    }
}
