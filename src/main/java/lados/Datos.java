package lados;

public class Datos {
    private int base;
    private int altura;
    private int perimetro;
    private int area;

    public Datos() {
    }

    public Datos(int base, int altura, int perimetro, int area) {
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.area = area;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
