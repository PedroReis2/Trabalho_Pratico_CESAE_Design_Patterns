package Models;

public class Client {
    private String id;
    private String nome;
    private String nacionalidade;
    private String email;
    private String telemovel;
    private String dataNascimento;
    private boolean consentimentoMarketing;


    public Client(String id, String nome, String nacionalidade, String email, String telemovel, String dataNascimento, boolean consentimentoMarketing) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.email = email;
        this.telemovel = telemovel;
        this.dataNascimento = dataNascimento;
        this.consentimentoMarketing = consentimentoMarketing;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public boolean isConsentimentoMarketing() {
        return consentimentoMarketing;
    }
}
