import java.util.ArrayList;

public class Bedroom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;
    private boolean occupied;
    private double nightlyRate;

    public Bedroom(String name, int capacity, double nightlyRate) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.occupied = false;
        this.nightlyRate = nightlyRate;
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

    public boolean isOccupied() {
        return this.occupied;
    }

    public double getRate() {
        return this.nightlyRate;
    }

    public void occupy() {
        this.occupied = true;
    }

    public void vacate() {
        this.occupied = false;
    }
}
