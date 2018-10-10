import java.util.ArrayList;

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
        if (bedroom.getCapacity() > bedroom.getGuests().size()) {
            bedroom.getGuests().add(guest);
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
}
