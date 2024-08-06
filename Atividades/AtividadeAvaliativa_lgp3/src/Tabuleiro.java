import pecas.*;
public class Tabuleiro {

    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    private Peca[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new Peca[8][8];
    }

    public void adicionarPeca(Peca peca, int x, int y) {
        tabuleiro[x][y] = peca;
    }

    public int moverPeca(int x, int y, int novoX, int novoY, boolean turnoBrancas) {
        Peca peca;
        char corTurno;

        boolean xequeMate = false;

        if (x > 7 || x < 0 || y > 7 || y < 0) {
            System.out.println("Valor de movimento inválido");
            return 0;
        }
        if(novoX > 7 || novoX < 0 || novoY > 7 || novoY < 0){
            System.out.println("Valor de movimento inválido");
            return 0;
        }

        peca = tabuleiro[x][y];

        if (turnoBrancas)
            corTurno = 'b';
        else
            corTurno = 'p';

        if (peca != null && peca.mover(novoX, novoY) && peca.getCor() == corTurno) {
            System.out.println("teste");
            if(tabuleiro[novoX][novoY] != null && tabuleiro[x][y].getCor() == tabuleiro[novoX][novoY].getCor()) {
                System.out.println("Não é possível comer peças da mesma cor");
                return 0;
            }

            if(peca.getNome() == 'P' && tabuleiro[novoX][novoY] != null){
                if (Math.abs(novoY - y) == 0){
                    peca.rollBack(x, y);
                    return 0;
                }
            }

            if (peca.getNome() == 'Q' || peca.getNome() == 'B' || peca.getNome() == 'T') {
                if (moverHorizontalVerticalDiagoanal(x, y, novoX, novoY)) {
                    System.out.println("A peça não pode pular por cima das outras");
                    return 0;
                }
            }

            if (tabuleiro[novoX][novoY] != null){
                if (tabuleiro[novoX][novoY].getNome() == 'R')
                    xequeMate = true;
            }

            tabuleiro[novoX][novoY] = peca;
            tabuleiro[x][y] = null;

            if (xequeMate){
                return 2;
            }
            return 1;

        }
        else if (peca != null){
            peca.rollBack(x, y);
        }

        System.out.println("Movimento inválido");
        return 0;
    }

    public int moverPecaRecap(int x, int y, int novoX, int novoY){
        Peca peca;
        char corTurno;

        boolean xequeMate = false;

        if (x > 7 || x < 0 || y > 7 || y < 0) {
            System.out.println("Valor de movimento inválido");
            return 0;
        }
        if (novoX > 7 || novoX < 0 || novoY > 7 || novoY < 0) {
            System.out.println("Valor de movimento inválido");
            return 0;
        }

        peca = tabuleiro[x][y];

        if (peca != null && peca.mover(novoX, novoY)) {

            if(tabuleiro[novoX][novoY] != null && tabuleiro[x][y].getCor() == tabuleiro[novoX][novoY].getCor()) {
                System.out.println("Não é possível comer peças da mesma cor");
                return 0;
            }

            if(peca.getNome() == 'P' && tabuleiro[novoX][novoY] != null){
                if (Math.abs(novoY - y) == 0){
                    peca.rollBack(x, y);
                    return 0;
                }
            }

            if (peca.getNome() == 'Q' || peca.getNome() == 'B' || peca.getNome() == 'T') {
                if (moverHorizontalVerticalDiagoanal(x, y, novoX, novoY)) {
                    System.out.println("A peça não pode pular por cima das outras");
                    return 0;
                }
            }

            if (tabuleiro[novoX][novoY] != null){
                if (tabuleiro[novoX][novoY].getNome() == 'R')
                    xequeMate = true;
            }

            tabuleiro[novoX][novoY] = peca;
            tabuleiro[x][y] = null;

            if (xequeMate){
                return 2;
            }
            return 1;

        }

        System.out.println("Movimento inválido");
        return 0;
    }

    private boolean moverHorizontalVerticalDiagoanal(int x, int y, int novoX, int novoY) {
        //movendo no axis x
        if(novoY == y) {

            //movendo no axis x positivamente
            if(x - novoX < 0){
                for (int i = x+1; i != novoX; i++) {
                    if (tabuleiro[i][novoY] != null) {
                        return true;
                    }
                }
            //movendo no axis x negativemente
            }else{
                for (int i = x-1; i != novoX; i--) {
                    if (tabuleiro[i][novoY] != null) {
                        return true;
                    }
                }
            }
        //movendo no axis y
        } else if (novoX == x) {
            if(y - novoY < 0){
                for (int i = y+1; i != novoY; i++) {
                    if (tabuleiro[novoX][i] != null)
                        return true;
                }
            }else{
                for (int i = y-1; i != novoY; i--) {
                    if (tabuleiro[novoX][i] != null)
                        return true;
                }
            }
        //movendo na diagonal
        }else {

            //if movendo para a direção das peças negras
            //System.out.println("[i]:"+i+"[j]:"+j);
            if (x - novoX < 0){
                if (y - novoY < 0){
                    for (int i = x+1, j = y +1; i != novoX; i++, j++){
                        if(tabuleiro[i][j] != null) {
                            return true;
                        }
                    }
                }
                else{
                    for (int i = x +1, j = y -1; i != novoX; i++, j--) {
                        if (tabuleiro[i][j] != null)
                            return true;
                    }
                }
            }else{
                if (y - novoY < 0){
                    for (int i = x -1, j = y +1; i != novoX; i--, j++){
                        if(tabuleiro[i][j] != null) {
                            return true;
                        }
                    }
                }
                else{
                    for (int i = x -1, j = y -1; i != novoX; i--, j--) {
                        if (tabuleiro[i][j] != null)
                            return true;
                    }
                }
            }
        }

        return false;
    }

    public void criarTabuleiro() {

        for (int row = 7; row >= 0; row--) {
            System.out.println("");
            System.out.println("  -------------------------------------------------");
            System.out.print(row+1+" ");

            for (int column = 0; column < 8; column++) {
                if (tabuleiro[row][column] != null) {
                    if (tabuleiro[row][column].getCor() == 'p')
                        System.out.print("| " + ANSI_WHITE + " "+tabuleiro[row][column].getNome()+" " + " " + ANSI_RESET);
                    else
                        System.out.print("| "+" " + tabuleiro[row][column].getNome() + " " + " ");
                }
                else
                    System.out.print("| " + "   " + " ");
            }
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("  -------------------------------------------------");
        System.out.print("     a     b     c     d     e     f     g     h  \n\n");

    }
}
