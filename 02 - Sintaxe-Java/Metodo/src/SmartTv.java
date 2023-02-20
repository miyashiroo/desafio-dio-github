public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("volume aumentado para: " + volume);

    }
    public void diminuirVolume(){
        volume--;
        System.out.println("volume diminuido para: " + volume);
    }

    public void aumentarCanal (){
        canal++;
        System.out.println("Canal mudado para " + canal);
    }

    public void diminuirCanal (){
        canal--;
        System.out.println("Canal mudado para " + canal);
    }

    public void mudarCanal(int canalDesejado){
        canal = canalDesejado;
        System.out.println("Canal mudado para " + canal);
    }

}
