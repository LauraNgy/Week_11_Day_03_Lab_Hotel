import java.util.ArrayList;
import java.util.BitSet;

public class Bedroom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;
    private boolean occupied;

    public Bedroom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.occupied = false;
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList getGuests() {
        return this.guests;
    }
}
