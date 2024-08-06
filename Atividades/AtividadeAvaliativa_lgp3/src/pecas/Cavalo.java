package pecas;

public class Cavalo  extends Peca{

    public Cavalo(int x, int y, char cor){
        super('C', cor, x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY){
        if((Math.abs(novoX - x) == 2 && Math.abs(novoY - y) == 1) || (Math.abs(novoX - x) == 1 && Math.abs(novoY - y) == 2)){
            x = novoX;
            y = novoY;
            return true;
        }
        System.out.println(Math.abs(novoX - x) );
        System.out.println("nX: "+novoX+" x:"+x);

        System.out.println(Math.abs(novoY - y) );
        System.out.println("nY: "+novoY+" y:"+y);
        return false;
    }

    @Override
    public char getNome() {
        return nome;
    }

    @Override
    public char getCor(){ return cor;}

    @Override
    public void rollBack(int velhoX, int velhoY) {
        x = velhoX;
        y = velhoY;
    }
}
