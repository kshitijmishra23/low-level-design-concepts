package assignment2.model;

public class Screen {

    private Long screenId;
    private Boolean seats[][];

    public Screen(Long screenId, Boolean[][] seats) {
        this.screenId = screenId;
        this.seats = seats;
    }

    public Long getScreenId() {
        return screenId;
    }

    public Boolean[][] getSeats() {
        return seats;
    }
}
