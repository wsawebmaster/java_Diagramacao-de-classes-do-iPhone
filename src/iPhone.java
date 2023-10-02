package src;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void ligar(String numero) {
        System.out.println("Realizando ligação");
    }

    @Override
    public void atender(String numero) {
        System.out.println("Chamada Atendida");
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Página Web");
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionado nova aba de navegação");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("iPhone tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
