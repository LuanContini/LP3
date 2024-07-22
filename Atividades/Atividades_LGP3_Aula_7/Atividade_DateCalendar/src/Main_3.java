import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        //Escrever um programa que verifica se uma data é antes ou depois de outra data.

        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar primeiraData = Calendar.getInstance();
        Calendar segundaData = Calendar.getInstance();

        try {
            System.out.println("Digite a primeira data(formato dd/MM/aaaa):");
            primeiraData.setTime(sdf.parse(scanner.nextLine()));
            System.out.println("Digite a segunda data(formato dd/MM/aaaa):");
            segundaData.setTime(sdf.parse(scanner.nextLine()));

        } catch (java.text.ParseException e ) {}

        if (primeiraData.before(segundaData)) {
            System.out.println("A primeira data é anterior à segunda data.");
        } else if (primeiraData.after(segundaData)) {
            System.out.println("A primeira data é posterior à segunda data.");
        } else {
            System.out.println("As duas datas são iguais.");
        }

    }
}
