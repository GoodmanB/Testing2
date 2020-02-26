import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TimeoutsTest {

    private static Timeouts timeouts;

    @Before
    public void init() throws Exception {

        timeouts = new Timeouts(100000, 100);
    }

    @Test(timeout = 2000)
    public void totalCashTest() throws InterruptedException {
        assertThat(10.0, is(timeouts.getTotalCash()));
    }

    @Test(timeout = 1000)
    public void totalAccountsTest() throws InterruptedException {

        assertThat(100, is(timeouts.getTotalAccounts()));
    }
}