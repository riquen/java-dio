package basico.dev;

public class EmbDesemb {
    public static void main(String[] args) {
        Carro carro = new Carro(5);
        System.out.println("Há " + carro.getQtdePax() + " pessoas no carro.");
        carro.setQtdePax(carro.getQtdePax() - 2);
        System.out.println("Desceram 2 pessoas, restando " + (carro.getQtdePax()) + " pessoas no carro.");
        carro.setQtdePax(carro.getQtdePax() + 1);
        System.out.println("Entrou 1 pessoa, agora há " + (carro.getQtdePax()) + " pessoas no carro.");
    }
}
