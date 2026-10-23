package NewEjer.Ejercisio1;
/*10. Un programa que reciba por teclado el precio de un artículo y calcule cual es el
valor pagado por el iva de ese artículo. */
import javax.swing.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;

public class Ejercicio10 {
    static void main(){
        DecimalFormat f = new DecimalFormat("#,###.###");
        boolean estado;
        BigDecimal valorArticulo, iva;
        do {
            estado = true;
            try {
                valorArticulo = new BigDecimal(JOptionPane.showInputDialog("PRECIO ARTICULO"));
                iva = valorArticulo.multiply(new BigDecimal("0.19"));
                valorArticulo = valorArticulo.subtract(iva);
                JOptionPane.showMessageDialog(null,"VALOR BRUTO     " + f.format(valorArticulo)
                + "\nIVA  " + f.format(iva)
                + "\nVALOR NETO   " + f.format(valorArticulo));
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"volviendo al ciclo");
                estado = false;
            }
        }while (!estado);
    }
}
