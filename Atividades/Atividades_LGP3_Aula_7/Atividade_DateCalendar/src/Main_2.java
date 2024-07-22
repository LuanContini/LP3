import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;


public class Main_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calendar calendario = Calendar.getInstance();
        Date novaData;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String dataInicialStr;

        System.out.println("Digite a data inicial (formato: dd/MM/aaaa):");
        try {
            calendario.setTime(sdf.parse(scanner.nextLine()));

        }catch (java.text.ParseException e ) {}
        System.out.println("Digite o número de dias a serem adicionados:");
        int diasParaAdicionar = scanner.nextInt();

        calendario.add(Calendar.DAY_OF_MONTH, diasParaAdicionar);

        novaData = calendario.getTime();

        System.out.println("A nova data é: " + novaData);

    }
}
