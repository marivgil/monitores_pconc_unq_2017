package Ejercicio1;

/**
 * Created by maricruz on 28/10/17.
 * EJERCICIO 1 - PRACTICA 6 de MONITORES
 */
public class Contador{
    private int cont;

    public Contador(int valIni){
        this.cont = valIni;
    }

    public synchronized void inc() throws InterruptedException {
        while(!(this.cont<=0)) {
            System.out.println (" Wait incremento ");
            wait();
        }
        this.cont++;
        System.out.println (this.cont);
        notifyAll();
    }

    public synchronized void desc() throws InterruptedException{
        while (!(this.cont>0)) {
            System.out.println (" Wait decremento ");
            wait();
        }
        this.cont--;
        System.out.println (this.cont);
        notifyAll();
    }
}
