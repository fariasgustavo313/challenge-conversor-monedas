package org.example.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    private final HttpClient client = HttpClient.newHttpClient();
    private static final String API_KEY = "42a653f9e08252dc353a4957"; // tu API key
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";

    public HttpRequest createRequest() {
        return HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .GET()
                .build();
    }

    public String getResponse(HttpRequest request) throws IOException, InterruptedException {
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
