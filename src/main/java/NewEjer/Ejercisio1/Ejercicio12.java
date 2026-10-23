package NewEjer.Ejercisio1;

import javax.swing.*;

/* 12. Un programa que obtiene la última cifra de un número introducido.*/
public class Ejercicio12 {
    static void main() {
        float numero;
        int ultimo;
        boolean estado;
        do {
            estado = true;
            try {
                numero = Float.parseFloat(JOptionPane.showInputDialog("INGRESE EL VALOR"));
                if (numero != 0) {
                    ultimo = (int) numero % 10;
                    JOptionPane.showMessageDialog(null, "NUMERO  " + numero
                            + "\nULTIMO NUEMRO    " + ultimo);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "repetir porque fallaste");
                estado = false;
            }
        } while (!estado);
    }
}
