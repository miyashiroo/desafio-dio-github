public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println( "A tv está ligada? " + smartTv.ligada);
        System.out.println( "A tv está em qual canal? " + smartTv.canal);
        System.out.println( "Qual o volume da tv? " + smartTv.volume);

        smartTv.ligar();
        System.out.println( "A tv está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println( "A tv está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("volume atual: " + smartTv.volume );


        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(56);
    }
}
