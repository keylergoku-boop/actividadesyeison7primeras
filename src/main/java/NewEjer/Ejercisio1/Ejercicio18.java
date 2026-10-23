package NewEjer.Ejercisio1;

import javax.swing.*;

/* 18. Desarrollar un algoritmo que calcule e imprima el perímetro y el área de un
cuadrado dado uno de sus lados*/
public class Ejercicio18 {
    static void main(){
        boolean estado;
        int  lado1, perimetro, area;
        do {
            estado = true;
            try {
                lado1 = Integer.parseInt(JOptionPane.showInputDialog("LADO #1"));
                if (lado1 !=0){
                    perimetro = 4 *  lado1;
                    area = lado1 * lado1;
                    JOptionPane.showMessageDialog(null,"LADO    " +lado1
                    + "\nPERIMETRO  " + perimetro
                    + "\nAREA   " + area);
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"repetir");
                estado = false;
            }
        }while (!estado);
    }
}
