package com.dio.iphone;

import com.dio.iphone.funcionalidades.AparelhoTelefonico;
import com.dio.iphone.funcionalidades.NavegadorInternet;
import com.dio.iphone.funcionalidades.ReprodutorMusical;

public class iPhone {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public iPhone() {
        this.reprodutor = new ReprodutorMusical();
        this.telefone = new AparelhoTelefonico();
        this.navegador = new NavegadorInternet();
        System.out.println("✨ iPhone inicializado!");
    }

    // Métodos do Reprodutor Musical
    public void tocarMusica() {
        reprodutor.tocar();
    }

    public void pausarMusica() {
        reprodutor.pausar();
    }

    public void selecionarNovaMusica(String musica) {
        reprodutor.selecionarMusica(musica);
    }

    // Métodos do Aparelho Telefônico
    public void fazerLigacao(String numero) {
        telefone.ligar(numero);
    }

    public void atenderLigacao() {
        telefone.atender();
    }

    public void iniciarChamadaVoz() {
        telefone.iniciarCorreioVoz();
    }

    // Métodos do Navegador na Internet
    public void navegarParaPagina(String url) {
        navegador.exibirPagina(url);
    }

    public void abrirNovaAbaNavegador() {
        navegador.adicionarNovaAba();
    }

    public void recarregarPaginaAtual() {
        navegador.atualizarPagina();
    }
    }
