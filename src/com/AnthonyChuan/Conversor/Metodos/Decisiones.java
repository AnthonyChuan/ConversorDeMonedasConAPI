package com.AnthonyChuan.Conversor.Metodos;

public class Decisiones {

    public String moneda1(String mon1){
        switch (mon1){
            case "1":
                mon1= "USD";
                break;
            case "2":
                mon1="PEN";
                break;
            case "3":
                mon1="ARS";
                break;
            case "4":
                mon1="COP";
                break;
            default:
                return mon1;
        }

        return mon1;
    }
    public String moneda2(String mon2){
        switch (mon2){
            case "1":
                mon2= "USD";
                break;
            case "2":
                mon2= "PEN";
                break;
            case "3":
                mon2= "ARS";
                break;
            case "4":
                mon2= "COP";
                break;
            default:
                return mon2;
        }
            return mon2;

    }
    public void imprimirMenu(){
        System.out.println("******************************************************************************\n"
                +"    Menu de monedas \n"
                +"1- USD(Dolares Americanos)\n"
                +"2- PEN(Soles peruanos)\n"
                +"3- ARS(Pesos Argentinos)\n"
                +"4- COP(Pesos Colombianos)\n"
                +"Si no encuentras la moneda que quieres cambiar ingresala bajo el mismo formato\n"
                +"******************************************************************************");
    }
    public void ingreseValorACambiar(){
        System.out.println("Ingrese el valor que desea cambiar");
    }
}
