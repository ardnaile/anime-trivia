package eliandramcardoso.animetrivia.service;

import eliandramcardoso.animetrivia.models.AnimeInfo;
import eliandramcardoso.animetrivia.models.respostaUser;
import eliandramcardoso.animetrivia.models.respostaCerta;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
public class AnimeTriviaService {

    public String obterFraseAnime() {
        return (AnimeInfo.getQuote() + AnimeInfo.getAnime());
    }

    public String obterJsonAjuda(){
        JSONObject jsonAjuda = new JSONObject();
        jsonAjuda.put("estudante", "Eliandra Motta Cardoso");
        jsonAjuda.put("projeto", "Anime Trivia");
        return jsonAjuda.toString();
    }

    public String validar(respostaUser resposta){
        if (Objects.equals(respostaUser.getRespostaUser(), respostaCerta.getRespostaCerta())){
            return ("Parabéns acertou");
        }
        return ("Parabéns errou!");
    }

}
