import Ejercicio3.Buffer;
import Ejercicio3.NumeroPerfecto;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class BufferTest {

    private Buffer buffer1;
    private NumeroPerfecto t1;


    @Before
    public void setUp(){
        this.buffer1 = new Buffer(4);

        this.buffer1.push(new BigInteger("33550336")); // perfecto
        this.buffer1.push(new BigInteger("11")); //no perfecto
        this.buffer1.push(new BigInteger("6")); //no perfecto
        this.buffer1.push(new BigInteger("8128")); // perfecto

        this.t1 = new NumeroPerfecto(buffer1);

    }

    @Test
    public void bufferConNumerosPerfectosYNumerosNoPerfectos(){
        this.t1.calcular();
    }
}
