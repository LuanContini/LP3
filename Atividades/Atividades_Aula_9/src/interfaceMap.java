import java.util.HashMap;
import java.util.Map;

public class interfaceMap {
    public static void main(String[] args) {
        //Exercício: Crie um mapa que armazene três pares de chave-valor representando nomes de pessoas e suas idades.
        // Exiba a idade de uma pessoa específica.

        Map<String, Integer> mapNomeIdade = new HashMap<>();

        mapNomeIdade.put("Marcelo", 34);
        mapNomeIdade.put("Roberta", 23);
        mapNomeIdade.put("João", 90);

        System.out.println("A idade de João é de "+mapNomeIdade.get("João")+" anos");
    }
}
