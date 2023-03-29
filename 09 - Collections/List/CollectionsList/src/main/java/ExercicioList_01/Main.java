package ExercicioList_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        int count = 0;
        for (int i = 0; i < 6;i++){
            System.out.println("Digite a temperatura: ");
            double temperatura = scan.nextDouble();
            temperaturas.add(temperatura);

        }

        Iterator<Double> iterator = temperaturas.iterator();

        double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;

        }
        double media = soma / temperaturas.size();


        for (Double temp: temperaturas) {
            if (temp >= media){
                int index = temperaturas.indexOf(temp);
                switch (index){
                    case 0:
                        System.out.println("A temperatura de Janeiro foi de : " + temp + " Graus");
                        break;
                    case 1:
                        System.out.println("A temperatura de Fevereiro foi de : " + temp + " Graus");
                        break;
                    case 2:
                        System.out.println("A temperatura de Março foi de : " + temp + " Graus");
                        break;
                    case 3:
                        System.out.println("A temperatura de Abril foi de : " + temp + " Graus");
                        break;
                    case 4:
                        System.out.println("A temperatura de Maio foi de : " + temp + " Graus");
                        break;
                    case 5:
                        System.out.println("A temperatura de Junho foi de : " + temp + " Graus");
                        break;


                }
            }

        }





        System.out.println(media);

        System.out.println(temperaturas);



    }
}
