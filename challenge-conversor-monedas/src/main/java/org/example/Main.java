package org.example;

import org.example.api.ApiClient;

import java.io.IOException;
import java.net.http.HttpRequest;

public class Main {
    public static void main(String[] args) {

        ApiClient apiClient = new ApiClient();
        HttpRequest request = apiClient.createRequest();

        try {
            String response = apiClient.getResponse(request);
            System.out.println(response); // Probamos que todo funcione hasta acá
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
        }
    }
}