import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		//Exercício: Crie um Vector de inteiros e adicione quatro elementos. Exiba o conteúdo do vetor.

		Vector<Integer> vetor = new Vector<>();

		vetor.add(1);
		vetor.add(3);
		vetor.add(75);
		vetor.add(42);
		vetor.add(11);

		System.out.println("Vetor: "+ vetor);
	}
}
