package avancado.dev;
import java.util.function.Function;

public class InfLambda {
    public static void main(String[] args) {
        Function<Integer, Double> divisao = (var numero) -> numero / 2.0;
        System.out.println(divisao.apply(84684));
    }
}
