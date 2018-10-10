import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom otherBedroom;
    ConferenceRoom confRoom;
    DiningRoom diningRoom;
    Guest guest;
    Guest guest3;
    Booking booking;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom("Pentmoon suite", 2, 100.05);
        otherBedroom = new Bedroom("Honeyhouse suite", 2, 75.59);
        confRoom = new ConferenceRoom("The Quorum", 20);
        diningRoom = new DiningRoom("The Granary", 25);
        hotel.addBedroom(bedroom);
        hotel.addBedroom(otherBedroom);
        hotel.addConferenceRoom(confRoom);
        hotel.addDineRoom(diningRoom);
        booking = hotel.bookRoom(bedroom, 3);
        guest = new Guest();
        guest3 = new Guest();
        guest3.amend(3);

    }

    @Test
    public void hasRooms() {
        assertEquals(2, hotel.getBedrooms().size());
        assertEquals(1, hotel.getConfRooms().size());
        assertEquals(1, hotel.getDineRooms().size());
    }

    @Test
    public void addRooms() {
        hotel.addBedroom(bedroom);
        assertEquals(3, hotel.getBedrooms().size());
        hotel.addConferenceRoom(confRoom);
        assertEquals(2, hotel.getConfRooms().size());
        hotel.addDineRoom(diningRoom);
        assertEquals(2, hotel.getDineRooms().size());
    }

    @Test
    public void canCheckIn() {
        assertEquals("Guest added", hotel.bedroomCheckIn(bedroom, guest));
        assertEquals(1, bedroom.getGuests().size());
        assertEquals(true, bedroom.isOccupied());
        assertEquals("Guest added", hotel.diningRoomCheckIn(diningRoom, guest));
        assertEquals(1, diningRoom.getGuests().size());
        assertEquals("Guest added", hotel.confRoomCheckIn(confRoom, guest));
        assertEquals(1, confRoom.getGuests().size());
    }

    @Test
    public void cannotCheckIn() {
        hotel.bedroomCheckIn(bedroom, guest);
        assertEquals("Not able to check in", hotel.bedroomCheckIn(bedroom, guest));
        assertEquals("Not able to check in", hotel.bedroomCheckIn(otherBedroom, guest3));
    }

    @Test
    public void canCheckOut() {
        hotel.bedroomCheckIn(bedroom, guest);
        assertEquals("Guest removed", hotel.bedroomCheckOut(bedroom, guest));
        assertEquals(0, bedroom.getGuests().size());
        assertEquals(false, bedroom.isOccupied());
        hotel.diningRoomCheckIn(diningRoom, guest);
        assertEquals("Guest removed", hotel.diningRoomCheckOut(diningRoom, guest));
        assertEquals(0, diningRoom.getGuests().size());
        hotel.confRoomCheckIn(confRoom, guest);
        assertEquals("Guest removed", hotel.confRoomCheckOut(confRoom, guest));
        assertEquals(0, confRoom.getGuests().size());
    }

    @Test
    public void bookRooms() {
        assertEquals(3, booking.getNights());
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void totalBill() {
        assertEquals(300.15, hotel.getBill(booking), 0.10);
    }

    @Test
    public void getVacantBedrooms() {
        hotel.bedroomCheckIn(bedroom, guest);
        assertEquals(otherBedroom, hotel.getVacantBedrooms().get(0));
    }
}
