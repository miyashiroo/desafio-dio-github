package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        // Unchecked (runtime) -> exceptions que PODEM ser evitados se forem tratados e analisados pelo desenvolvedor
        // Checked exception :  Exceptions que DEVEM ser eviytados e tratados  pelo desenvolvedor

        String a  = JOptionPane.showInputDialog("numerador: ");
        String b = JOptionPane.showInputDialog("denominador: ");


try {
    int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));

    System.out.println("resultado  = " + resultado);

} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "entrada invalida, informe um numero inteiro: "
            + e.getMessage());
//    e.printStackTrace();

}finally {
    System.out.println("Chegou no finally");
}


    }


    public static int dividir(int a, int b) {return a/b;}
}