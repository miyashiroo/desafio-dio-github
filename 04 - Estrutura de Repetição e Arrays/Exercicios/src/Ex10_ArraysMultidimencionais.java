import java.util.Arrays;
import java.util.Random;

public class Ex10_ArraysMultidimencionais {
    /*
    Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. A
    pós isso determine o menor número da matriz e a sua posição(linha, coluna).
     */

    public static void main(String[] args) {
        Random random = new Random();
        int matriz[][] = new int[4][4];
        int menorNumero = 101;
        int posicaoLinha = 0;
        int posicaoColuna = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                int numeroRandom = random.nextInt(100);
                matriz[i][j] = numeroRandom;
                if (numeroRandom < menorNumero){
                    menorNumero = numeroRandom;
                    posicaoLinha = i;
                    posicaoColuna = j;
                }

            }
        }

        for (int[] linha: matriz ) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
                
            }
            System.out.println();

        }

        System.out.println("O menor numero é: " + menorNumero);
        System.out.println("Na Linha: " + posicaoLinha + " e na Coluna : " + posicaoColuna);




    }
}
