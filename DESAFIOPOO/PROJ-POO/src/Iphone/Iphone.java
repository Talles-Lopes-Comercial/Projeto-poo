package Iphone;
import Navegar.Internet;
import Teleone.Telefone;
import musica.ReprodutorMusical;

public class Iphone implements Telefone, Internet, ReprodutorMusical {
    
    public  void ligar(String numero) {
        System.out.println("Ligando para: "+ numero);
    }

   
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }

  
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: "+ url);
    }

   
    public void adicionarNovaAba() {
        System.out.println("Adiciona nova aba");
    }

  
    public void atualizarPagina() {
        System.out.println("Atualiza pagina");
    }

    
    public void tocar() {
        System.out.println("Tocar");
    }

    
    public void pausar() {
        System.out.println("Pausar");
    }

    
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " +musica);
    }
}