package org.example.model;

public class Moneda {

    private String codigo;
    private double tasa;

    public Moneda(String codigo, double tasa) {
        this.codigo = codigo;
        this.tasa = tasa;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getTasa() {
        return tasa;
    }

    @Override
    public String toString() {
        return codigo + ": " + tasa;
    }
}
