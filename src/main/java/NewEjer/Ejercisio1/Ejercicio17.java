package NewEjer.Ejercisio1;

import javax.swing.*;

/*17. Desarrollar un algoritmo que calcule e imprima el perímetro y el área de un
rectángulo dada la longitud de dos de sus lados.*/
public class Ejercicio17 {
    static void main() {
        int lado1, lado2, perimetro, area;
        boolean estado;

        do {
            estado = true;
            try {
                lado1 = Integer.parseInt(JOptionPane.showInputDialog("LADO 1"));
                lado2 = Integer.parseInt(JOptionPane.showInputDialog("LADO 2"));
                if (lado1 != 0 && lado2 != 0) {
                    perimetro = 2 * (lado1 + lado2);
                    area = lado1 * lado2;

                    JOptionPane.showMessageDialog(null, "LADO #1    " + lado1
                            + "\nLADO #2    " + lado2
                            + "\nP                  " + perimetro + " cm2"
                            + "\nA                  " + area + " cm2");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR DE DATOS");
                estado = false;
            }
        } while (!estado);
    }
}
