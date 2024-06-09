public class Iphone {
    public static void main(String[] args) {
        Funções fun = new Funções();

        System.out.println("Utilizando função reproduzir musica");
        fun.tocarMusica();
        fun.pausarMusica();
        fun.selecionarMusica("Carta Aberta - MC Cabelinho");

        System.out.println("Utilizando função de realizar ligação");
        fun.ligar("47991751597");
        fun.atender();
        fun.iniciarCorreiroVoz();

        System.out.println("Utilizando função de navegar na internet");
        fun.exibirPagina("fb.com");
        fun.adicionarNovaAba();
        fun.atualizarPagina();
    }
}
