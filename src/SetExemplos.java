import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExemplos {
    // Método chamado pelo App.java
    public static void executar() {
        System.out.println("\n#### SET ####");

        System.out.println("\n=== 1. HashSet ===");
        exemploHashSet();

        System.out.println("\n=== 2. LinkedHashSet ===");
        exemploLinkedHashSet();

        System.out.println("\n=== 3. TreeSet ===");
        exemploTreeSet();
    }

    // 1. HashSet: adicionar elementos e ver que duplicados são ignorados
    static void exemploHashSet() {
        Set<String> cidades = new HashSet<>();

        System.out.println("Adicionou Porto Alegre? " + cidades.add("Porto Alegre"));
        System.out.println("Adicionou Novo Hamburgo? " + cidades.add("Novo Hamburgo"));
        System.out.println("Adicionou Canoas? " + cidades.add("Canoas"));
        System.out.println("Adicionou Porto Alegre de novo? " + cidades.add("Porto Alegre"));   // false

        System.out.println("Conjunto (ordem não garantida): " + cidades);
        System.out.println("Tamanho: " + cidades.size());
        System.out.println("Contém Canoas? " + cidades.contains("Canoas"));
    }

    // 2. LinkedHashSet: sem duplicados e mantendo a ordem de inserção
    static void exemploLinkedHashSet() {
        Set<String> linguagens = new LinkedHashSet<>();

        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("JavaScript");
        linguagens.add("Java");         // ignorado, já existe

        System.out.println("Na ordem em que foram inseridos:");
        for (String l : linguagens) {
            System.out.println(" - " + l);
        }
    }

    // 3. TreeSet: sem duplicados e com os elementos ordenados automaticamente
    static void exemploTreeSet() {
        Set<Integer> notas = new TreeSet<>();

        notas.add(8);
        notas.add(3);
        notas.add(10);
        notas.add(5);
        notas.add(3);                   // ignorado, já existe

        System.out.println("Notas ordenada: " + notas);

        TreeSet<Integer> arvore = (TreeSet<Integer>) notas;
        System.out.println("Menor nota: " + arvore.first());
        System.out.println("Maior nota: " + arvore.last());
    }
}