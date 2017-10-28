package Ejercicio1;

public class ContadorDecrementaThread extends Thread{

    private final Contador contador;

    public ContadorDecrementaThread(Contador contIni){
        this.contador = contIni;
    }

    public void run(){
        int i = 10;
        while (i>=0){
            try {
                this.contador.desc();
                System.out.println (" Decremento ");
                i--;
            } catch (InterruptedException e) {
                e.getMessage();
            }

        }
    }
}
