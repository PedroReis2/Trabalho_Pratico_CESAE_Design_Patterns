package Models;

public class Sales {
    private String id;
    private String experienceId;
    private String clientType;
    private int year;
    private int month;

    public Sales(String id, String experienceId, String clientType, int year, int month) {
        this.id = id;
        this.experienceId = experienceId;
        this.clientType = clientType;
        this.year = year;
        this.month = month;
    }

    public String getId() {
        return id;
    }

    public String getExperienceId() {
        return experienceId;
    }

    public String getClientType() {
        return clientType;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }
}
