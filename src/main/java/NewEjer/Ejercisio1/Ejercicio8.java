package NewEjer.Ejercisio1;

import javax.swing.*;

/* 8. Un programa que lea el valor correspondiente a una distancia en millas marinas
y las escribas expresadas en metros. Sabiendo que 1 milla marina equivale a 1852
metros.*/
public class Ejercicio8 {
    static void main(){
        boolean estado;
        int distancia;
        do {
            estado = true;
            try {
                distancia = Integer.parseInt(JOptionPane.showInputDialog("METROS"));
                if (distancia != 0 ){
                    distancia = distancia * 1852;
                    String informacion  = "MILLAS:  " + distancia;
                    JOptionPane.showMessageDialog(null,informacion);
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"REPITA CORRECTAMENTE");
                estado = false;
            }
        }while (!estado);
    }
}
