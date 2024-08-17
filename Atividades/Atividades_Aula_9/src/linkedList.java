import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        //Exercício: Crie uma LinkedList de strings e adicione três elementos.
        // Adicione um elemento no início da lista e exiba a lista completa.

        LinkedList<String> listaLigada = new LinkedList<>();

        listaLigada.add("Placa-Mãe");
        listaLigada.add("Cooler");
        listaLigada.add("RAM");

        listaLigada.addFirst("Processador");

        System.out.println("Lista ligada: "+listaLigada);
    }
}
