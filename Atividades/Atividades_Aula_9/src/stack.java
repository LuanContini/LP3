import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		//Exercício: Crie uma pilha de strings usando Stack e adicione três elementos.
		// Remova o topo da pilha e exiba o elemento removido.

		Stack<String> pilha = new Stack<>();

		pilha.push("Macarronada");
		pilha.push("Pizza");
		pilha.push("Hamburger");

		System.out.println("O elemento no topo da pilha era: "+ pilha.pop());
	}
}
