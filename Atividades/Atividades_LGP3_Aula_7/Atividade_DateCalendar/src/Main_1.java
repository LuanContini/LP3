import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {

        //Criar um programa que calcula a diferença em dias entre duas datas.
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar data1 = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();

        int dias = 0, diferencaAnos = 0;
        try {
            System.out.println("Digite a primeira data(formato dd/MM/aaaa):");
            data1.setTime(sdf.parse(scanner.nextLine()));
            System.out.println("Digite a segunda data(formato dd/MM/aaaa):");
            data2.setTime(sdf.parse(scanner.nextLine()));

        } catch (java.text.ParseException e ) {}
        diferencaAnos = data1.get(Calendar.YEAR) - data2.get(Calendar.YEAR);


        if (diferencaAnos != 0) {
            if (diferencaAnos > 4){
                dias = data2.get(Calendar.DAY_OF_YEAR) -
                        data1.get(Calendar.DAY_OF_YEAR) + Math.abs(diferencaAnos * 365) + (diferencaAnos / 4);
            }
            else {
                dias = data2.get(Calendar.DAY_OF_YEAR) -
                        data1.get(Calendar.DAY_OF_YEAR) + Math.abs(diferencaAnos * 365);
            }
        }
        else {
            dias = data2.get(Calendar.DAY_OF_YEAR) -
                    data1.get(Calendar.DAY_OF_YEAR);
        }
        System.out.println("Número de dias entre as duas datas: "+dias);


    }
}