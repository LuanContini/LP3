import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        /*
        Criar um programa que gerencia um inventário de produtos, permitindo adicionar, remover e buscar produtos pelo nome.
        */

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> mapProdutos = new HashMap<>();

        int resposta;

        do {
            System.out.println("Qual ação você gostaria de tomar:\n[1]Adicionar Produto");
            if (!mapProdutos.isEmpty()){
                System.out.println("[2]Visualizar Produtos\n[3]Procurar Produto por Nome\n[4]Apagar Produto");
            }
            System.out.println("[5]Sair");

            resposta = scanner.nextInt();
            scanner.nextLine();
            switch (resposta){
                case 1:
                    adicionarProduto(mapProdutos);
                    break;
                case 2:
                    imprimirMap(mapProdutos);
                    break;
                case 3:
                    String nome;

                    System.out.println("Digite o nome do produto que deseja procurar: ");
                    nome = scanner.nextLine();

                    try{
                        System.out.println("Nome: "+ nome+ "\nValor: "+ mapProdutos.get(nome));

                    }catch (Exception ex){
                        System.out.println("O produto não foi encontrado");
                    }
                    break;
                case 4:
                    excluirProduto(mapProdutos);
                    break;
            }


        }while(resposta != 5);
    }

    private static void excluirProduto(HashMap<String, Double> mapProdutos) {
        Scanner scanner = new Scanner(System.in);

        int resposta;
        do{
            String nome;

            System.out.println("Digite o nome do produto que deseja excluir: ");
            nome = scanner.nextLine();

            mapProdutos.remove(nome);

            System.out.println("Produto excluido");
            System.out.println("(Para parar de excluir produtos digite -1, caso contrário digite outro número): ");
            resposta = scanner.nextInt();
            scanner.nextLine();
        }while(resposta != -1);
    }

    private static void imprimirMap(HashMap<String, Double> mapProdutos) {
        mapProdutos.forEach((key, value) -> {

            System.out.println("||Nome: "+key+"   Valor: "+value);
        });
    }

    private static void adicionarProduto(HashMap<String, Double> mapProdutos) {
        Scanner scanner = new Scanner(System.in);
        int resposta;
        String nome;
        double valor;

        do{
            System.out.println("Digite o nome do produto: ");
            nome = scanner.nextLine();

            System.out.println("Digite o valor do produto: ");
            valor = scanner.nextDouble();

            mapProdutos.put(nome, valor);

            System.out.println("Produto adicionado");
            System.out.println("(Para parar de adicionar produtos digite -1, caso contrário digite outro número)): ");
            resposta = scanner.nextInt();
            scanner.nextLine();
        }while(resposta != -1);
    }
}