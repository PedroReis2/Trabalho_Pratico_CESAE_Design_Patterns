package Models;

public class RoomType {
    private int id;
    private String description;
    private double pricePerWeek;

    public RoomType(int id, String description, double pricePerWeek) {
        this.id = id;
        this.description = description;
        this.pricePerWeek = pricePerWeek;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPricePerWeek() {
        return pricePerWeek;
    }
}