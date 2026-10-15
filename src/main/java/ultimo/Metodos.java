package ultimo;

import javax.swing.*;
import java.math.BigDecimal;

/*y métodos públicos depositar, retirar
(validando fondos suficientes) y consultarSaldo. Crear una clase ejecutable con el método main que
instancie un objeto y pruebe las operaciones.*/
public class Metodos {
    Datos n = new Datos();

    public void depositarsaldo(String t, BigDecimal s) {
        n.setTitular(t);
        n.setSaldo(s);
        JOptionPane.showMessageDialog(null, "deposito correcto");
    }

    public void consultarsaldo() {
        JOptionPane.showMessageDialog(null, "CONSULTANDO    " + n.getSaldo());
    }

    public void retirarCulitos(BigDecimal x) {

        try {
            System.out.println("llego retirar");

            if (x.compareTo(new BigDecimal("0")) > 0) {

                System.out.println("entro condicional");

                n.setCantidad(x);

                if (n.getCantidad().compareTo(n.getSaldo()) <= 0) {

                    BigDecimal restante = n.getSaldo().subtract(n.getCantidad());
                    System.out.println( "restante   " + restante);
                    n.setSaldo(restante);

                    JOptionPane.showMessageDialog(null, "saldo" + n.getSaldo());
                }
            } else {
                JOptionPane.showMessageDialog(null, "FONDOS INSUFICIENTES", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "PARECE QUE INTENTARON MANDAR TEXTO O VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "eroror de no referencia existente", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
