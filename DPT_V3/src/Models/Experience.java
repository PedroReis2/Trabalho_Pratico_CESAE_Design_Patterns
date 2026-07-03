package Models;

public class Experience {
    private String id;
    private String nome;
    private String idExperience;
    private int adultPrice;
    private int childPrice;

    public Experience(String id, String nome, String idExperience, int adultPrice, int childPrice) {
        this.id = id;
        this.nome = nome;
        this.idExperience = idExperience;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIdExperience() {
        return idExperience;
    }

    public int getAdultPrice() {
        return adultPrice;
    }

    public int getChildPrice() {
        return childPrice;
    }
}
