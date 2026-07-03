package Models;

public class Guide {
    private String id;
    private String nome;
    private String nacionalidade;
    private String email;
    private String telemovel;

    public Guide(String id, String nome, String nacionalidade, String email, String telemovel) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getEmail() {
        return email;
    }

    public String getTelemovel() {
        return telemovel;
    }
}
