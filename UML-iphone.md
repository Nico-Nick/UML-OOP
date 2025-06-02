## CONCLUSAO DO DESAFIO - UML/OOP

![image](https://github.com/user-attachments/assets/111ad7ab-4689-4569-92dd-34c3c216a2cd)
--

classDiagram
    direction LR

    class ReprodutorMusical {
        -musicaAtual: String
        -tocando: boolean
        +ReprodutorMusical()
        +tocar(): void
        +pausar(): void
        +selecionarMusica(musica: String): void
    }

    class AparelhoTelefonico {
        +AparelhoTelefonico()
        +ligar(numero: String): void
        +atender(): void
        +iniciarCorreioVoz(): void
    }

    class NavegadorInternet {
        -paginaAtual: String
        +NavegadorInternet()
        +exibirPagina(url: String): void
        +adicionarNovaAba(): void
        +atualizarPagina(): void
    }

    class iPhone {
        -reprodutor: ReprodutorMusical
        -telefone: AparelhoTelefonico
        -navegador: NavegadorInternet
        +iPhone()
        +tocarMusica(): void
        +pausarMusica(): void
        +selecionarNovaMusica(musica: String): void
        +fazerLigacao(numero: String): void
        +atenderLigacao(): void
        +iniciarChamadaVoz(): void
        +navegarParaPagina(url: String): void
        +abrirNovaAbaNavegador(): void
        +recarregarPaginaAtual(): void
    }

    iPhone "1" o--> "1" ReprodutorMusical : aggregation
    iPhone "1" o--> "1" AparelhoTelefonico : aggregation
    iPhone "1" o--> "1" NavegadorInternet : aggregation
