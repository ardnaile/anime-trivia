package eliandramcardoso.animetrivia.service;

import eliandramcardoso.animetrivia.models.AnimeInfo;
import eliandramcardoso.animetrivia.models.respostaUser;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class AnimeTriviaService {
    private static final AtomicInteger idCounter = new AtomicInteger(1);

    public static String[] getArrayInfoAnime(){
        String[] infoAnime = new String[4];

        infoAnime[0] = AnimeInfo.getQuote();
        infoAnime[1] = AnimeInfo.getAnime();
        infoAnime[2] = AnimeInfo.getCharacter();
        infoAnime[3] = String.valueOf(idCounter.getAndIncrement());

        return infoAnime;
    }
    public String frase() {
        String[] array = getArrayInfoAnime();
        String frase = array[0];
        String anime = array[1];
        String id = array[3];
        return ("A frase \"" + frase + "\", do anime " + anime +
                " foi dita por qual personagem? Responda na requisição /validar com o id " + id);
    }

    public String validar(respostaUser resposta){
        String[] array = getArrayInfoAnime();
        String personagem = array[2];
        String id = array[3];

        boolean acertou = (Objects.equals(resposta.getIdUser(), id) && Objects.equals(resposta.getPersonagemUser(), personagem));
        boolean idErrado = (!Objects.equals(resposta.getIdUser(), id));

        if (acertou){
            return ("Parabéns acertou");
        } else if (idErrado){
            return ("O id que você forneceu não é o mesmo da frase que você viu!");
        }
        return ("Parabéns errou!");
    }

    public String obterJsonAjuda(){
        JSONObject jsonAjuda = new JSONObject();
        jsonAjuda.put("estudante", "Eliandra Motta Cardoso");
        jsonAjuda.put("projeto", "Anime Trivia");
        return jsonAjuda.toString();
    }

}
