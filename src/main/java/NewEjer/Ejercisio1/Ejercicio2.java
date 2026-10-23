package NewEjer.Ejercisio1;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/*2. Un empleado gana en su salario total mensual $1.056.028, si trabajo un total de
36 horas, calcular una solución algorítmica que permita imprimir cual es el valor de
una hora trabajada. */
public class Ejercicio2 {
    static void main() {
        Locale f = Locale.of("es", "CO");
        NumberFormat formateo = NumberFormat.getCurrencyInstance(f);
        BigDecimal salarioM = new BigDecimal("1056028"), valorHora;
        byte horas = 36;
        boolean estado;
        do {
            estado = true;
            try {
                valorHora = salarioM.divide(BigDecimal.valueOf(horas), 2, RoundingMode.HALF_EVEN);
                JOptionPane.showMessageDialog(null, "VALOR HORA  " + formateo.format(valorHora));
            } catch (NumberFormatException e) {
                estado = false;
                JOptionPane.showMessageDialog(null, "repetir x bobo");
            }
        } while (!estado);
    }
}
