package lados;

public class CalcularLados {

    public int calCULITOS (int lado1, int lado2){
        Datos dt = new Datos();

        int t  = lado1 * lado2;

        dt.setPerimetro(t);

        return dt.getPerimetro();
    }
}
