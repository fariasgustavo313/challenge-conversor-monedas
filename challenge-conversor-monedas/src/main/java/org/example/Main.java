package org.example;

import com.google.gson.Gson;
import org.example.api.ApiClient;
import org.example.model.*;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApiClient apiClient = new ApiClient();
        HttpRequest request = apiClient.createRequest();

        try {
            String json = apiClient.getResponse(request);
            Gson gson = new Gson();
            ExchangeRateResponse data = gson.fromJson(json, ExchangeRateResponse.class);

            List<Moneda> monedas = FiltroMonedas.filtrarMonedas(data.getConversion_rates());

            // Iniciar menú interactivo
            Menu menu = new Menu(monedas);
            menu.mostrarMenu();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al obtener datos de la API: " + e.getMessage());
        }
    }
}