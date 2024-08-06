package pecas;

public class Rainha  extends Peca{

    public Rainha(int x, int y, char cor){
        super('Q', cor, x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        if (novoX == x || novoY == y || Math.abs(novoX - x) == Math.abs(novoY - y)) {
            x = novoX;
            y = novoY;
            return true;
        }
        return false;
    }

    @Override
    public char getNome() {
        return nome;
    }

    @Override
    public char getCor() { return cor;}

    public void rollBack(int velhoX, int velhoY) {
        x = velhoX;
        y = velhoY;
    }
}
