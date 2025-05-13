package org.example;

import com.google.gson.Gson;
import org.example.api.ApiClient;
import org.example.model.ExchangeRateResponse;

import java.io.IOException;
import java.net.http.HttpRequest;

public class Main {
    public static void main(String[] args) {

        ApiClient apiClient = new ApiClient();
        HttpRequest request = apiClient.createRequest();

        try {
            String json = apiClient.getResponse(request);
            Gson gson = new Gson();
            ExchangeRateResponse data = gson.fromJson(json, ExchangeRateResponse.class);

            System.out.println("Moneda base: " + data.getBase_code());
            System.out.println("Tasa ARS: " + data.getConversion_rates().get("ARS"));
            System.out.println("Tasa BRL: " + data.getConversion_rates().get("BRL"));
            System.out.println("Tasa CLP: " + data.getConversion_rates().get("CLP"));

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al obtener datos de la API: " + e.getMessage());
        }
    }
}