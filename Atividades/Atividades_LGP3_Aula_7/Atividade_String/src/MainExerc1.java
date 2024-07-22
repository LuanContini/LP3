import java.util.Scanner;

public class MainExerc1 {
	public static void main(String[] args) {
		/*
	 	i.Criar um programa que verifica se uma string é um palíndromo.
		 * */
		
		 Scanner scanner = new Scanner(System.in);
		 
		 String talvezPalindromo = "";
		 System.out.println("Digite uma palavra: ");
		 String palavra = scanner.nextLine();
		 
		 
			for(int i = palavra.length(); i > 0; i--) {
				talvezPalindromo += palavra.charAt(i-1);
				
			}
			
			if(talvezPalindromo.equals(palavra)) {
				System.out.println("A palavra é um palíndromo");
			}
			else {
				System.out.println("A palavra não é um palindromo\n Palavra: "+palavra+"\nPalavra ao contrário: "+talvezPalindromo);
			}
		}
}

