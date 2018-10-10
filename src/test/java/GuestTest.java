import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest();
    }

    @Test
    public void hasNumberOfGuests() {
        assertEquals(1, guest.getNumberOfGuests());
    }

    @Test
    public void amendNumberOfGuests() {
        guest.amend(2);
        assertEquals(2, guest.getNumberOfGuests());
    }
}
