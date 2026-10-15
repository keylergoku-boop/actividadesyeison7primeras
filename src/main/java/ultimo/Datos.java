package ultimo;

import java.math.BigDecimal;

public class Datos {
    private String titular;
    private BigDecimal saldo;
    private BigDecimal cantidad;

    public Datos() {
    }

    public Datos(String titular, BigDecimal saldo, BigDecimal cantidad) {
        this.titular = titular;
        this.saldo = saldo;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
}
