package com.dio.iphone.funcionalidades;

public class AparelhoTelefonico {

    public AparelhoTelefonico() {
        // Constructor
    }

    public void ligar(String numero) {
        System.out.println("📞 Ligando para: " + numero + "...");
    }

    public void atender() {
        System.out.println("📲 Chamada atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("🗣️ Iniciando correio de voz...");
    }
}