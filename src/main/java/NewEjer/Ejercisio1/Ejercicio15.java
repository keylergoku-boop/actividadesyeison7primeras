package NewEjer.Ejercisio1;

import javax.swing.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/*15. Se desea saber cuál es el valor total para pagar de un artículo, sabiendo su valor
por unidad y la cantidad de artículos a llevar. Desarrollar un programa*/
public class Ejercicio15 {
    static void main() {
        boolean estado;
        byte opcion, cantidad;
        BigDecimal valorArticulo, total;
        DecimalFormat f = new DecimalFormat("#,###.##");

        do {
            estado = true;
            try {
                opcion = Byte.parseByte(JOptionPane.showInputDialog("""
                        WELCOME TO FEMENINE SEX
                        ---------------------------------------------------
                        BLISA                                       presioneN° 1 VALOR == (100.000)
                        TANGITA                                   presioneN° 2 VALOR == (200.000)
                        TANGITA MAS DESTAPADA presioneN° 3 VALOR == (300.000)
                        LANCERIA SETSI                      presioneN° 4 VALOR == (400.000)
                        ---------------------------------------------------"""));
                cantidad = Byte.parseByte(JOptionPane.showInputDialog("CANTIDAD DE PRENDAS"));

                if (opcion > 0 && opcion <=4 && cantidad > 0) {
                    valorArticulo = switch (opcion) {
                        case 1 -> new BigDecimal("100000");
                        case 2 -> new BigDecimal("200000");
                        case 3 -> new BigDecimal("300000");
                        default -> new BigDecimal("400000");
                    };

                    total = valorArticulo.multiply(BigDecimal.valueOf(cantidad));
                    JOptionPane.showMessageDialog(null, "PRENDA  " + opcion
                            + "\nCANTIDAD       " + cantidad
                            + "\nVALOR UNIDAD   " + f.format(valorArticulo)
                            + "\nTOTAL          " + f.format(total));
                } else {
                    JOptionPane.showMessageDialog(null,"LAS PRENDAS SON DE 1 AL 4 Y LA CANTIDAD NO PUEDE SER 0");
                    estado = false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DEBES COMPLETAR LOS CAMPOS CORRECTAMENTE"
                ,"WARNIG", JOptionPane.WARNING_MESSAGE);
                 estado = false;
            } catch (Exception e){
                System.out.println("ERROR DESCONOCIDO");
                estado  = false;
            }
        } while (!estado);
    }
}
