package basico.problemas;
import java.util.Scanner;

public class MinhaSegundaClasse {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int E = leitor.nextInt();
        int[] X = new int[E];
        int menor = 0, posMenor = 0;

        for (int i = 0; i < E; i++) {
            X[i] = leitor.nextInt();
            if (i == 0) {
                menor = X[i];
                posMenor = i;
            } else if (X[i] < menor) {
                menor = X[i];
                posMenor = i;
            }
        }
        System.out.println("Menor valor = " + menor);
        System.out.println("Posicao: " + posMenor);
    }
}
