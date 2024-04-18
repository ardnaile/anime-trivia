package eliandramcardoso.animetrivia.service;

import eliandramcardoso.animetrivia.models.AnimeInfo;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AnimeApiService {


    public static JSONObject getRespostaJSON() {
        RestTemplate restTemplate = new RestTemplate();

        // passando a url da api para uma variável
        String ANIMECHAN_API_URL = "https://animechan.xyz/api/random";

        // passando a resposta da api para uma variável
        String respostaAPI = restTemplate.getForObject(ANIMECHAN_API_URL, String.class);

        // passando essa resposta para um objeto jsonobject e retornando

        return new JSONObject(respostaAPI);
    }
}
