package Testing1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IdEqualTest {

    @Test
    public void checkEquality() {

        IdEqual equal = new IdEqual();

        int results = equal.checkEquality(5,7);

        assertEquals(results,results);
    }
    @Test
    public void checkIdentity() {

        IdEqual a = new IdEqual();
        IdEqual b = new IdEqual();
        IdEqual c = a;

        assertEquals(c,a);
    }
}