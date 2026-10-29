import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExemplos {

    // Método chamado pelo App.java
    public static void executar() {
        System.out.println("\n#### MAP ####");

        System.out.println("\n=== 1. HashMap ===");
        exemploHashMap();

        System.out.println("\n=== 2. LinkedHashMap ===");
        exemploLinkedHashMap();

        System.out.println("\n=== 3. TreeMap ===");
        exemploTreeMap();

        System.out.println("\n=== 4. Hashtable ===");
        exemploHashtable();
    }

    // 1. HashMap: adicionar pares chave-valor e buscar pela chave
    static void exemploHashMap() {
        Map<String, Integer> idades = new HashMap<>();

        idades.put("Ana", 20);
        idades.put("Bruno", 25);
        idades.put("Carla", 22);
        idades.put("Ana", 21);              // chave repetida, substitui o valor

        System.out.println("Mapa (ordem não garantida): " + idades);
        System.out.println("Idade da Ana: " + idades.get("Ana"));
        System.out.println("Tem a chave Bruno? " + idades.containsKey("Bruno"));
        System.out.println("Chave inexistente: " + idades.get("Zeca"));     // null

        System.out.println("Percorrendo o mapa:");
        for (Map.Entry<String, Integer> par : idades.entrySet()) {
            System.out.println(" - " + par.getKey() + " -> " + par.getValue());
        }
    }

    // 2. LinkedHashMap: mantém a ordem de inserção das chaves
    static void exemploLinkedHashMap() {
        Map<String, String> capitais = new LinkedHashMap<>();

        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianópolis");
        capitais.put("PR", "Curitiba");

        System.out.println("Na ordem em que foram inseridos:");
        for (Map.Entry<String, String> par : capitais.entrySet()) {
            System.out.println(" - " + par.getKey() + " -> " + par.getValue());
        }
    }

    // 3. TreeMap: mantém as chaves ordenadas automaticamente
    static void exemploTreeMap() {
        TreeMap<Integer, String> ranking = new TreeMap<>();

        ranking.put(3, "Carla");
        ranking.put(1, "Ana");
        ranking.put(2, "Bruno");

        System.out.println("Ordenado pelas chaves: " + ranking);
        System.out.println("Primeira chave: " + ranking.firstKey());
        System.out.println("Última chave: " + ranking.lastKey());
    }

    // 4. Hashtable: versão antiga e sincronizada, não aceita null
    static void exemploHashtable() {
        Hashtable<String, Integer> tabela = new Hashtable<>();

        tabela.put("um", 1);
        tabela.put("dois", 2);
        tabela.put("três", 3);

        System.out.println("Hashtable: " + tabela);
        System.out.println("Valor de 'dois': " + tabela.get("dois"));

        try {
            tabela.put("nulo", null);       // não é permitido
        } catch (NullPointerException e) {
            System.out.println("Hashtable não aceita null: NullPointerException");
        }
    }
}