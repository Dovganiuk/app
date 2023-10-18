package org.example.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Response;

import java.io.IOException;

public class HttpResponse {
    //    Об'єкт, в якому є методи, і який дозволяє нам переганяти зі String в якийсь клас
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Response response;

    public HttpResponse(Response response) {
        this.response = response;
    }

    public String json() {
        try {
            return response.body() .string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T json(Class<T> tClass) {
        String responseBody = json();

//          Перетворення тексту в Java об'єкт
        try {
            return objectMapper.readValue(responseBody, tClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
