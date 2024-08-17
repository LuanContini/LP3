import java.util.HashSet;
import java.util.Set;

public class interfaceSetHashSetLinkedHashSet {
    public static void main(String[] args) {
        //Exercício: Crie um conjunto usando LinkedHashSet que armazene os nomes de três frutas.
        // Adicione uma fruta duplicada e observe como a ordem de inserção é preservada.

        Set<String> setFruta = new HashSet<>();

        setFruta.add("Pera");
        setFruta.add("Tomate");
        setFruta.add("Abacaxi");

        setFruta.add("Abacaxi");
        setFruta.add("Pera");

        System.out.println("HashSet: "+setFruta);
    }
}
