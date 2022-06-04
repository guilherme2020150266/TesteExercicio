import org.junit.Assert;
import org.junit.Test;

public class Exercicio01Test{
    @Test
    public void testePalavraDigitada() {
        Exercicio01 exercicio01 = new Exercicio01();
        Assert.assertEquals("Voce digitou: Teste", exercicio01.retornaPalavraDigitada("Teste"));
    }
}
