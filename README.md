# Anime Trivia

### Descrição 

Projeto intermediário da matéria de Back-end do curso de Engenharia de Software da Unisatc. A proposta é desenvolver um pequeno serviço capaz de fornecer rotas para requisições utilizando Java e Spring.

A ideia incial para o Anime Trivia era mostrar uma frase de algum anime ao usuário que, por sua vez, deveria responder em qual anime aquela frase foi dita. Porém, para deixar o jogo mais fácil, foi optado por mostrar o nome de um personagem e solicitar ao usuário que diga de qual anime é aquele personagem. O serviço vai retornar se o usuário acertou ou não!

### Estrutura do projeto

No geral, o projeto está estruturado da seguinte maneira:
- um controller cuida das requisições;
- um serviço busca os dados do anime, frase e personagem na API [anime-chan](https://github.com/RocktimSaikia/anime-chan);
- um serviço cuida das outras funções como retornar o personagem para o usuário e validar a resposta;
- um model foi criado para guardar a resposta do usuário.

### Requisições

- ("/") Requisição GET para ter uma breve descrição e instrução sobre o service;
- ("/jogar") Requisição GET para receber o nome de um personagem e as instruções para responder;
- ("/ajuda") Requisição GET que retorna o nome do projeto e o responsável;
- ("/jogar/responder") Requisição POST para responder de qual anime é aquele personagem e saber se você acertou ou não!
Todas as requisições foram testadas usando o Insomnia!

Professor orientador: [Ramon Venson](https://github.com/rvenson)
