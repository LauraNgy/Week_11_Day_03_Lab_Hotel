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
}
