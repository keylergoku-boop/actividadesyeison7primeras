package NewEjer.Ejercisio1;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    static void main() {
        float corte1, corte2, acumulado, notaMinima60;
        boolean estado = true;
        do {
            try {
                corte1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del Primer Corte (20%):"));
                corte2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del Segundo Corte (20%):"));

                if (corte1 < 0.0f || corte1 > 5.0f || corte2 < 0.0f || corte2 > 5.0f) {
                    JOptionPane.showMessageDialog(
                            null, "Las notas deben estar entre 0.0 y 5.0", "Error de Rango", JOptionPane.ERROR_MESSAGE
                    );
                } else {
                    acumulado = (corte1 * 0.20f) + (corte2 * 0.20f);
                    notaMinima60 = (3.0f - acumulado) / 0.60f;
                    String informacion = "ACUMULADO     " + acumulado
                            + "\nN° PARA PASAR   " + notaMinima60;
                    JOptionPane.showMessageDialog(null, informacion);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar valores numéricos válidos.", "Error de Entrada", JOptionPane.ERROR_MESSAGE
                );
                estado = false;
            }
        } while (!estado);

    }
}