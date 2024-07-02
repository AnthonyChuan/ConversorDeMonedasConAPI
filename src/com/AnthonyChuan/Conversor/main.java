package com.AnthonyChuan.Conversor;

import com.AnthonyChuan.Conversor.DAO.ConversorDAO;
import com.AnthonyChuan.Conversor.Metodos.ConvertirMonedas;

public class main {
    public static void main(String[] args) {
        ConvertirMonedas convertirMonedas = new ConvertirMonedas();

        ConversorDAO conversorDAO= convertirMonedas.determinarMoneda("PEN");
        System.out.println(conversorDAO);
    }
}
