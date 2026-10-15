package calculadora;

import javax.swing.*;

public class ejercicio {
    static void main(String[] args) {
        int op, n1, n2, resultado = 0;
        op = Integer.parseInt(JOptionPane.showInputDialog("""
                WELCOME TO CALULATOR
                SUMAR        =1
                RESTAR       =2
                MULTIPLICAR  =3
                DIVIDIR      =4"""));
        n1 = Integer.parseInt(JOptionPane.showInputDialog("NUMERO1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("NUMERO2"));

        if (op >0 && op <=4){
            switch (op) {
                case 1:
                    resultado = n1 + n2;
                    break;
                case 2:
                    resultado = n1 - n2;
                    break;
                case 3:
                    resultado = n1 * n2;
                    break;
                case 4:
                    if (n1 >0 && n2 > 0){
                        resultado = n1 / n2;
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "mano acuerdese que no puede divir entre 0 poraque es" +
                                        "resulta en tragedia");
                    }
                    break;
                default:
            }

            JOptionPane.showMessageDialog(null,resultado);
        }
    }
}
