package NewEjer.Ejercisio1;
/* 9. Un programa que escribe el porcentaje descontado en una compra, introduciendo
por teclado el precio de la tarifa y el precio pagado.*/

import javax.swing.*;
import java.math.BigDecimal;

public class Ejercicio9 {
    static void main(){
        BigDecimal totalPagado, tarifa, pagado;
        boolean estado;
        do {
            estado = true;
            try {
                tarifa = new BigDecimal(JOptionPane.showInputDialog("INGRESE LA TARIFA"));
                totalPagado = new BigDecimal(JOptionPane.showInputDialog("INGRESE VALOR"));
                if (tarifa.compareTo(new BigDecimal("0")) !=0 && totalPagado.compareTo(new BigDecimal("0")) !=0){
                    pagado = totalPagado.subtract(tarifa);
                    JOptionPane.showMessageDialog(null,"TOOTAL  " + pagado
                    + "\nANTES DEL DESCUENTO " + totalPagado
                    + "\nVALOR TARIFA" + tarifa);
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"TOCA REPETIR");
                estado = false;
            }
        }while (!estado);
    }
}
