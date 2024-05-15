package cliente;

import aparelho.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphoneDoRodigo = new Iphone();

        iphoneDoRodigo.acessarInternet();
        iphoneDoRodigo.fazerLigacao();
        iphoneDoRodigo.tocarMusica();
        iphoneDoRodigo.receberLigacao();

    }
}
