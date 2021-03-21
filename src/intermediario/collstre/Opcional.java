package intermediario.collstre;
import java.util.Optional;

public class Opcional {
    public static void main(String[] args) {
        Optional<String> aviao = Optional.of("King Air");

        aviao.ifPresentOrElse(System.out::println,
                () -> System.out.println("Vazio."));

        aviao.map((modelo) -> modelo.concat(" - B200")).ifPresent(System.out::println);
    }
}
