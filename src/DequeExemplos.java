import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExemplos {

    // Método chamado pelo App.java
    public static void executar() {
        System.out.println("\n#### DEQUE ####");

        System.out.println("\n=== 1. ArrayDeque ===");
        exemploArrayDeque();

        System.out.println("\n=== 2. LinkedList ===");
        exemploLinkedList();
    }

    // 1. ArrayDeque: adicionar e remover nas duas pontas
    static void exemploArrayDeque() {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("B");        // início: B
        deque.addFirst("A");        // início: A, B
        deque.addLast("C");         // fim: A, B, C
        deque.addLast("D");         // fim: A, B, C, D
        System.out.println("Deque: " + deque);

        System.out.println("Primeiro: " + deque.peekFirst());
        System.out.println("Último: " + deque.peekLast());

        System.out.println("Removeu do início: " + deque.pollFirst());     // A
        System.out.println("Removeu do fim: " + deque.pollLast());         // B
        System.out.println("Deque agora: " + deque);
    }

    // 2. LinkedList como Deque: também permite operar nas duas pontas
    static void exemploLinkedList() {
        Deque<String> deque = new LinkedList<>();

        deque.offerFirst("meio");
        deque.offerFirst("início");
        deque.offerLast("fim");
        System.out.println("Deque: " + deque);

        System.out.println("Removeu do início: " + deque.removeFirst());    // início
        System.out.println("Removeu do fim: " + deque.removeLast());        // fim
        System.out.println("Deque agora: " + deque);
    }
}