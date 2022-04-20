import org.junit.Test;

import static org.junit.Assert.*;

public class LinearFunctionTest {

    @Test
    public void getValue() {
        LinearFunction func1 = new LinearFunction(2, 3, 5, 0);
        assertEquals(7.4, func1.getValue(2.2), 0.0); // 2 * 2.2 + 3
        System.out.println(func1.getValue(2.2));
        LinearFunction func2 = new LinearFunction(0, 0, 5, 0);
        assertEquals(0.0, func2.getValue(3),0.0);
        System.out.println(func2.getValue(3));

    }
    @Test(expected = IllegalArgumentException.class)
    public void test1(){
        LinearFunction func1 = new LinearFunction(2, 3, 5, 6);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test2(){
        LinearFunction func1 = new LinearFunction(2, 3, 5, 0);
        System.out.println(func1.getValue(6));
    }
}