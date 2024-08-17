import java.util.Arrays;

public class arrays {
	public static void main(String[] args) {
		//Exercício: Crie um array de strings, ordene-o e busque por um elemento específico usando Arrays.binarySearch().
		
		String[] palavras = {"Cachorro", "Gato", "Vaca", "Marmota", "Lontra", "Urso"};
		
		int index = Arrays.binarySearch(palavras, "Vaca");
		
		System.out.println("O index da palavra: "+ palavras[index] +" é "+ index);
	}
}
