package intermediario.pratica;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N != 0) {
            List<String> conj = new ArrayList<>();
            for (int i = 0; i < N; i++)
                conj.add(br.readLine());

            conj = conj.stream().sorted().collect(Collectors.toList());

            String saida = "Conjunto Bom";
            for (int i = 0; i < N - 1; i++) {
                if (conj.get(i + 1).startsWith(conj.get(i))) {
                    saida = "Conjunto Ruim";
                    break;
                }
            }
            System.out.println(saida);
            N = Integer.parseInt(br.readLine());
        }
    }
}
