package eliandramcardoso.animetrivia.controller;

import eliandramcardoso.animetrivia.AnimeTriviaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anime")
public class AnimeTriviaController {

    @Autowired
    private final AnimeTriviaService animeTriviaService;

    @Autowired
    public AnimeTriviaController(AnimeTriviaService animeTriviaService) {
        this.animeTriviaService = animeTriviaService;
    }

    @GetMapping("/frase")
    public ResponseEntity<String> obterFraseAnime() {
        return ResponseEntity.ok(animeTriviaService.obterFraseAnime());
    }

}




