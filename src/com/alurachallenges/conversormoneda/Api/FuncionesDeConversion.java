package com.alurachallenges.conversormoneda.Api;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FuncionesDeConversion {

    //Funciones de API
    public DatosDeRequest opcion1(double cantidadAConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2cbbbb289156c48eb7c81a06/pair/USD/ARS/" + cantidadAConvertir);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), DatosDeRequest.class);
    }

    public DatosDeRequest opcion2(double cantidadAConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2cbbbb289156c48eb7c81a06/pair/ARS/USD/" + cantidadAConvertir);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), DatosDeRequest.class);
    }

    public DatosDeRequest opcion3(double cantidadAConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2cbbbb289156c48eb7c81a06/pair/USD/BRL/" + cantidadAConvertir);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), DatosDeRequest.class);
    }

    public DatosDeRequest opcion4(double cantidadAConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2cbbbb289156c48eb7c81a06/pair/BRL/USD/" + cantidadAConvertir);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), DatosDeRequest.class);
    }

    public DatosDeRequest opcion5(double cantidadAConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2cbbbb289156c48eb7c81a06/pair/USD/COP/" + cantidadAConvertir);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), DatosDeRequest.class);
    }

    public DatosDeRequest opcion6(double cantidadAConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2cbbbb289156c48eb7c81a06/pair/COP/USD/" + cantidadAConvertir);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), DatosDeRequest.class);
    }
}

