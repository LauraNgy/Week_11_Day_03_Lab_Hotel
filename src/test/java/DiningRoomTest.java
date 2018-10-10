import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("The Granary", 25);
    }

    @Test
    public void hasName(){
        assertEquals("The Granary", diningRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(25, diningRoom.getCapacity());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, diningRoom.getGuests());
    }
}