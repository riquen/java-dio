package avancado.dev;
import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class HttpCostumer {
    static ExecutorService executor = Executors.newFixedThreadPool(6, r -> {
        Thread thread = new Thread(r);
        System.out.println("Nova thread criada " + (thread.isDaemon() ? "daemon" : "") + " Thread Group: " + thread.getThreadGroup());
        return thread;
    });

    public static void main(String[] args) throws IOException, InterruptedException {
        http1();
    }

    private static void http1() {
        System.out.println("Running HTTP/1.1 example");
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();
            long start = System.currentTimeMillis();
            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code: " + response.statusCode());
            System.out.println("Headers: " + response.headers());
            String responseBody = response.body();
            System.out.println(response.body());

            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                           HttpRequest imgRqst = HttpRequest.newBuilder()
                                   .uri(URI.create("https://http2.akamai.com" + image))
                                   .build();
                            try {
                                HttpResponse<String> imgResponse = httpClient.send(imgRqst, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Imagem carregada: " + image + ", status code: " + imgResponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                e.printStackTrace();
                            }
                        });
                        future.add(imgFuture);
                        System.out.println("Submited images: " + image);
                    });

            future.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            });

            long end = System.currentTimeMillis();
            System.out.println("Tempo de carregamento total: " + (end - start) + "ms");
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
