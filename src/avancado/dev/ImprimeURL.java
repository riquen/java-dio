package avancado.dev;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ImprimeURL {
    public static void main(String[] args) throws IOException, InterruptedException {
        printURL();
    }

    private static void printURL() throws IOException, InterruptedException {
        HttpRequest requisicao = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://http2.akamai.com"))
                .build();

        HttpClient httpCliente = HttpClient.newHttpClient();

        HttpResponse<String> response = httpCliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code: " + response.statusCode());
        System.out.println("Headers: " + response.headers());
        System.out.println(response.body());
    }
}
