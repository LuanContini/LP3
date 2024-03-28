package Medio.Exercicio3;

public class Main {
    public static void main(String[] args) {
        /*
        Classe Agenda Crie uma classe Agenda que mantém uma lista de Compromissos.
        Cada Compromisso tem uma data, hora e descricao. A classe Agenda deve ter
        métodos para adicionar um Compromisso e para retornar uma lista de
        Compromissos para uma data específica.
        */

        Agenda agenda = new Agenda();


        agenda.adicionarCompromisso("02-03-2024", "17:55", "Tomar banho");
        agenda.adicionarCompromisso("02-03-2024", "09:30", "Caminhar");
        agenda.adicionarCompromisso("02-03-2024", "12:50", "Buscar Filho");
        agenda.adicionarCompromisso("25-06-2024", "00:00", "Aniversário Iza");

        agenda.retornaCompromisso("02-03-2024");

    }
}
