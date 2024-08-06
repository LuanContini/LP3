package pecas;

public class Bispo  extends Peca{

    public Bispo(int x, int y, char cor){
        super('B', cor, x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY){
        if(Math.abs(novoX - x) == Math.abs(novoY - y)){
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
