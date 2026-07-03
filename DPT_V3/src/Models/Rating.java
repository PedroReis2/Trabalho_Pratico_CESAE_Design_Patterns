package Models;

public class Rating {
  private String id;
  private String experienceId;
  private int experienceRating;
  private int experienceGuide;

    public Rating(String id, String experienceId, int experienceRating, int experienceGuide) {
        this.id = id;
        this.experienceId = experienceId;
        this.experienceRating = experienceRating;
        this.experienceGuide = experienceGuide;
    }

    public String getId() {
        return id;
    }

    public String getExperienceId() {
        return experienceId;
    }

    public int getExperienceRating() {
        return experienceRating;
    }

    public int getExperienceGuide() {
        return experienceGuide;
    }
}
