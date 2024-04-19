package eliandramcardoso.animetrivia.models;

public class respostaUser {

    private String personagemUser;
    private String idUser;

    public respostaUser(String personagemUser, String idUser){
        this.personagemUser = personagemUser;
        this.idUser = idUser;
    }
    public String  getPersonagemUser() { return personagemUser; }

    public void setRespostaUser() {
        personagemUser = personagemUser;
    }

    public String getIdUser() {return idUser;}

    public void setIdUser() {idUser = idUser;}
}
