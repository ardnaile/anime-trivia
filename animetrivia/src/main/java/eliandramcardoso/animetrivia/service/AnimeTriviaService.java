package eliandramcardoso.animetrivia.service;

import eliandramcardoso.animetrivia.models.respostaUser;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import java.util.Objects;

import static eliandramcardoso.animetrivia.service.AnimeApiService.getArrayFromAPI;

@Service
public class AnimeTriviaService {
    private String[] lastCharacterData;

    public String jogar(){
        lastCharacterData = getArrayFromAPI();

        String personagem = lastCharacterData[2];
        String id = lastCharacterData[3];

        System.out.println("id em frase: " + id); // debug

        JSONObject jsonExemplo = new JSONObject();
        jsonExemplo.put("resposta", "<insira aqui sua resposta>");
        jsonExemplo.put("id", id);

        return ("O personagem " + personagem + " está em qual anime? \n\nFaça uma requisição POST no caminho /jogar/responder com o id " +
                id + " e a sua resposta em formato json! \n\nExemplo: " + jsonExemplo);
    }
    public String validar(respostaUser resposta) {
        String anime = lastCharacterData[1];
        String id = lastCharacterData[3];

        System.out.println("id em validar: " + id); // debug

        // tratando as strings antes de validar!
        String idLowerCase = id.toLowerCase();
        String animeLowerCase = anime.toLowerCase();
        String respostaIdLowerCase = resposta.getId().toLowerCase();

        boolean acertou = (respostaIdLowerCase.equals(idLowerCase) && resposta.getResposta().equalsIgnoreCase(animeLowerCase));
        boolean idErrado = (!respostaIdLowerCase.equals(idLowerCase));

        if (lastCharacterData == null) {
            return ("Não há dados para validar. Faça uma requisição para /jogar primeiro.");
        }else if (acertou){
            return ("Boa! Você acertou!\n\nFaça uma requisição GET para /jogar para jogar novamente!");
        }else if (idErrado){
            return ("O id que você forneceu não é o mesmo da frase que você viu!");
        }
        return ("Ops! Você errou!\n\nFaça uma requisição GET para /jogar para jogar novamente!");
    }

    public String obterJsonAjuda(){
        JSONObject jsonAjuda = new JSONObject();
        jsonAjuda.put("estudante", "Eliandra Motta Cardoso");
        jsonAjuda.put("projeto", "Anime Trivia");
        return jsonAjuda.toString();
    }

}
