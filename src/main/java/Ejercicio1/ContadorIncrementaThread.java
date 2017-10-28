package Ejercicio1;

public class ContadorIncrementaThread extends Thread {

    private final Contador contador;

    public ContadorIncrementaThread(Contador contIni){
        this.contador = contIni;
    }

    public void run(){
        int i = 10;
        while (i>=0){
            try {
                this.contador.inc();
                System.out.println (" Incremento ");
                i--;
            } catch (InterruptedException e) {
                e.getMessage();
            }

        }
    }
}
