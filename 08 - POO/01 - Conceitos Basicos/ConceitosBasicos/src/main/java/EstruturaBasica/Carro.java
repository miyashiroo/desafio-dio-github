package EstruturaBasica;

public class Carro {
    private String marca;
    private int capacidadeTanque;
    private String cor;

    public double encherTanque(double valorGasolina){
        return capacidadeTanque * valorGasolina;

    }

    public Carro(String marca,int capacidadeTanque, String cor){
        this.marca = marca;
        this.capacidadeTanque = capacidadeTanque;
        this.cor = cor;

    }
    public double Carro(double valorGasolina){
         return encherTanque(valorGasolina);
    }

    public Carro(){
        this.marca = null;
        this.capacidadeTanque = 0;
        this.cor = null;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
