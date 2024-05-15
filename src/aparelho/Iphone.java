package aparelho;
import interfaces.Internet;
import interfaces.Ipod;
import interfaces.Telefone;

public class Iphone implements Telefone, Ipod, Internet{

    @Override
    public void acessarInternet() {
        System.out.println("ACESSANDO INTERNET VIA IPHONE");
    }

    @Override
    public void tocarMusica() {
        System.out.println("TOCANDO MUSICA VIA IPHONE");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("FAZENDO LIGACAO VIA IPHONE");
    }

    @Override
    public void receberLigacao(){
        System.out.println("RECEBENDO LIGAÇAO VIA IPHONE");
    }

}
