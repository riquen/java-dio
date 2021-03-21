package intermediario.collstre.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Modelos {
    public static void main(String[] args) {
        List<Aeronave> aeronaves = new ArrayList<>();
        aeronaves.add(new Aeronave("King Air", "B200"));
        aeronaves.add(new Aeronave("Embraer", "Praetor 600"));
        aeronaves.add(new Aeronave("Cessna", "Citation"));
        aeronaves.add(new Aeronave("Robinson", "R66"));
        aeronaves.add(new Aeronave("Agusta", "A109"));
        aeronaves.add(new Aeronave("Eurocopter", "Dolphin"));
        aeronaves.add(new Aeronave("Dassault", "Falcon 2000"));

        aeronaves.forEach(System.out::println);
        System.out.println("Modelo com 600: " + aeronaves.stream().filter(modelos ->
                modelos.toLowerCase().contains("600")).collect(Collectors.toList()));
    }
}
