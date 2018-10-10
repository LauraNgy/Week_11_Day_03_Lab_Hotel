import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom confRoom;
    DiningRoom diningRoom;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom("Pentmoon suite", 2);
        confRoom = new ConferenceRoom("The Quorum", 20);
        diningRoom = new DiningRoom("The Granary", 25);
        hotel.addBedroom(bedroom);
        hotel.addConferenceRoom(confRoom);
        hotel.addDineRoom(diningRoom);
    }

    @Test
    public void hasRooms() {
        assertEquals(1, hotel.getBedrooms().size());
        assertEquals(1, hotel.getConfRooms().size());
        assertEquals(1, hotel.getDineRooms().size());
    }

    @Test
    public void addRooms() {
        hotel.addBedroom(bedroom);
        assertEquals(2, hotel.getBedrooms().size());
        hotel.addConferenceRoom(confRoom);
        assertEquals(2, hotel.getConfRooms().size());
        hotel.addDineRoom(diningRoom);
        assertEquals(2, hotel.getDineRooms().size());
    }

//    @Test
//    public void canCheckIn() {
//        hotel.checkIn(bedroom, guest);
//        assertEquals(1, hotel.getBedrooms().);
//
//    }

    @Test
    public void cannotCheckIn() {

    }
    @Test
    public void canCheckOut() {

    }
}
