package TABLA;

import javax.swing.*;

/*
Solicitar un número entero N y generar su tabla de multiplicar del 1 al 10 utilizando un ciclo fijo.
Al finalizar, mostrar cuántos de los resultados obtenidos son números pares.*/
public class tablam {
    static void main(String[] args) {
        int n, resultado;
        n = Integer.parseInt(JOptionPane.showInputDialog("INGRESAR VALOR"));

        for (int i = 1; i <= 10; i++){
            resultado = n * i;
            System.out.println(resultado);
        }
    }
}
