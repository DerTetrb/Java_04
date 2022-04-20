import org.junit.Test;

import static org.junit.Assert.*;

public class SinFunctionTest {

    @Test
    public void getValue() {
        SinFunction func1 = new SinFunction(2, 1.57, 5, 0);
        assertEquals(2.0, func1.getValue(1), 0.001); // 2 * sin(1.57 * 1)
        System.out.println(func1.getValue(1));
        SinFunction func2 = new SinFunction(2, 0, 5, 0);
        assertEquals(0.0, func2.getValue(3),0.0);
        System.out.println(func2.getValue(3));

    }

    @Test(expected = IllegalArgumentException.class)
    public void test1(){
        SinFunction func1 = new SinFunction(2, 3, 5, 6);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test2(){
        SinFunction func1 = new SinFunction(2, 3, 5, 0);
        System.out.println(func1.getValue(6));
    }
}