import java.util.Calendar;

public class Tarefa {

    String texto;
    Calendar data;
    public Tarefa(String tarefa){
        this.texto = tarefa;
        this.data = Calendar.getInstance();
    }

    public void imprimirTarefa(){
        System.out.println("Data: "+data.getTime().toString()+"\n"+texto);
    }
}
