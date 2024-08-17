package interfaceComparableComparatorPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class interfaceComparableComparator {
    public static void main(String[] args) {
        //Exercício: Crie uma classe Produto que implementa Comparable para ordenar produtos por preço.
        // Em seguida, crie um Comparator para ordenar produtos por nome.
        // Ordene uma lista de produtos por preço e depois por nome, exibindo a lista em cada caso.

        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Coca-cola", 9));
        listaProdutos.add(new Produto("Pepsi", 8));
        listaProdutos.add(new Produto("Guaraná Antártica", 8.5));
        listaProdutos.add(new Produto("Tubaína", 7.99));

        for (Produto produto : listaProdutos)
            System.out.println("Nome: "+produto.nome+"\nPreço: "+produto.preco);

        System.out.println("\n-------------------------------------------------------\nORDENADO POR NOME");
        Collections.sort(listaProdutos, new nameComparator());

        for (Produto produto : listaProdutos)
            System.out.println("Nome: "+produto.nome+"\nPreço: "+produto.preco);

        System.out.println("\n-------------------------------------------------------\nORDENADO POR PREÇO");
        Collections.sort(listaProdutos, new priceComparator());

        for (Produto produto : listaProdutos)
            System.out.println("Nome: "+produto.nome+"\nPreço: "+produto.preco);

    }

}


