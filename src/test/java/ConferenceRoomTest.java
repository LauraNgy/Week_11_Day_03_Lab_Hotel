import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom confRoom;

    @Before
    public void before() {
        confRoom = new ConferenceRoom("The Quorum", 20);
    }

    @Test
    public void hasName() {
        assertEquals("The Quorum", confRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(20, confRoom.getCapacity());
    }

    @Test
    public void hasGuests() {
        assertEquals(0, confRoom.getGuests().size());
    }
}
