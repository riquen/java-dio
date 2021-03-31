package avancado.core;
import avancado.utils.Calculadora;

public class Modular {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(7, 3));
        System.out.println(calculadora.sub(7, 2));
        System.out.println(calculadora.mult(7, 4));
        System.out.println(calculadora.div(70, 5));
    }
}
