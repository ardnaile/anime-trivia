package eliandramcardoso.animetrivia.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class AnimeApiService {
    public static JSONObject getDadosApi() {

        RestTemplate restTemplate = new RestTemplate();

        // passando a url da api para uma variável
        String ANIMECHAN_API_URL = "https://animechan.xyz/api/random";

        // passando a resposta da api (json) para uma variável
        String respostaAPI = restTemplate.getForObject(ANIMECHAN_API_URL, String.class);

        // passando essa resposta para um objeto jsonobject e retornando
        System.out.println("gerou novo objeto");

        return new JSONObject(respostaAPI);
    }
    private static int id = 0;
    public static String[] getArrayFromAPI() {
        JSONObject dadosApi = getDadosApi();

        String quote = dadosApi.getString("quote");
        String anime = dadosApi.getString("anime");
        String character = dadosApi.getString("character");
        id++;

        return new String[]{quote, anime, character, String.valueOf(id)};
    }

}
