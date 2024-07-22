import java.util.Scanner;

public class MainExerc3 {

	public static void main(String[] args) {
		/*
		iii.Desenvolver um programa que encontre a primeira ocorrência de um caractere em uma string.
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int lugar = 0;
		
		 System.out.println("Digite uma palavra: ");
		 String palavra = scanner.nextLine();
		 
		 System.out.println("Digite um caractere: ");
		 char caractere = scanner.next().charAt(0);
		 
		 for(int i = 0; i < palavra.length(); i++) {
			 char atual = palavra.charAt(i);
			 if(atual == caractere) {
				 lugar = i + 1;
				 break;
			 }
		 }
		 
		 if(lugar > 0) {
			 System.out.println("A posiçao que o caracter "+caractere+" aparece na palavra "+palavra+" é: "+lugar);
		 }
		 else {
			 System.out.println("O caracter "+caractere+" não aparece na palavra: "+palavra);
		 }
		 
	}
}
