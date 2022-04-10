import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeAll
    public static void creatNewVector(){
        v1 = new Vector2D();
    } //1 раз создается обьект на весь класс

    @Test
    public void newVectorShouldHaveZeroLength(){

        //assertion-утверждение,что ожидаемый совпадает с фактическим
        Assertions.assertEquals(0,v1.length(),EPS);//(ожидание,фактический,точность)
    }
    @Test
    public void newVectorShouldHaveZeroX(){
        Assertions.assertEquals(0,v1.getX(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY(){
        Assertions.assertEquals(0,v1.getY(),EPS);
    }

    //обьединили 2 метода в один
//    @Test
//    public void newVectorShouldHaveZeroXAndZeroY(){
//        Assertions.assertEquals(0,v1.getX(),EPS);
//        Assertions.assertEquals(0,v1.getY(),EPS);
//
//    }
}
