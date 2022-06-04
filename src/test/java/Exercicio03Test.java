import org.junit.Assert;
import org.junit.Test;

public class Exercicio03Test {

    @Test
    public void testecalcularDobro(){

        Exercicio03 exercicio03 = new Exercicio03();
        Assert.assertEquals(20, exercicio03.calcularDobro(10));

    }
}
