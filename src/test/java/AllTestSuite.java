import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({Exercicio01Test.class, Exercicio02Test.class,Exercicio03Test.class,Exercicio04Test.class})

public class AllTestSuite {
}
