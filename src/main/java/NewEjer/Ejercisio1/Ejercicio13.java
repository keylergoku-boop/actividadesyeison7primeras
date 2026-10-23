package NewEjer.Ejercisio1;
/*13. Un programa que tras introducir una medida expresada en centímetros la
convierta en pulgadas (1 pulgada = 2,54 centímetros)*/

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ejercicio13 {
    static void main(){
        BigDecimal medida, pulgadas;
        boolean estado;
        do {
            estado = true;
            try {
                medida = new BigDecimal(JOptionPane.showInputDialog("INGRESE LOS CENTIMETROS"));
                if (medida.compareTo(new BigDecimal("0")) !=0){
                    pulgadas = medida.divide(new BigDecimal("2.54"),2 , RoundingMode.HALF_UP);
                    JOptionPane.showMessageDialog(null,"PULGADAS    " + pulgadas);
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "REPETIR ");
                estado = false;
            }
        }while (!estado);
    }
}
