package Models;

public class Reservation {
    private String id;
    private int roomNum;
    private int clientId;
    private int year;
    private int month;
    private int week;

    public Reservation(String id, int roomNum, int clientId, int year, int month, int week) {
        this.id = id;
        this.roomNum = roomNum;
        this.clientId = clientId;
        this.year = year;
        this.month = month;
        this.week = week;
    }

    public String getId() {
        return id;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public int getClientId() {
        return clientId;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getWeek() {
        return week;
    }
}
