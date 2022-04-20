import org.junit.Test;

import static org.junit.Assert.*;

public class IntegralFunctionalTest {

    LinearFunction f1 = new LinearFunction(1, 1, 10, 0);
    DivisionFunction f2 = new DivisionFunction(1, 1, 1, 1, 10, 0);

    @Test
    public void getResult() {
        IntegralFunctional integralFunctional1 = new IntegralFunctional(8, 0);
        System.out.println(integralFunctional1.getResult(f1));
        IntegralFunctional integralFunctional2 = new IntegralFunctional(10, 0);
        System.out.println(integralFunctional2.getResult(f2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getResult3() {
        IntegralFunctional integralFunctional = new IntegralFunctional(10, -4);
        integralFunctional.getResult(f1);
    }
}