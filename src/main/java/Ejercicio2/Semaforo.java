package Ejercicio2;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * * EJERCICIO 2 - PRACTICA 6 de MONITORES
 */

public class Semaforo {

    private int permisos;
    private Queue<Thread> colaThreadsEsperando;
    private int passedPermissions;

    public Semaforo(int cantPer){
        this.permisos = cantPer;
        this.passedPermissions=0;
        this.colaThreadsEsperando = new PriorityQueue<Thread>();
    }

    public synchronized void acquire(){

        this.colaThreadsEsperando.add(Thread.currentThread());

        while (this.permisos==0){
            try {
                System.out.println (" Wait permisos ");
                wait();
                if ( passedPermissions > 0 && this.colaThreadsEsperando.peek().equals(Thread.currentThread())){
                    passedPermissions--;
                    this.colaThreadsEsperando.remove();
                    return;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.permisos--;
            notifyAll();
        }

    }

    public synchronized void release(){
        if(this.colaThreadsEsperando.isEmpty()){
            this.permisos++;
        }else{
            this.passedPermissions ++;
            notify();
        }
    }
}
