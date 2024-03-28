package Medio.Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Compromisso> compromissoList = new ArrayList<Compromisso>();

    public void adicionarCompromisso(String data, String hora, String descricao){

        Compromisso compromisso = new Compromisso(data, hora, descricao);

        compromissoList.add(compromisso);
    }

    public void retornaCompromisso(String data){
        boolean temCompromisso = false;
        for (Compromisso i:compromissoList){

            if(i.getData().equals(data)){
                temCompromisso = true;
                i.imprimeCompromisso();
            }
        }
        if (temCompromisso == false) System.out.println("Não haviam compromissos para a data "+data);
    }
}
