import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom("Pentmoon suite", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Pentmoon suite", bedroom.getName());
    }
}
