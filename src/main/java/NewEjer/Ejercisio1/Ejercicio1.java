package NewEjer.Ejercisio1;
/* 1. La empresa Prosegur tiene problema para calcular el salario neto a pagar a un
empleado, desarrollar una solución algoritmo que permita calcular e imprimir el
salario total, salario neto y el 5% del salario total como retención en la fuente,
ingresando por teclado el valor de la hora y el número de horas trabajadas.*/

import javax.swing.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Ejercicio1 {
    static void main() {
        DecimalFormat f = new DecimalFormat("#,###.###");
        boolean estado;
        BigDecimal salarioTotal, salarioNeto, retencionDeFuente, valorHora, numeroDeHorasTrabajadas;

        do {
            estado = true;
            try {
                valorHora = new BigDecimal(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA HORA"));
                numeroDeHorasTrabajadas = new BigDecimal(JOptionPane.showInputDialog("INGRESE EL NUMERO DE HORAS TRABAJADAS"));

                if (numeroDeHorasTrabajadas.compareTo(new BigDecimal("0")) > 0 && valorHora.compareTo(new BigDecimal("0")) > 0) {
                    salarioNeto = numeroDeHorasTrabajadas.multiply(valorHora);
                    retencionDeFuente = salarioNeto.multiply(new BigDecimal("0.05"));
                    salarioTotal = salarioNeto.subtract(retencionDeFuente);

                    JOptionPane.showMessageDialog(null, "SALARIO TOTAL                     " + f.format(salarioTotal)
                            + "\nSALARIO NETO                        " + f.format(salarioNeto)
                            + "\nRETENCION DE FUNETES     " + f.format(retencionDeFuente));
                } else {
                    JOptionPane.showMessageDialog(null, "VALORES NO VALIDOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "NO PUEDES INGRESAR TEXTO NI CAMPOS VACIOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                estado = false;
            } catch (Exception e) {
                estado = false;
                JOptionPane.showMessageDialog(null, "EROOR DESCONOCIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } while (!estado);

    }
}
