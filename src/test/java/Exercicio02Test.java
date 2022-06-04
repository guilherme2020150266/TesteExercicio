import org.junit.Assert;
import org.junit.Test;



    public class Exercicio02Test {

        @Test
        public void ExibeValoresTrocadosTest(){

            String mensagem =  "O valor do primeiro numero é :20\n"
                    +"O valor do segundo numero é :10";
            Exercicio02 exercicio02 = new Exercicio02();
            Assert.assertEquals(mensagem, exercicio02.exibeValoresTrocados(10, 20));

        }
    }


