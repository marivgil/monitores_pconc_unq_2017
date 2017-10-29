import Ejercicio1.Contador;
import Ejercicio1.ContadorDecrementaThread;
import Ejercicio1.ContadorIncrementaThread;
import org.junit.Before;
import org.junit.Test;

public class ContadorTest {

    private ContadorIncrementaThread t1;
    private ContadorDecrementaThread t2;
    private Contador contador;

    @Before
    public void setUp(){
        this.contador = new Contador(10);
        this.t1 = new ContadorIncrementaThread(this.contador);
        this.t2 = new ContadorDecrementaThread(this.contador);

    }

    @Test
    public void test(){
        this.t2.run();
        this.t1.run();
    }
}
