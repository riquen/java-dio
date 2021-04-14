package intermediario.pratica;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercicio5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String password;

        while ((password = br.readLine()) != null) {
            boolean tamCorreto = password.length() >= 6 && password.length() <= 32;
            boolean charEspec = !password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$");
            boolean contNumber = false;
            boolean contUpperCase = false;
            boolean contLowerCase = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    contNumber = true;
                } else if (Character.isUpperCase(password.charAt(i))) {
                    contUpperCase = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    contLowerCase = true;
                }
            }

            if (tamCorreto && !charEspec && contNumber && contUpperCase && contLowerCase) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}
