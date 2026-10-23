package NewEjer.Ejercisio1;

import javax.swing.*;

/* Calcular el área de un triángulo, sabiendo la base y la altura.*/
public class Ejercicio4 {
    static void main() {
        float base, altura;
        boolean repetir;
        do {
            repetir = true;
            try {
                base = Float.parseFloat(JOptionPane.showInputDialog("BASE"));
                altura = Float.parseFloat(JOptionPane.showInputDialog("ALTURA"));
                if (base > 0.0f && altura > 0.0f) {
                    float resultado = (base * altura) / 2;
                    String ms = "AREA   " + resultado + " cm2";
                    JOptionPane.showMessageDialog(null, ms);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "LLENAR CORRECTAMENTE", "ERROR", JOptionPane.ERROR_MESSAGE);
                repetir = false;
            }
        } while (!repetir);
    }
}
