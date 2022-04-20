import org.junit.Test;
import trinom.Trinomial;

import static org.junit.Assert.*;

public class TrinomrootTest {

    @org.junit.Test
    public void getMaxRoot() {
        Trinomial tr = new Trinomial(1,0,-4); //2, -2
        Trinomroot trroot = new Trinomroot(tr);
        System.out.println(trroot.getMaxRoot());

        Trinomial tr1 = new Trinomial(1,5,4); // -1, -4
        Trinomroot trroot1 = new Trinomroot(tr1);
        System.out.println(trroot1.getMaxRoot());

        Trinomial tr2 = new Trinomial(1,4,4); // -2
        Trinomroot trroot2 = new Trinomroot(tr2);
        System.out.println(trroot2.getMaxRoot());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException (){
        Trinomial tr = new Trinomial(5,5,5);
        Trinomroot trroot = new Trinomroot(tr);
        System.out.println(trroot.getMaxRoot());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testException1 (){
        Trinomial tr = new Trinomial(0,5,5);
        Trinomroot trroot = new Trinomroot(tr);
        System.out.println(trroot.getMaxRoot());

    }
}