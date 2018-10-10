public class Guest {

    private int numberOfGuests;

    public Guest() {
        this.numberOfGuests = 1;
    }


    public int getNumberOfGuests() {
        return this.numberOfGuests;
    }

    public void amend(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
}
