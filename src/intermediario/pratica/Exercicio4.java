package intermediario.pratica;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String nextWord;

        while ((nextWord = br.readLine()) != null) {
            boolean repeat = false;
            for (int i = 0; i < nextWord.length(); i++) {
                if (nextWord.substring(0, i).endsWith(nextWord.substring(i))) {
                    System.out.println(nextWord.substring(0, i));
                    repeat = true;
                }
            }
            if (!repeat)
                System.out.println(nextWord);
        }
    }
}
