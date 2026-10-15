package converson;

public class datos {
    private double temperatura;
    private double fahrenheint;

    public datos() {
    }

    public datos(double fahrenheint, double temperatura) {
        this.fahrenheint = fahrenheint;
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getFahrenheint() {
        return fahrenheint;
    }

    public void setFahrenheint(double fahrenheint) {
        this.fahrenheint = fahrenheint;
    }
}
