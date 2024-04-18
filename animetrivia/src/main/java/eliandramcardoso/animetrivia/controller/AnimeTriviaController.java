package eliandramcardoso.animetrivia.controller;


import eliandramcardoso.animetrivia.models.respostaUser;
import eliandramcardoso.animetrivia.service.AnimeTriviaService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/validar")
    public ResponseEntity<String> validar(@RequestBody respostaUser resposta){
        return ResponseEntity.ok(animeTriviaService.validar(resposta));
    }

    @GetMapping("/ajuda")
    public ResponseEntity<String> obterJsonAjuda(){
        return ResponseEntity.ok(animeTriviaService.obterJsonAjuda());
    }


}




