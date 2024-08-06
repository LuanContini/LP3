import pecas.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static int[] transformarPosicao(String posicao) {
        // Inicializa o array de tamanho 2
        int[] indices = new int[2];
        int linha = -1, coluna = -1;
        char posColuna = posicao.charAt(0);

        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        if(posicao.length() != 2)
            return null;

        if (!Character.isDigit(posicao.charAt(1)))
            return null;

        for (int i = 0; i < 8; i++){
            if (letras[i] == Character.toLowerCase(posColuna)){
                coluna = i;
            }
        }

        linha = posicao.charAt(1) - '0';

        indices[0] = coluna;
        indices[1] = linha - 1;

        return indices;
    }

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro();
        montarTabuleiro(tabuleiro);

        Scanner scanner = new Scanner(System.in);

        boolean loop = true, turnoBrancas = true, fimJogo = false;
        ArrayList<String> jogadasIniciais = new ArrayList<String>();
        ArrayList<String> jogadasFinais = new ArrayList<String>();

        String posInicial, posFinal;
        int[] jogadaInicial, jogadaFinal;

        System.out.println("Jogo de Xadrez\nComo jogar: Digite a posição da peça que você deseja mover e em seguida para onde deseja movê-la com letra primeiro e número depois\nEx: f3, A6, E1\n\nPara qualquer um dos lado desistir digite -1 na escolha da peça para mover");
        do {
            tabuleiro.criarTabuleiro();
            if(!fimJogo){
            if(turnoBrancas){
                System.out.println("Turno das brancas\nDigite a posição da peça que deseja mover: ");

                posInicial = scanner.nextLine();
                if (posInicial.equals("-1")){
                    System.out.println("As brancas desistem");
                    fimJogo = true;
                    break;
                }

                System.out.println("Digite a posição para onde deseja mover a peça: ");
                posFinal = scanner.nextLine();


                jogadaInicial = transformarPosicao(posInicial);

                jogadaFinal = transformarPosicao(posFinal);

                if(jogadaInicial != null && jogadaFinal != null){
                    int jogadaBrancas = tabuleiro.moverPeca(jogadaInicial[1], jogadaInicial[0], jogadaFinal[1], jogadaFinal[0], turnoBrancas);
                    if (jogadaBrancas == 1){
                        jogadasIniciais.add(posInicial);
                        jogadasFinais.add(posFinal);
                        tabuleiro.criarTabuleiro();
                        turnoBrancas = false;
                    }
                    else if (jogadaBrancas == 2){
                        System.out.println("Xeque-mate das brancas!!");
                        jogadasIniciais.add(posInicial);
                        jogadasFinais.add(posFinal);
                        fimJogo = true;
                    }
                }else{
                    System.out.println("Um dos valores não era válido, tente  novamente");
                }

            }
            else if(!turnoBrancas){
                System.out.println("Turno das pretas\nDigite a posição da peça que deseja mover: ");

                posInicial = scanner.nextLine();

                System.out.println("Digite a posição para onde deseja mover a peça: ");
                posFinal = scanner.nextLine();

                if (posInicial.equals("-1")){
                    System.out.println("As pretas desistem");
                    fimJogo = true;
                    break;
                }

                jogadaInicial = transformarPosicao(posInicial);
                jogadaFinal = transformarPosicao(posFinal);

                if(jogadaInicial != null && jogadaFinal != null){
                    int jogadaPretas = tabuleiro.moverPeca(jogadaInicial[1], jogadaInicial[0], jogadaFinal[1], jogadaFinal[0], turnoBrancas);
                    if (jogadaPretas == 1){
                        jogadasIniciais.add(posInicial);
                        jogadasFinais.add(posFinal);
                        tabuleiro.criarTabuleiro();
                        turnoBrancas = true;
                    }
                    else if (jogadaPretas == 2){
                        System.out.println("Xeque-mate das pretas!!");
                        jogadasIniciais.add(posInicial);
                        jogadasFinais.add(posFinal);
                        fimJogo = true;
                    }
                }
            }



            }
            else {
                int decisao;

                System.out.println("Gostaria de ver uma recaptulação da partida?[0]Não [1]Sim");
                decisao = scanner.nextInt();
                if (decisao == 1){
                    tabuleiro = new Tabuleiro();

                    System.out.println("De:  "+jogadasIniciais);
                    System.out.println("Para:"+jogadasFinais);

                    montarTabuleiro(tabuleiro);
                    for (int i = 0; i < jogadasIniciais.size(); i++){
                        jogadaInicial = transformarPosicao(jogadasIniciais.get(i));

                        jogadaFinal = transformarPosicao(jogadasFinais.get(i));

                       tabuleiro.moverPecaRecap(jogadaInicial[1], jogadaInicial[0], jogadaFinal[1], jogadaFinal[0]);

                        System.out.print("\n"+jogadasIniciais.get(i)+" para "+ jogadasFinais.get(i));
                       tabuleiro.criarTabuleiro();
                    }
                    loop = false;
                }
                else
                    loop = false;
            }
        }while(loop);


    }

    private static void montarTabuleiro(Tabuleiro tabuleiro) {
        Peca reiBrancas = new Rei(0, 4, 'b');
        Peca rainhaBrancas = new Rainha(0, 3, 'b');
        Peca bispoBrancas1 = new Bispo(0, 2, 'b');
        Peca bispoBrancas2 = new Bispo(0, 5, 'b');
        Peca cavaloBrancas1 = new Cavalo(0, 1, 'b');
        Peca cavaloBrancas2 = new Cavalo(0, 6, 'b');
        Peca torreBrancas1 = new Torre(0, 0, 'b');
        Peca torreBrancas2 = new Torre(0, 7, 'b');

        Peca peaoBrancas0 = new Peao(1, 0, 'b');
        Peca peaoBrancas1 = new Peao( 1, 1, 'b');
        Peca peaoBrancas2 = new Peao( 1, 2, 'b');
        Peca peaoBrancas3 = new Peao( 1, 3, 'b');
        Peca peaoBrancas4 = new Peao( 1, 4, 'b');
        Peca peaoBrancas5 = new Peao( 1, 5, 'b');
        Peca peaoBrancas6 = new Peao( 1, 6, 'b');
        Peca peaoBrancas7 = new Peao( 1, 7, 'b');

        tabuleiro.adicionarPeca(reiBrancas, 0, 4);
        tabuleiro.adicionarPeca(rainhaBrancas, 0, 3);
        tabuleiro.adicionarPeca(bispoBrancas1, 0, 2);
        tabuleiro.adicionarPeca(bispoBrancas2, 0, 5);
        tabuleiro.adicionarPeca(cavaloBrancas1, 0, 1);
        tabuleiro.adicionarPeca(cavaloBrancas2, 0, 6);
        tabuleiro.adicionarPeca(torreBrancas1, 0, 0);
        tabuleiro.adicionarPeca(torreBrancas2, 0, 7);

        tabuleiro.adicionarPeca(peaoBrancas0, 1, 0);
        tabuleiro.adicionarPeca(peaoBrancas1, 1, 1);
        tabuleiro.adicionarPeca(peaoBrancas2, 1, 2);
        tabuleiro.adicionarPeca(peaoBrancas3, 1, 3);
        tabuleiro.adicionarPeca(peaoBrancas4, 1, 4);
        tabuleiro.adicionarPeca(peaoBrancas5, 1, 5);
        tabuleiro.adicionarPeca(peaoBrancas6, 1, 6);
        tabuleiro.adicionarPeca(peaoBrancas7, 1, 7);

        Peca reiPretas = new Rei(7, 4, 'p');
        Peca rainhaPretas = new Rainha(7, 3, 'p');
        Peca bispoPretas1 = new Bispo (7, 2, 'p');
        Peca bispoPretas2 = new Bispo (7, 5, 'p');
        Peca cavaloPretas1 = new Cavalo(7, 1, 'p');
        Peca cavaloPretas2 = new Cavalo(7, 6, 'p');
        Peca torrePretas1 = new Torre (7, 0, 'p');
        Peca torrePretas2 = new Torre (7, 7, 'p');

        Peca peaoPretas0 = new Peao( 6, 0, 'p');
        Peca peaoPretas1 = new Peao( 6, 1, 'p');
        Peca peaoPretas2 = new Peao( 6, 2, 'p');
        Peca peaoPretas3 = new Peao( 6, 3, 'p');
        Peca peaoPretas4 = new Peao( 6, 4, 'p');
        Peca peaoPretas5 = new Peao( 6, 5, 'p');
        Peca peaoPretas6 = new Peao( 6, 6, 'p');
        Peca peaoPretas7 = new Peao( 6, 7, 'p');

        tabuleiro.adicionarPeca(reiPretas, 7, 4);
        tabuleiro.adicionarPeca(rainhaPretas,  7, 3);
        tabuleiro.adicionarPeca(bispoPretas1,  7, 2);
        tabuleiro.adicionarPeca(bispoPretas2,  7, 5);
        tabuleiro.adicionarPeca(cavaloPretas1, 7, 1);
        tabuleiro.adicionarPeca(cavaloPretas2, 7, 6);
        tabuleiro.adicionarPeca(torrePretas1,  7, 0);
        tabuleiro.adicionarPeca(torrePretas2, 7, 7);

        tabuleiro.adicionarPeca(peaoPretas0, 6, 0);
        tabuleiro.adicionarPeca(peaoPretas1, 6, 1);
        tabuleiro.adicionarPeca(peaoPretas2, 6, 2);
        tabuleiro.adicionarPeca(peaoPretas3, 6, 3);
        tabuleiro.adicionarPeca(peaoPretas4, 6, 4);
        tabuleiro.adicionarPeca(peaoPretas5, 6, 5);
        tabuleiro.adicionarPeca(peaoPretas6, 6, 6);
        tabuleiro.adicionarPeca(peaoPretas7, 6, 7);
    }
}