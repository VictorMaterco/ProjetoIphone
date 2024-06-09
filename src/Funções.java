public class Funções implements reprodutorMusical, aparelhoTelefonico, navegadorNaInternet {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreiroVoz() {
        System.out.println("Correiro de voz, deixe sua mensagem.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina.");
    }
}
