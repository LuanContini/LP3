import java.util.ArrayList;
import java.util.Collection;

public class interfaceCollection {
    public static void main(String[] args) {
        //Exercício: Implemente uma coleção usando a interface Collection e adicione cinco números inteiros.
        // Em seguida, exiba o número total de elementos.

        Collection<Integer> colecao = new ArrayList<>();

        colecao.add(3);
        colecao.add(5);
        colecao.add(42);
        colecao.add(453);
        colecao.add(23);

        System.out.println("Quantidade de elementos dentro da coleção: "+colecao.size());
    }
}
