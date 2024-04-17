package eliandramcardoso.animetrivia.controller;

import eliandramcardoso.animetrivia.models.AnimeInfo;
import eliandramcardoso.animetrivia.models.Resposta;
import eliandramcardoso.animetrivia.service.AnimeTriviaService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anime")
public class AnimeTriviaController {

    private final AnimeTriviaService animeTriviaService;
    @Autowired
    public AnimeTriviaController(AnimeTriviaService animeTriviaService) {
        this.animeTriviaService = animeTriviaService;
    }

    @GetMapping("/frase")
    public ResponseEntity<String> obterFraseAnime() {
        return ResponseEntity.ok(animeTriviaService.obterFraseAnime());
    }

    @GetMapping("/ajuda")
    public ResponseEntity<String> obterJsonAjuda(){
        return ResponseEntity.ok(animeTriviaService.obterJsonAjuda());
    }

    /*
    @PostMapping("/validar")
    public ResponseEntity<String> validar(@RequestBody Resposta respostaAnime){
        boolean respostaCerta = animeTriviaService.validar(String.valueOf(respostaAnime));
        if (respostaCerta) {
            return ResponseEntity.ok("Você acertou!");
        }
        return ResponseEntity.ok("Você errou!");
    }
     */
}




