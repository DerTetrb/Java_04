import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionFunctionTest {

    @Test
    public void getValue() {
        DivisionFunction function = new DivisionFunction(1,2,1,-6,12, -12);
        System.out.println(function.getValue(2));
        DivisionFunction function1 = new DivisionFunction(0,6,0,-2,12, -12);
        System.out.println(function1.getValue(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1(){
        DivisionFunction func1 = new DivisionFunction(2, 3, 2, 3, 5, 6);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test2(){
        DivisionFunction func1 = new DivisionFunction(2, 3,2,3, 5, 0);
        System.out.println(func1.getValue(6));
    }

}