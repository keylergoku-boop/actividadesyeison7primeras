package ultimo;

import javax.swing.*;
import java.math.BigDecimal;

/* Diseñar e implementar una clase CuentaBancaria que aplique encapsulamiento (atributos
privados titular y saldo), constructor para inicializar valores, y métodos públicos depositar, retirar
(validando fondos suficientes) y consultarSaldo. Crear una clase ejecutable con el método main que
instancie un objeto y pruebe las operaciones.*/
public class Main {
    static void main(String[] args) {
        // 2horas peliando porque me rotornaba algo mal y resulta que el error era entre la cama y la pc
        Metodos mt = new Metodos();

        String t;
        BigDecimal saldo, cant;

        try {
            t = JOptionPane.showInputDialog("INGRESE SU NOMBRE");
            saldo = new BigDecimal(JOptionPane.showInputDialog("INGRESE SU SALDO"));

            if (saldo.compareTo(new BigDecimal("0")) > 0) {
                mt.depositarsaldo(t, saldo);
            } else {
                JOptionPane.showMessageDialog(null,
                        "saldo debe ser mayor a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            int op = JOptionPane.showConfirmDialog(null, "DESEA CONSULTAR SU SALDO?");

            if (op == JOptionPane.YES_OPTION) {
                mt.consultarsaldo();

            }

            op = JOptionPane.showConfirmDialog(null, "DESEA RETIRAR SU SALDO?");

            if (op == JOptionPane.YES_OPTION) {
                cant = new BigDecimal(JOptionPane.showInputDialog("INGRESE LA CANTIDAD"));
                mt.retirarCulitos(cant);
            }

            op = JOptionPane.showConfirmDialog(null, "DESEA CONSULTAR SU SALDO?");

            if (op == JOptionPane.YES_OPTION) {
                mt.consultarsaldo();
            } else {
                JOptionPane.showMessageDialog(null, "GRACIAS POR VISITAR");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "DILIGENCIA LOS DATOS CORRECTAMENTE");
        }
    }
}
