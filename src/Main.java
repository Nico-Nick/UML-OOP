import com.dio.iphone.iPhone;

// Main method for demonstration
public static void main(String[] args) {
    iPhone meuIPhone = new iPhone();

    System.out.println("\n--- 🎵 Testando Reprodutor Musical ---");
    meuIPhone.selecionarNovaMusica("Journey - Don't Stop Believin'");
    meuIPhone.tocarMusica();
    meuIPhone.pausarMusica();
    meuIPhone.tocarMusica(); // Resume (or starts again if logic was more complex)

    System.out.println("\n--- 📞 Testando Aparelho Telefônico ---");
    meuIPhone.fazerLigacao("0800-777-1234");
    meuIPhone.atenderLigacao();
    meuIPhone.iniciarChamadaVoz();

    System.out.println("\n--- 🌍 Testando Navegador na Internet ---");
    meuIPhone.navegarParaPagina("https://www.dio.me");
    meuIPhone.abrirNovaAbaNavegador();
    meuIPhone.recarregarPaginaAtual();

    System.out.println("\n--- Testes Adicionais ---");
    // Test playing without selecting music
    iPhone outroIphone = new iPhone();
    outroIphone.tocarMusica();
    // Test refreshing without displaying a page
    outroIphone.recarregarPaginaAtual();
}
