import org.junit.Assert;
import org.junit.Test;

public class Exercicio04Test {


        @Test
        public void calcularSomaTest() {

            Exercicio04 exercicio04 = new Exercicio04();
            Assert.assertEquals(60, exercicio04.calcularSoma(10, 20, 30));
        }

        @Test
        public void calcularSubtracaoTest(){
            Exercicio04 exercicio04 = new Exercicio04();
            Assert.assertEquals(30, exercicio04.calcularSubtracao(60,20,10));

        }

        @Test
        public void calcularMultiplicacaoTest(){
            Exercicio04 exercicio04 = new Exercicio04();
            Assert.assertEquals(400, exercicio04.calcularMultiplicacao(2,10,20));

        }

        @Test
        public void calcularMediaTest(){
            Exercicio04 exercicio04 = new Exercicio04();
            Assert.assertEquals("5.0", String.valueOf(exercicio04.calcularMedia(5,5,5)));
        }
}


