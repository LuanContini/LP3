import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SistemaReservas {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Voo voo = new Voo(15, "123");

        for (int i = 0; i < 15; i++){
            Runnable tarefa = new Reserva(voo, i);
            executorService.submit(tarefa);
        }

        executorService.shutdown();

        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
        System.out.println("Lista de assentos reservados: "+ voo.getAssentosReservados());
    }
}

