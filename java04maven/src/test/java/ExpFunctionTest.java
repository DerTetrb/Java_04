import org.junit.Test;

import static org.junit.Assert.*;

public class ExpFunctionTest {

    @Test
    public void getValue() {
        ExpFunction func = new ExpFunction(2,3, 5, 0);
        System.out.println(func.getValue(0));
        System.out.println(func.getValue(1));
    }
    @Test(expected = IllegalArgumentException.class)
    public void test1(){
        ExpFunction func1 = new ExpFunction(2, 3, 5, 6);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test2(){
        ExpFunction func1 = new ExpFunction(2, 3, 5, 0);
        System.out.println(func1.getValue(6));
    }
}