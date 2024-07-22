import java.util.ArrayList;

public class Main_2 {
    public static void main(String[] args) {
        /*
    Desenvolver um programa que ordena uma lista de números inteiros.
    (Eu sucateei boa parte do codigo da pergunta 3 de Math)
    */


        ArrayList<Integer> arrayInteiros = new ArrayList<Integer>(), arrayExtra = new ArrayList<Integer>(), arrayDescarte = new ArrayList<Integer>();

        int a, contadorExtra = 0, menor;
        for (int i = 0; i < (int) (Math.random() * 20 + 5); i++) {
            arrayInteiros.add((int) (Math.random() * 100 + 1));
        }
        for(int i:arrayInteiros){
            arrayDescarte.add(i);
        }
        do {
            int contador = arrayDescarte.size() - 1;
            menor = 999999999;
            do {
                a = arrayDescarte.get(contador);

                menor = Math.min(a, menor);

                contador--;
            } while (contador > -1);

            arrayExtra.add(menor);
            arrayDescarte.remove(arrayDescarte.indexOf(menor));

            contadorExtra++;
        }while(contadorExtra < arrayInteiros.size());

        System.out.println("Array Desordenado: "+ arrayInteiros +"\nArray Ordenado:    "+arrayExtra);

    }
}
