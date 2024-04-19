package eliandramcardoso.animetrivia.models;

import eliandramcardoso.animetrivia.service.AnimeApiService;

public class AnimeInfo extends AnimeApiService {

    private String anime;
    private String character;
    private String quote;

    public AnimeInfo(String anime, String character, String quote){
        this.anime = anime;
        this.character = character;
        this.quote = quote;
    }

    public static String getAnime() {
        return (getDadosApi().getString("anime"));
    }

    public void setAnime(String anime) { this.anime = anime;}

    public static String getCharacter() {
        return (getDadosApi().getString("character"));
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public static String getQuote() {
        return (getDadosApi().getString("quote"));
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}

