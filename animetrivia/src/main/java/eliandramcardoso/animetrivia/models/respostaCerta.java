package eliandramcardoso.animetrivia.models;

public class respostaCerta {
    private static String respostaCerta = AnimeInfo.getCharacter();

    public static String getRespostaCerta() {
        return respostaCerta;
    }

    public void setRespostaCerta(String nome) {
        this.respostaCerta = respostaCerta;
    }

}
