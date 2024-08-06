package pecas;

public class Torre extends Peca{

    public Torre(int x, int y, char cor){
        super('T', cor, x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY){

        if((novoX == x && novoY != y) || (novoX != x && novoY == y)){
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
