package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> aluno = new HashMap<>();

        aluno.put("Nome", "Shiro" );
        aluno.put("Idade", "33");
        aluno.put("Media", "10");
        aluno.put("Turma", "3c");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String,String>> listAlunos = new ArrayList<>();

        listAlunos.add(aluno);

        Map<String,String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "dae" );
        aluno2.put("Idade", "11");
        aluno2.put("Media", "23");
        aluno2.put("Turma", "e1");

        listAlunos.add(aluno2);
        System.out.println(listAlunos);


    }
}
