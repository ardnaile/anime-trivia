package eliandramcardoso.animetrivia.models;

public class respostaUser {

    private String resposta;
    private String id;

    public respostaUser(String personagemUser, String idUser){
        this.resposta = personagemUser;
        this.id = idUser;
    }
    public String  getResposta() { return resposta; }

    public void setResposta() {
        resposta = resposta;
    }

    public String getId() {return id;}

    public void setId() {id = id;}
}
