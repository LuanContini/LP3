import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class interfaceIterator {
    public static void main(String[] args) {
        //Exercício: Implemente uma coleção de números inteiros.
        // Use um Iterator para percorrer a coleção e exibir cada número no console.

        Random random = new Random();
        List<Integer> listNumeros = new ArrayList<>();

        for (int i = 0; i < random.nextInt(5, 14); i++){
            listNumeros.add(random.nextInt(100));
        }
        Iterator<Integer> iterator = listNumeros.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
