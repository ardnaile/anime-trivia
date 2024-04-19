package eliandramcardoso.animetrivia.controller;


import eliandramcardoso.animetrivia.models.respostaUser;
import eliandramcardoso.animetrivia.service.AnimeTriviaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static eliandramcardoso.animetrivia.service.AnimeTriviaService.getArrayInfoAnime;

@RestController
@RequestMapping("/animetrivia")
public class AnimeTriviaController {

    private final AnimeTriviaService animeTriviaService;
    @Autowired
    public AnimeTriviaController(AnimeTriviaService animeTriviaService) {
        this.animeTriviaService = animeTriviaService;
    }

    @GetMapping("/frase")
    public ResponseEntity<String> obterFraseAnime() {

        return ResponseEntity.ok(animeTriviaService.frase());
    }

    @PostMapping("/frase/validar")
    public ResponseEntity<Object> validar(@RequestBody respostaUser resposta){
        // debbug
        System.out.println("id = " + resposta.getIdUser() + " personagem = " + resposta.getPersonagemUser());

        String[] array = getArrayInfoAnime();
        String frase = array[0];
        System.out.println(frase);

        return ResponseEntity.ok(animeTriviaService.validar(resposta));
    }

    @GetMapping("/ajuda")
    public ResponseEntity<String> obterJsonAjuda(){
        return ResponseEntity.ok(animeTriviaService.obterJsonAjuda());
    }


}




