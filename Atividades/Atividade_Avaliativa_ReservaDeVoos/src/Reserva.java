public class Reserva implements Runnable{

    private int assento;
    private Voo voo;

    public  Reserva(Voo voo, int assento){
        this.voo = voo;
        this.assento = assento;
    }
    @Override
    public void run(){

            if(voo.reservarAssento(assento)){

                System.out.println("Assento nº " +voo.getAssentosReservados().get(assento)+ " reservado com sucesso\nAssentos restantes: " + voo.getAssentosRestantes());
            }
            else
                System.out.println("Falha em reservar assento");

    }

}
