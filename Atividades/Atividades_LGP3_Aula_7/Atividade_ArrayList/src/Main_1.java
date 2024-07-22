import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {

        /*
    Criar um programa que gerencia uma lista de tarefas, permitindo adicionar, remover e listar tarefas.
        */
        Scanner scanner = new Scanner(System.in);

        String texto;
        int excluir, resposta;

        ListaTarefa listaTarefa = new ListaTarefa();

        do {
            System.out.println("Qual ação você gostaria de tomar:\n[1]Adicionar Tarefa");
            if (listaTarefa.existeTarefa()){
                System.out.println("[2]Visualizar Tarefas\n[3]Apagar Tarefa");
            }
            System.out.println("[4]Sair");

            resposta = scanner.nextInt();

            switch (resposta){
                case 1:
                    adicionarTarefa(listaTarefa);
                    break;
                case 2:
                    listaTarefa.listarTarefas();
                    break;
                case 3:
                    excluirTarefa(listaTarefa);
                    break;
                case 4:
                    break;
            }


        }while(resposta != 4);


    }

    private static void excluirTarefa(ListaTarefa listaTarefa) {

        Scanner scanner = new Scanner(System.in);
        int excluir;

        do{
            System.out.println("Digite o número da tarefa que deseja excluir[para sair digite -1: ");
            excluir = scanner.nextInt();


            if(excluir != -1) {
                listaTarefa.removerTarefa(excluir);
            }

            System.out.println("Lista de tarefas: \n");
            listaTarefa.listarTarefas();

        }while(excluir != -1);
    }

    private static void adicionarTarefa(ListaTarefa listaTarefa) {

        Scanner scanner = new Scanner(System.in);
        String texto;
        do{
            Tarefa tarefa;

            System.out.println("Digite a tarefa[para sair digite -1: ");
            texto = scanner.nextLine();

            if (!texto.equals("-1")) {
                tarefa = new Tarefa(texto);
                listaTarefa.adicionarTarefa(tarefa);
            }

        }while(!texto.equals("-1"));
    }


}
