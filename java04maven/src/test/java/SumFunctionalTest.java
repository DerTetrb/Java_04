import org.junit.Test;

import static org.junit.Assert.*;

public class SumFunctionalTest {

    @Test
    public void getResult() {
        LinearFunction func1 = new LinearFunction(2, 3, 5, 0); // 2 * x + 3
        SumFunctional<LinearFunction> functional = new SumFunctional<>(5,0); //  2*5 + 3 + 2*2.5 + 3 + 2*0 + 3
        System.out.println(functional.getResult(func1));
        ExpFunction func2 = new ExpFunction(2,3, 1, 0); // 2 * e^x +3
        SumFunctional<ExpFunction> functional2 = new SumFunctional<>(1,0); //2 * e^1 + 3 + 2 * e^0.5 + 3 + 2 * e^0 + 3
        System.out.println(functional2.getResult(func2));
        DivisionFunction f3 = new DivisionFunction(1, 1, 1, 1, 10, 0);
        SumFunctional<DivisionFunction> functional3 = new SumFunctional<>(1,0);
        System.out.println(functional3.getResult(f3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getResult3() {
        LinearFunction f1 = new LinearFunction(1, 1, 10, 0);
        SumFunctional sumFunctional = new SumFunctional(11, 0);
        sumFunctional.getResult(f1);
    }
}