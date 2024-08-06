package pecas;

public class Peao  extends Peca{
    private boolean primeiroMovimento = true;

    public Peao(int x, int y, char cor){
        super('P', cor, x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        int deltaX = novoX - x;
        int deltaY = novoY - y;

        if (cor == 'b') {
            if (deltaX == 1 && deltaY == 0 || deltaY == 1) {
                x = novoX;
                y = novoY;
                primeiroMovimento = false;
                return true;
            } else if (primeiroMovimento && (deltaX == 1 || deltaX == 2) && deltaY == 0 || deltaY == 1) {
                x = novoX;
                y = novoY;
                primeiroMovimento = false;
                return true;
            }
        } else if (cor == 'p') {
            if (deltaX == -1 && deltaY == 0 || deltaY == 1) {
                x = novoX;
                y = novoY;
                primeiroMovimento = false;
                return true;
            } else if (primeiroMovimento && (deltaX == -1 || deltaX == -2) && deltaY == 0 || deltaY == 1) {
                x = novoX;
                y = novoY;
                primeiroMovimento = false;
                return true;
            }
        }

        return false;
    }

    @Override
    public char getNome() {
        return nome;
    }

    @Override
    public char getCor() { return cor;}

    public void rollBack(int velhoX, int velhoY){
        x = velhoX;
        y = velhoY;
    }
}
