import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom("Pentmoon suite", 2, 100.05);
    }

    @Test
    public void hasName() {
        assertEquals("Pentmoon suite", bedroom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasGuests() {
        assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void isOccupied() {
        assertEquals(false, bedroom.isOccupied());
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(100.05, bedroom.getRate(), 0.05);
    }
}
