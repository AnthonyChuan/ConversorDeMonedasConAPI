package com.AnthonyChuan.Conversor.Modelos;

import com.AnthonyChuan.Conversor.DAO.ConversorDAO;

public class Conversor {
    private String moneda1;
    private String moneda2;
    private Double valorCambio;

    public Conversor() {
    }

    public Conversor(ConversorDAO conversorDAO) {
    this.moneda1=conversorDAO.base_code();
    this.moneda2=conversorDAO.target_code();
    this.valorCambio=conversorDAO.conversion_rate();
    }

    public String getMoneda1() {
        return moneda1;
    }

    public String getMoneda2() {
        return moneda2;
    }

    public Double getValorCambio() {
        return valorCambio;
    }

    public Double calculo(double valorCambiar){
        return valorCambiar*valorCambio;
    }
    @Override
    public String toString() {
        return "Conversor{" +
                "moneda1='" + moneda1 + '\'' +
                ", moneda2='" + moneda2 + '\'' +
                ", valorCambio=" + valorCambio +
                '}';
    }
}
