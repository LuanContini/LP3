import java.util.ArrayList;

public class Voo {

    private final int  capacidade;
    private ArrayList<Integer> assentosReservados;
    private final String numVoo;

    public Voo(int capacidade, String numVoo){
        assentosReservados = new ArrayList<Integer>();
            this.capacidade = capacidade;
            this.numVoo = numVoo;
    }

    public int getAssentosRestantes(){
        return capacidade - assentosReservados.size();
    }

    public String getNumVoo(){
        return numVoo;
    }

    public ArrayList<Integer> getAssentosReservados(){
        return assentosReservados;
    }

    public synchronized boolean reservarAssento(int assento){
        if (capacidade - assentosReservados.size() >= 1){
            assentosReservados.add(assento);
            return true;
        }
        return false;
    }
}
