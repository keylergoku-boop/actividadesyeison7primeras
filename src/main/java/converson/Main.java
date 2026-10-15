package converson;

import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        datos dt = new datos();

        calculos cl = new calculos();

        double temperatura;
        double f;

        temperatura = Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA TEMPERATURA"));

        dt.setTemperatura(temperatura);

        f = cl.calCULITOS(dt.getTemperatura());

        dt.setFahrenheint(f);

        JOptionPane.showMessageDialog(null, "TEMPERATURA EN C°   " + dt.getTemperatura()
                + "\nFARENHEIT    " + dt.getFahrenheint());
    }
}
