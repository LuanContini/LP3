import java.util.ArrayList;

public class ListaTarefa {
    Tarefa tarefa;
    ArrayList<Tarefa> listaTarefas;

    public ListaTarefa(){
        listaTarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        listaTarefas.add(tarefa);
    }

    public void listarTarefas(){
        int i = 0;
        try{
        for(Tarefa tarefa:listaTarefas){
            System.out.println("\nNº de tarefa: "+(i+1));
            tarefa.imprimirTarefa();
            i++;
        }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Não existem mais tarefas com este nº");
        }

    }

    public void removerTarefa(int i){
        if(i <= listaTarefas.size()) {
            listaTarefas.remove((i - 1));
        }else {
            System.out.println("Nenhuma tarefa com este nº foi encontrada tente novamente");
        }

    }

    public boolean existeTarefa(){
        if(listaTarefas.size() > 0){
            return true;
        }else {
            return false;
        }
    }
}
