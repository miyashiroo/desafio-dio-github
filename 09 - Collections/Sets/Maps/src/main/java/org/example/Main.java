package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário: ");
        Map<String,Double> carros = new HashMap<>(){{
           put("Hass", 13d);
           put("Mclaren", 15.6);
           put("Renault", 12.1);
           put("Ferrari" ,34d);
           put("ford", 4d);
        }};
        System.out.println(carros.toString());

        System.out.println("Substituir o consumo da hass: pra 14.4"); // não tem como acessar os valores, teremos que
        // teremos que substituir os dois valores.
        carros.put("Hass", 14.4);
        System.out.println(carros.toString());

        System.out.println("Confira se a mercedes está no dicionário: " + carros.containsKey("mercedes"));

        System.out.println("Exiba o consumo da renault: " + carros.get("Renault"));

        // como é um set, não tem como mostrar a ordem, pois o metodo adiciona sem ordem.


        System.out.println("Exiba os modelos: ");

        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos: ");
        Collection<Double> consumo = carros.values();
        System.out.println(consumo);

        System.out.println("modelo mais economico: o maior numero");
        Double maisEconomico = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modelomaisEficiente = "";
        for (Map.Entry<String,Double> entry: entries ) {
            if (entry.getValue().equals(maisEconomico)){
                System.out.println("O modelo mais economico é: " + entry.getKey() + " Com o consumo de: " +
                        entry.getValue());
            }

        }
        System.out.println("menos eficiente: ");
        Double consumoMenosEficiente = Collections.min(carros.values());
        String modeloMenosEficiente = "";


        for (Map.Entry<String,Double> entry : carros.entrySet()
             ) {
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " -> " + consumoMenosEficiente);
            }
        }



        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;

        }
        System.out.println("Exiba a soma dos consumos: " + soma) ;

        System.out.println("Exiba a media dos consumos do dicionario: " + soma/carros.size());
        System.out.println(carros);
        System.out.println("Remover o consumo de 15.6: ");
        Iterator<Double> iterator1 = carros.values().iterator();

        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next.equals(15.6)) {
                iterator1.remove();
            }
        }
        System.out.println(carros);

        System.out.println("exiba todos os carros na ordem em que foram informados: ");
        Map<String,Double> carrosPopularesLinked = new LinkedHashMap<>(){{
            put("Hass", 13d);
            put("Mclaren", 15.6);
            put("Renault", 12.1);
            put("Ferrari" ,34d);
            put("Ford", 4d);


        }};

        System.out.println(carrosPopularesLinked.toString());

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosTreeMap = new TreeMap<>(carrosPopularesLinked);
        System.out.println(carrosTreeMap.toString());


    }
}