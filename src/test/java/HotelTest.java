import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void before() {
        hotel = new Hotel();
    }

    @Test
    public void hasRooms() {
        assertEquals(0, hotel.getBedrooms().size());
        assertEquals(0, hotel.getConfRooms().size());
        assertEquals(0, hotel.getDineRooms().size());
    }
}
