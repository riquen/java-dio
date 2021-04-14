package intermediario.pratica;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Exercicio1 {
    protected static Map<String, Integer> ocorPalavra;
    protected static Map<Character, String> abrev;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String line;

        while (!".".equals((line = br.readLine()))) {
            StringTokenizer st = new StringTokenizer(line);
            ocorPalavra = new HashMap<>();
            abrev = new TreeMap<>();
            while (st.hasMoreTokens()) {
                String nextWord = st.nextToken();
                if (nextWord.length() <= 2) continue;
                ocorPalavra.put(nextWord, ocorPalavra.containsKey(nextWord) ? ocorPalavra.get(nextWord) + 1 : 1);
                abrev.put(nextWord.charAt(0), palavraMaisAbreviada(nextWord));
            }
            imprimirSaida(line);
        }
    }

    private static String palavraMaisAbreviada(String nextWord) {
        if (!abrev.containsKey(nextWord.charAt(0))) {
            return nextWord;
        }
        int reducaoChar = ocorPalavra.get(nextWord) * (nextWord.length() - 2);
        String abrevAtual = abrev.get(nextWord.charAt(0));
        int reducaoAtual = ocorPalavra.get(abrevAtual) * (abrevAtual.length() - 2);
        return reducaoChar > reducaoAtual ? nextWord : abrevAtual;
    }

    private static void imprimirSaida(String line) {
        List<String> lista = new ArrayList<>();
        for (Character c : abrev.keySet()) {
            String palavraAbrev = abrev.get(c);
            line = line.replaceAll("\\b" + palavraAbrev + "\\b", " " + c + ". ");
            lista.add(c + ". = " + palavraAbrev);
        }
        System.out.println(line.trim());
        System.out.println(lista.size());
        lista.forEach(System.out::println);
    }
}
