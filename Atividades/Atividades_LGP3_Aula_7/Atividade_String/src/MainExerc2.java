import java.util.Scanner;

public class MainExerc2 {
	public static void main(String[] args) {
		/*
		ii.Escrever um programa que conte o número de vogais em uma string.
		iii.Desenvolver um programa que encontre a primeira ocorrência de um caractere em uma string.
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int vogais = 0;
		
		 System.out.println("Digite uma palavra: ");
		 String palavra = scanner.nextLine();
		 
		 for(int i = 0; i < palavra.length(); i++) {
			 char atual = palavra.charAt(i);
			 if(atual == 'a' || atual == 'e' || atual == 'i' || atual == 'o' || atual == 'u') {
				 vogais++;
			 }
		 }
		 
		 System.out.println("O número de vogais na palavra "+palavra+" é de: "+vogais);
	}

}
