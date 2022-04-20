package trinom;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrinomialTest {

    @Test
    public void answertest(){
        Trinomial tr = new Trinomial(1,5,4);
        //System.out.println(tr.answer());
        double[] r = new double[3];
        r = tr.answer();
        System.out.println(r[0]);
        System.out.println(r[1]);
    }



    @Test(expected = IllegalArgumentException.class)
    public void answertest1(){
        Trinomial tr = new Trinomial(5,5,5);
        double[] p = tr.answer();
    }
    @Test(expected = IllegalArgumentException.class)
    public void answertest2(){
        Trinomial tr = new Trinomial(0,5,5);
        double[] p = tr.answer();
    }

    @Test
    public void answertest3(){
        Trinomial tr = new Trinomial(1,0,-4);
        //System.out.println(tr.answer());
        double[] r = new double[3];
        r = tr.answer();
        System.out.println(r[0]);
        System.out.println(r[1]);
    }

    @Test
    public void answertest4(){
        Trinomial tr = new Trinomial(1,4,4);
        //System.out.println(tr.answer());
        double[] r = new double[3];
        r = tr.answer();
        System.out.println(r[0]);
        //System.out.println(r[1]);
    }


}