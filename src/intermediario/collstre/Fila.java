package intermediario.collstre;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Juliana");
        queue.add("Pedro");
        queue.add("Carlos");
        queue.add("Larissa");
        queue.add("João");

        for (String fila : queue) {
            System.out.println(fila);
        }

        System.out.println(queue.peek());
        System.out.println(queue.poll());

        queue.add("Daniel");
        System.out.println(queue.size());

        System.out.println(queue.isEmpty());
        System.out.println(queue.contains("Carlos"));
    }
}
