package NewEjer.Ejercisio1;

import javax.swing.*;

/*11. Un programa que pida por teclado dos números enteros y muestre su suma,
resta, multiplicación, división y el resto (módulo) de la división.*/
public class Ejercicio11 {
    static void main(){
        int n1,n2, suma, resta, multiplicacion;
        float division;
        boolean estado;
        do {
            estado = true;
            try {
                n1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO 1"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO 2"));
                if (n1 !=0 && n2 !=0){
                    suma = n1 + n2;
                    resta = n1 - n2;
                    multiplicacion = n1 * n2;
                    division = (float) n1 / n2;

                    JOptionPane.showMessageDialog(null, "SUMA   "+ suma
                    + "\nRESTA    " + resta
                    + "\nMULTIPLICACION   " + multiplicacion
                    + "\nDIVISION     " + division);
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"VOLVIENDO");
                estado = false;
            }
        }while (!estado);
    }
}
