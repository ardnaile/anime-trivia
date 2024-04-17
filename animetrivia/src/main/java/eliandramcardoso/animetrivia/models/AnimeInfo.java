package eliandramcardoso.animetrivia.models;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

public class AnimeInfo {

    static RestTemplate restTemplate = new RestTemplate();

    // passando a url da api para uma variável
    static String ANIMECHAN_API_URL = "https://animechan.xyz/api/random";

    // passando a resposta da api para uma variável
    static String respostaAPI = restTemplate.getForObject(ANIMECHAN_API_URL, String.class);

    // passando essa resposta para um objeto jsonobject
    static JSONObject respostaJSON = new JSONObject(respostaAPI);

    private String anime;
    private String character;
    private String quote;

    public static String getAnime() {
        return (respostaJSON.getString("anime"));
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    public String getCharacter() {
        return (respostaJSON.getString("character"));
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public static String getQuote() {
        return (respostaJSON.getString("quote"));
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}

