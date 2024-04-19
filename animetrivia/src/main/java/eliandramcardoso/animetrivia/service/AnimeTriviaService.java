package eliandramcardoso.animetrivia.service;

import eliandramcardoso.animetrivia.models.AnimeInfoApi;
import eliandramcardoso.animetrivia.models.respostaUser;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class AnimeTriviaService {
    public String[] getArray(){
        String[] array = new String[4];
        array[0] = AnimeInfoApi.getQuote();
        array[1] = AnimeInfoApi.getAnime();
        array[2] = AnimeInfoApi.getCharacter();
        array[3] = AnimeInfoApi.getId();
        return array;
    }
    public String frase(){
        String[] array = getArray();
        System.out.println("id em frase: " + array[3]);
        return ("A frase \"" + array[0] + "\", do anime " + array[1] +
                " foi dita por qual personagem? Responda na requisição /validar com o id " + array[3]);
    }
    public String validar(respostaUser resposta){
        String[] array = getArray();
        System.out.println("id em validar: " + array[3]);
        boolean acertou = (Objects.equals(resposta.getIdUser(), array[3]) && Objects.equals(resposta.getPersonagemUser(), array[2]));
        boolean idErrado = (!Objects.equals(resposta.getIdUser(), array[3]));

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
