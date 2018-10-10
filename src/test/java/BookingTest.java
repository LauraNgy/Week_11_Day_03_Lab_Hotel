import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookingTest {

    Bedroom bedroom;
    Booking booking;

    @Before
    public void before() {
        bedroom = new Bedroom("BedBed", 2, 50);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNights() {
        assertEquals(3, booking.getNights());
    }
}
