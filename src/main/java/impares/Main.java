package impares;
/*Leer un número entero y determinar mediante estructuras condicionales anidadas si el
número es par o impar, y simultáneamente si es positivo, negativo o cero.*/

import javax.swing.*;

public class Main {
    static void main() {
        int numero, op;

        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO"));

        if (numero == 0){
            JOptionPane.showMessageDialog(null, "solo es    " + numero);
        } else {
            if (numero > 1) {
                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "NUMERO PAR  " + numero);
                } else {
                    JOptionPane.showMessageDialog(null, "NUMERO IMPAR  " + numero);
                }
            }
            if (numero < 1) {
                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "NUMERO PAR Y NEGATIVO  " + numero);
                }
            } else {
                JOptionPane.showMessageDialog(null, "NUMERO IMPAR Y NEGATIVO  " + numero);
            }
        }
    }
}
