package NewEjer.Ejercisio1;

import javax.swing.*;

/* 16. Desarrollar un algoritmo que dado el radio de un círculo calcule e imprima el
área.*/
public class Ejercicio16 {
    static void main(){
        int radio;
        float perimetro;
        boolean estado;
        do {
            estado = true;
            try {
                radio = Integer.parseInt(JOptionPane.showInputDialog("RADIO DEL CIRCULO"));
                if (radio !=0){
                    perimetro = (float) ((radio * 2) * 3.1416);
                    JOptionPane.showMessageDialog(null,"RADIO   " + radio
                    + "\nPERIMETRO  " + perimetro);
                } else {
                    JOptionPane.showMessageDialog(null,"COMO VA A SER EL RADIO 0");
                    estado = false;
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"RELLENA BIEN ESO, ES ESTOY ABURRIDO DE ESCRIBIR ESTO");
                estado = false;
            }
        }while (!estado);
    }
}
