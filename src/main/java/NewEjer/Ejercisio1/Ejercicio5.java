package NewEjer.Ejercisio1;

import javax.swing.*;
/*Calcular el perímetro de un triángulo sabiendo los tres lados.*/
public class Ejercicio5 {
    static void main(){
        int grados;
        boolean repetir;
        do {
            try {
                repetir = true;
                grados = Integer.parseInt(JOptionPane.showInputDialog("GRADOS FARENHET"));
                if (grados !=0){
                    grados = (grados * 9) / (5) + 32;
                    String information = "GRADOS FARENHEIT  " + grados + "  F°";
                    JOptionPane.showMessageDialog(null,information);
                }
            }catch (NumberFormatException e){
             JOptionPane.showMessageDialog(null,"VOLVERAS A REPETIR EL FORMULARIO" +
                     "\nHASTA QUE LLENES CORRECTAMENTE LOS CAMPOS", "CAUTION", JOptionPane.WARNING_MESSAGE);
             repetir = false;
            }
        }while (!repetir);
    }
}
