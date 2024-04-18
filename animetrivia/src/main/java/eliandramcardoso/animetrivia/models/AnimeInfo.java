package eliandramcardoso.animetrivia.models;

import eliandramcardoso.animetrivia.service.AnimeApiService;

public class AnimeInfo extends AnimeApiService {

    private String anime;
    private String character;
    private String quote;

    public static String getAnime() {
        return (getRespostaJSON().getString("anime"));
    }

    public void setAnime(String anime) { this.anime = anime;}

    public static String getCharacter() {
        return (getRespostaJSON().getString("character"));
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public static String getQuote() {
        return (getRespostaJSON().getString("quote"));
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}

