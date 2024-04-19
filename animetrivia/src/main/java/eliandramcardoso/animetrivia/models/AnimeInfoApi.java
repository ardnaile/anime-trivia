package eliandramcardoso.animetrivia.models;

import eliandramcardoso.animetrivia.service.AnimeApiService;

import java.util.concurrent.atomic.AtomicInteger;


public class AnimeInfoApi extends AnimeApiService {

    static String[] array = getArrayFromAPI();

    private static String anime;
    private static String character;
    private static String quote;
    private static int id;

    public static String getAnime() {
        return (array[1]);
    }

    public void setAnime(String anime) { this.anime = anime;}

    public static String getCharacter() {
        return (array[2]);
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public static String getQuote() {
        return (array[0]);
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public static String getId(){
        return(array[3]);
    }

    public void setId(int id) {this.id = id;}
}

