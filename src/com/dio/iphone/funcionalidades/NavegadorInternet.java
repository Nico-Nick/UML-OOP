package com.dio.iphone.funcionalidades;

public class NavegadorInternet {
    private String paginaAtual;

    public NavegadorInternet() {
        // Constructor
    }

    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("🌍 Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("➕ Nova aba adicionada no navegador.");
    }

    public void atualizarPagina() {
        if (paginaAtual != null && !paginaAtual.isEmpty()) {
            System.out.println("🔄 Atualizando página: " + paginaAtual);
            // Simulate refreshing by re-displaying
            System.out.println("🌍 Exibindo página: " + paginaAtual);
        } else {
            System.out.println("⚠️ Nenhuma página para atualizar. Exiba uma página primeiro.");
        }
    }
}