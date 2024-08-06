package pecas;

public class Rei  extends Peca{

    public Rei(int x, int y, char cor){
        super('R', cor, x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        if (Math.abs(novoX - x) <= 1 && Math.abs(novoY - y) <= 1) {
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
