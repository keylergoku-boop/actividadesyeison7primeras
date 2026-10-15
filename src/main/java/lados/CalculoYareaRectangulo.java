package lados;
/*Diseñar un algoritmo que solicite al usuario la base y la altura de un rectángulo calcule su área
y su perímetro, e imprima los resultados.*/

import javax.swing.*;


public class CalculoYareaRectangulo {
     static void main(String[] args) {
        int base;
        int altura, area, perimetro;
        Datos dt = new Datos();
        CalcularLados  calcular = new CalcularLados();

        base = Integer.parseInt(JOptionPane.showInputDialog("INGRESAR BASE"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("INGRESAR ALTURA"));

        dt.setBase(base);
        dt.setAltura(altura);

        area = calcular.calCULITOS(dt.getBase(), dt.getAltura());
        dt.setArea(area);

        perimetro = (dt.getAltura() + dt.getBase()) * 2;;


        JOptionPane.showMessageDialog(null,"BASE    " + base
        + "\nALTURA     " + altura
        + "\nAREA       " + dt.getArea()
        + "\nPERIMETRO  " + perimetro);

    }
}
