package interfaceComparableComparatorPackage;

import java.util.Comparator;

public class Produto{
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
}

class nameComparator implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.nome.compareTo(p2.nome);
    }

}

class priceComparator implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2){
        return p1.nome.compareTo(p2.nome);
    }
}
