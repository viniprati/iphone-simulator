interface ReprodutorMusical {
    void tocarMusica(String musica);
    void pausarMusica();
    void pararMusica();
}

interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void atenderChamada();
    void encerrarChamada();
}

interface NavegadorInternet {
    void abrirPagina(String url);
    void navegarPara(String url);
    void fecharPagina();
}

class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }
    
    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }
    
    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    }
    
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }
    
    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }
    
    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }
    
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }
    
    @Override
    public void navegarPara(String url) {
        System.out.println("Navegando para: " + url);
    }
    
    @Override
    public void fecharPagina() {
        System.out.println("Página fechada.");
    }
}

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        
        System.out.println("Reprodutor Musical:");
        iphone.tocarMusica("Shape of You");
        iphone.pausarMusica();
        iphone.pararMusica();
        
        System.out.println("\nAparelho Telefônico:");
        iphone.fazerChamada("123-456-789");
        iphone.atenderChamada();
        iphone.encerrarChamada();
        
        System.out.println("\nNavegador na Internet:");
        iphone.abrirPagina("www.google.com");
        iphone.navegarPara("www.youtube.com");
        iphone.fecharPagina();
    }
}
