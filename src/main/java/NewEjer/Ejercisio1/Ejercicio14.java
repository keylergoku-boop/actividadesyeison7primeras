package NewEjer.Ejercisio1;

import javax.swing.*;

/* 14. Un programa que exprese en horas, minutos y segundos un tiempo expresado
en segundos.*/
public class Ejercicio14 {
    static void main(){
        boolean estado;
        int entrada,horas, minutos, segundos;
        do {
            estado = true;
            try {
                entrada = Integer.parseInt(JOptionPane.showInputDialog("ingrese los segundos"));
                if (entrada !=0){
                    horas = entrada / 3600;
                    minutos = (entrada % 3600) / 60;
                    segundos = (entrada % 3600) % 60;

                    JOptionPane.showMessageDialog(null,"HR  " + horas
                    + "\nMN "+ minutos
                    + "\nSG "+ segundos);
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"repetir ciclo");
                estado = false;
            }
        }while (!estado);
    }
}
