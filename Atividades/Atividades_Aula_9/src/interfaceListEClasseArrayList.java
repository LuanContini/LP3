import java.util.ArrayList;
import java.util.List;

public class interfaceListEClasseArrayList {
    public static void main(String[] args) {
        //Exercício: Crie uma lista de três cores. Exiba a cor armazenada no segundo índice.

        List<String> listaCor = new ArrayList<>();

        listaCor.add("Azul");
        listaCor.add("Vermelho");
        listaCor.add("Preto");

        System.out.println("A cor no segundo índice é: "+listaCor.get(1));
    }
}
