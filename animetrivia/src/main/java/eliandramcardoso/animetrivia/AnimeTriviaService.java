package eliandramcardoso.animetrivia;

import eliandramcardoso.animetrivia.models.AnimeInfo;
import org.springframework.stereotype.Service;


@Service
public class AnimeTriviaService {

    public String obterFraseAnime() {
        return (AnimeInfo.getQuote());
    }
}