import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyMathTest {
    @Test
    public void zeroDenominatorShouldThrowException(){

        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class,
                () -> {
                    MyMath.divide(1,0);

                });

//        MyMath.divide(1,0);
    }
}
