package OrdenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Shiro","preto", 2));
            add(new Gato("Shiro","siames", 1));
            add(new Gato("Dalesan","branco", 4));
        }};
        System.out.println("Lista ordem de inserção: ");
        System.out.println(gatos);

        System.out.println("Ordem aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Ordem natural(nome)");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Ordem Idade: ");
        Collections.sort(gatos,new ComparatorIdade());
        System.out.println(gatos);
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);;

        System.out.println("--\tOrdem cor\t--");
        Collections.sort(gatos,new ComparatorCor());
        System.out.println(gatos);
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);;

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
        Collections.sort(gatos,new ComparatorNomeCorIdade());
        System.out.println(gatos);
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);;


    }

}
