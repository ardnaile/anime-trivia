package eliandramcardoso.animetrivia.service;

import eliandramcardoso.animetrivia.models.AnimeInfo;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.stereotype.Service;


@Service
public class AnimeTriviaService {

    public String obterFraseAnime() {
        return (AnimeInfo.getQuote());
    }

    public String obterJsonAjuda(){
        JSONObject jsonAjuda = new JSONObject();
        jsonAjuda.put("estudante", "Eliandra Motta Cardoso");
        jsonAjuda.put("projeto", "Anime Trivia");
        return jsonAjuda.toString();
    }

    /*
    public Boolean validar(Object anime){
        return anime.equals(AnimeInfo.getAnime());
    }
     */

}
