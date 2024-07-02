package com.AnthonyChuan.Conversor;

import com.AnthonyChuan.Conversor.DAO.ConversorDAO;
import com.AnthonyChuan.Conversor.Metodos.ConvertirMonedas;
import com.AnthonyChuan.Conversor.Metodos.Decisiones;
import com.AnthonyChuan.Conversor.Modelos.Conversor;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ConvertirMonedas convertirMonedas = new ConvertirMonedas();
        Scanner teclado = new Scanner(System.in);
        int valorcambiar;
        Decisiones decisiones=new Decisiones();
        String mon1;
        String  mon2;
        decisiones.ingreseValorACambiar();
        valorcambiar=teclado.nextInt();
        decisiones.imprimirMenu();
        System.out.println("Ingrese moneda por cambiar: ");
        mon1= teclado.next();
        System.out.println("Ingrese moneda de cambio: ");
        mon2= teclado.next();
        String moneda1= decisiones.moneda1(mon1);
        String moneda2=decisiones.moneda2(mon2);
        ConversorDAO conversorDAO= convertirMonedas.valorConversion(moneda1,moneda2);
        Conversor conversor1=new Conversor(conversorDAO);
        System.out.println(conversor1);
        System.out.println(conversor1.calculo(valorcambiar));
    }
}
