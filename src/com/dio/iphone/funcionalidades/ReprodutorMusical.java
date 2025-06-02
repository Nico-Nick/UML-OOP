package com.dio.iphone.funcionalidades;

public class ReprodutorMusical {
    private String musicaAtual;
    private boolean tocando = false;

    public ReprodutorMusical() {
        // Constructor
    }

    public void tocar() {
        if (musicaAtual != null && !musicaAtual.isEmpty()) {
            if (!tocando) {
                tocando = true;
                System.out.println("🎵 Tocando música: " + musicaAtual);
            } else {
                System.out.println("▶️ Música '" + musicaAtual + "' já está tocando.");
            }
        } else {
            System.out.println("⚠️ Nenhuma música selecionada para tocar.");
        }
    }

    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("⏸️ Música pausada: " + musicaAtual);
        } else {
            System.out.println("⚠️ Nenhuma música tocando para pausar.");
        }
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        this.tocando = false; // Reset playing state
        System.out.println("🎶 Música selecionada: " + musica);
    }
}