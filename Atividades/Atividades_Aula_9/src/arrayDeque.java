import java.util.ArrayDeque;
import java.util.Deque;

public class arrayDeque {
	public static void main(String[] args) {
			//Exercício: Implemente uma fila usando ArrayDeque e adicione três elementos.
			//Em seguida, remova e exiba o primeiro elemento inserido.

		Deque<String> fila =  new ArrayDeque<>();

		fila.push("Macaco");
		fila.push("Elefante");
		fila.push("Leão");

		System.out.println("O primeiro elemento era: "+ fila.pop());
	}
}
