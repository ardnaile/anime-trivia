package eliandramcardoso.animetrivia.controller;


import eliandramcardoso.animetrivia.models.respostaUser;
import eliandramcardoso.animetrivia.service.AnimeApiService;
import eliandramcardoso.animetrivia.service.AnimeTriviaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static eliandramcardoso.animetrivia.service.AnimeApiService.getArrayFromAPI;


@RestController
@RequestMapping("/animetrivia")
public class AnimeTriviaController {
    @GetMapping("/")
    public ResponseEntity<String> boasVindas(){
        return ResponseEntity.ok("Olá! Seja bem vindo ao AnimeTrivia! \n\nFaça uma requisição GET para /jogar para iniciar o game ou em /ajuda para saber mais sobre o projeto!");
    }

    private final AnimeTriviaService animeTriviaService;
    @Autowired
    public AnimeTriviaController(AnimeTriviaService animeTriviaService) {
        this.animeTriviaService = animeTriviaService;
    }

    @GetMapping("/jogar")
    public ResponseEntity<String> jogar() {
        return ResponseEntity.ok(animeTriviaService.jogar());
    }
    @PostMapping("/jogar/responder")
    public ResponseEntity<Object> responder(@RequestBody respostaUser resposta){

        System.out.println("Resposta do usuário | id = " + resposta.getId() + " | anime = " + resposta.getResposta()); // debug
        return ResponseEntity.ok(animeTriviaService.validar(resposta));
    }

    @GetMapping("/ajuda")
    public ResponseEntity<String> obterJsonAjuda(){
        return ResponseEntity.ok(animeTriviaService.obterJsonAjuda());
    }


}




