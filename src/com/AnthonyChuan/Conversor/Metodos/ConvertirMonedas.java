package com.AnthonyChuan.Conversor.Metodos;

import com.AnthonyChuan.Conversor.DAO.ConversorDAO;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertirMonedas {

    public ConversorDAO valorConversion(String moneda1,String moneda2){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/06f1afbf37f717e816e63533/pair/" + moneda1+"/"+moneda2);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),ConversorDAO.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Moneda no hallada");
        }
    }
}
