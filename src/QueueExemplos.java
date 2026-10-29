import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExemplos {

    // Método chamado pelo App.java
    public static void executar() {
        System.out.println("\n#### QUEUE ####");

        System.out.println("\n=== 1. PriorityQueue ===");
        exemploPriorityQueue();

        System.out.println("\n=== 2. LinkedList ===");
        exemploLinkedList();
    }

    // 1. PriorityQueue: os elementos saem por ordem de prioridade
    // (por padrão, o menor valor tem a maior prioridade)
    static void exemploPriorityQueue() {
        Queue<Integer> fila = new PriorityQueue<>();

        fila.offer(30);
        fila.offer(10);
        fila.offer(20);
        fila.offer(5);

        System.out.println("Próximo a sair (peek): " + fila.peek());

        System.out.println("Removendo com pol():");
        while (!fila.isEmpty()) {
            System.out.println(" - saiu: " + fila.poll());
        }
    }

    // 2. LinkedList como Queue: ordem FIFO (primeiro a entrar, primeiro a sair)
    static void exemploLinkedList() {
        Queue<String> fila = new LinkedList<>();

        fila.offer("Cliente 1");
        fila.offer("Cliente 2");
        fila.offer("Cliente 3");
        System.out.println("Fila: " + fila);

        System.out.println("Próximo da fila (peek): " + fila.peek());
        System.out.println("Atendido (poll): " + fila.poll());  // Cliente 1
        System.out.println("Atendido (poll): " + fila.poll());  // Cliente 2
        System.out.println("Fila agora: " + fila);
    }
}