import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> confRooms;
    private ArrayList<DiningRoom> dineRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.confRooms = new ArrayList<>();
        this.dineRooms = new ArrayList<>();
    }


    public ArrayList getBedrooms() {
        return this.bedrooms;
    }

    public ArrayList getConfRooms() {
        return this.confRooms;
    }

    public ArrayList getDineRooms() {
        return this.dineRooms;
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom confRoom) {
        this.confRooms.add(confRoom);
    }

    public void addDineRoom(DiningRoom diningRoom) {
        this.dineRooms.add(diningRoom);
    }

    public String bedroomCheckIn(Bedroom bedroom, Guest guest) {
        if (bedroom.getCapacity() > guest.getNumberOfGuests() && !bedroom.isOccupied()) {
            bedroom.getGuests().add(guest);
            bedroom.occupy();
            return "Guest added";
        }
            return "Not able to check in";
    }

    public String diningRoomCheckIn(DiningRoom diningRoom, Guest guest) {
        if (diningRoom.getCapacity() > diningRoom.getGuests().size()) {
            diningRoom.getGuests().add(guest);
            return "Guest added";
        }
        return "Not able to check in";
    }

    public String confRoomCheckIn(ConferenceRoom confRoom, Guest guest) {
        if (confRoom.getCapacity() > confRoom.getGuests().size()) {
            confRoom.getGuests().add(guest);
            return "Guest added";
        }
        return "Not able to check in";
    }

    public String bedroomCheckOut(Bedroom bedroom, Guest guest) {
        if (bedroom.getGuests().contains(guest)) {
            bedroom.getGuests().remove(guest);
            bedroom.vacate();
            return "Guest removed";
        }
        return "Attempting to check out a guest that has not been checked in here";
    }

    public String diningRoomCheckOut(DiningRoom diningRoom, Guest guest) {
        if (diningRoom.getGuests().contains(guest)) {
            diningRoom.getGuests().remove(guest);
            return "Guest removed";
        }
        return "Attempting to check out a guest that has not been checked in here";
    }

    public String confRoomCheckOut(ConferenceRoom confRoom, Guest guest) {
        if (confRoom.getGuests().contains(guest)) {
            confRoom.getGuests().remove(guest);
            return "Guest removed";
        }
        return "Attempting to check out a guest that has not been checked in here";
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        Booking booking = new Booking(bedroom, nights);
        return booking;
    }

    public double getBill(Booking booking) {
        return booking.getBedroom().getRate() * booking.getNights();
    }

    public ArrayList<Bedroom> getVacantBedrooms() {
        ArrayList<Bedroom> vacantRooms = new ArrayList<>();
        for ( int i = 0; i < bedrooms.size(); i++) {
            if (!bedrooms.get(i).isOccupied()) {
                vacantRooms.add(bedrooms.get(i));
            }
        }
        return vacantRooms;
    }
}
