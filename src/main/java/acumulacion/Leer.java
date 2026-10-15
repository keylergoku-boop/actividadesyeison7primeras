package acumulacion;
/*Leer números mayores o iguales a cero acumulando su suma y contando la cantidad de
lecturas. El ciclo finaliza cuando se ingresa un valor negativo. Al terminar, calcular y mostrar la
suma total y el promedio. */

import javax.swing.*;

public class Leer {
    static void main(String[] arg) {
        int suma = 0, numero, promedio;
        int vueltas = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESAR NUMERO PARA SUMAR"));
            suma += numero;
            vueltas++;
            promedio = numero / vueltas;

            JOptionPane.showMessageDialog(null, "SUMA    " + suma
                    + "\nVueltas  " + vueltas
                    + "\nPROMEDIO " + promedio );
        } while (numero > 0);
    }
}
