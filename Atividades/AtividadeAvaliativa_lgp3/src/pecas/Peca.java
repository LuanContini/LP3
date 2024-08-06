package pecas;

public abstract class Peca {

    protected int x, y;
    protected char nome, cor;

    public Peca(char nome, char cor, int x, int y){
        this.nome = nome;
        this.cor = cor;
        this.x = x;
        this.y = y;
    }
    public abstract boolean mover(int x, int y);

    public abstract char getNome();
    
    public abstract char getCor();

    public abstract void rollBack(int velhoX, int velhoY);
}
