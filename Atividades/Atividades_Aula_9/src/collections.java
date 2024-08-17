import java.util.ArrayList;
import java.util.List;

public class collections {
    public static void main(String[] args) {
        //Exercício: Crie uma lista de strings, ordene-a em ordem decrescente usando Collections.reverseOrder() e exiba a lista.

        List<String> lista = new ArrayList<>();

        lista.add("Abelha");
        lista.add("Besouro");
        lista.add("Carrapato");
        lista.add("Escaravelho");

        java.util.Collections.sort(lista, java.util.Collections.reverseOrder());

        System.out.println("Lista em ordem decrescente: "+lista);

    }
}
