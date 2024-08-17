import java.util.ArrayList;
import java.util.List;

public class iterable {
	public static void main(String[] args) {
		//Exercício: Implemente uma coleção personalizada que seja iterável, e itere sobre seus elementos usando um loop for-each.

		List<Integer> lista = new ArrayList<>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		for (Integer i : lista){
			System.out.println("lista: " +i);
		}

	}
}
