package NewEjer.Ejercisio1;

import javax.swing.*;

public class Ejercicio7 {
    static void main(){
        boolean estado;
        int grados;
        do {
            estado = true;
            try {
                grados = Integer.parseInt(JOptionPane.showInputDialog("GRADOS F°"));
                if (grados !=0 ){
                    grados = (grados - 32) * 5 / 9;
                    String informacion  = "GRADOS C° " + grados;
                    JOptionPane.showMessageDialog(null, informacion);
                } else {
                    JOptionPane.showMessageDialog(null,"NO PUEDES PONER 0");
                    estado = false;
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"INGRESE LOS DATOS CORRECTAMENTE", "", JOptionPane.WARNING_MESSAGE);
                estado = false;
            }
        }while (!estado);
    }
}
