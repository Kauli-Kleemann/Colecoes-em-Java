import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExemplos {

    // Método chamado pelo App.java
    public static void executar() {
        System.out.println("#### LIST ####");

        System.out.println("\n=== 1. ArrayList ===");
        exemploArrayList();

        System.out.println("\n=== 2. LinkedList ===");
        exemploLinkedList();

        System.out.println("\n === 3. Vector ===");
        exemploVector();

        System.out.println("\n=== 4. Stack ===");
        exemploStack();
    }

    // 1. ArrayList: adicionar e acessar elementos pelo índice
    static void exemploArrayList() {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Ana");   // duplicados são permitidos

        System.out.println("Lista: " + nomes);
        System.out.println("Elemento no índice 0: " + nomes.get(0));
        System.out.println("Elemento no índice 2: " + nomes.get(2));
        System.out.println("Tamanho: " + nomes.size());
    }

    // 2. LinkedList: adicionar e remover elementos
    static void exemploLinkedList() {
        LinkedList<String> tarefas = new LinkedList<>();

        tarefas.add("Estudar");
        tarefas.add("Treinar");
        tarefas.addFirst("Acordar");    // adiciona no início
        tarefas.addLast("Dormir");      // adiciona no fim
        System.out.println("Lista: " + tarefas);

        tarefas.remove("Treinar");      // remove pelo valor
        tarefas.removeFirst();          // remove o primeiro
        System.out.println("Após remover: " + tarefas);
    }

    // 3. Vector: armazenar e percorrer elementos
    static void exemploVector() {
        Vector<Integer> numeros = new Vector<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Percorrendo com for-each:");
        for (int n : numeros) {
            System.out.println(" - " + n);
        }

        System.out.println("Percorrendo com for tradicional:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(" - posição " + i + ": " + numeros.get(i));
        }
    }

    // 4. Stack: empilhar e desempilhar (princípio LIFO)
    static void exemploStack() {
        Stack<String> pilha = new Stack<>();

        pilha.push("Primeiro");     // empilha
        pilha.push("Segundo");
        pilha.push("Terceiro");
        System.out.println("Pilha: " + pilha);

        System.out.println("Topo (peek): " + pilha.peek());
        System.out.println("Desempilhou: " + pilha.pop());      // Terceiro
        System.out.println("Desempilhou: " + pilha.pop());      // Segundo
        System.out.println("Pilha agora: " + pilha);
    }
}